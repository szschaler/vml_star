package uk.ac.lancs.comp.vmlstar.lang_inst.popup.actions;

import hub.sam.tef.Utilities;
import hub.sam.tef.modelcreating.IModelCreatingContext;
import hub.sam.tef.modelcreating.ModelCreating;
import hub.sam.tef.modelcreating.ModelCreatingContext;
import hub.sam.tef.modelcreating.ModelCreatingException;
import hub.sam.tef.semantics.AbstractError;
import hub.sam.tef.semantics.DefaultIdentificationScheme;
import hub.sam.tef.semantics.DefaultSemanticsProvider;
import hub.sam.tef.tsl.Syntax;
import hub.sam.tef.tsl.TslException;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.commons.util.StringProperties;
import org.eclipse.epsilon.egl.EglModule;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import uk.ac.lancs.comp.vmlLangInst.LangInstModel;
import uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage;
import uk.ac.lancs.comp.vmlstar.lang_inst.Activator;
import uk.ac.lancs.comp.vmlstar.lang_inst.ILangInstConstants;

public class GenerateVMLInstanceAction implements IObjectActionDelegate,
    ILangInstConstants {

  private Shell shell;
  private ISelection selection;
  private IFolder srcFolder;
  private IFolder outFolder;
  private IFolder resourcesFolder;
  private IJavaProject javaProject;

  /**
   * Constructor for Action1.
   */
  public GenerateVMLInstanceAction() {
    super();
  }

  /**
   * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
   */
  public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    shell = targetPart.getSite().getShell();
  }

  /**
   * @see IActionDelegate#run(IAction)
   */
  public void run(IAction action) {
    if (selection instanceof IStructuredSelection) {
      for (Iterator<?> i = ((IStructuredSelection) selection).iterator(); i
          .hasNext();) {
        Object o = i.next();
        if (o instanceof IFile) {
          IFile file = (IFile) o;
          if (file.getFileExtension().startsWith("vmlinst"))
            process(file);
        }
      }
    }
  }

  private void process(final IFile file) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        public void run(IProgressMonitor monitor)
            throws InvocationTargetException, InterruptedException {
          doProcess(file, monitor);
        }
      };
      PlatformUI.getWorkbench().getProgressService().busyCursorWhile(runnable);
    }
    catch (InvocationTargetException e) {
      e.getTargetException().printStackTrace();
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private void doProcess(IFile file, IProgressMonitor monitor) {
    try {
      SubMonitor progress = SubMonitor.convert(monitor, 100);

      // Switch off auto-building, as this seems to always create
      // OutOfMemoryExceptions.
      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceDescription description = workspace.getDescription();
      boolean fAutoBuildWasOn = description.isAutoBuilding();
      if (fAutoBuildWasOn) {
        try {
          description.setAutoBuilding(false);
          workspace.setDescription(description);
        }
        catch (CoreException ce) {
          System.err
              .println("Unable to switch off auto building. Will continue with autobuilding enabled.");
          ce.printStackTrace();
        }
      }

      String srcProjectName = file.getFullPath().segment(0);

      LangInstModel lim = parse(file, progress.newChild(20));
      Resource limResource = putInResource(lim);

      IProject project = createProject(lim, progress.newChild(5));

      generateLanguageInstance(project, lim, limResource, srcProjectName,
          progress.newChild(30));

      configurePlugin(project, lim, limResource, progress.newChild(20));

      // Set AutoBuild back to what it was...
      if (fAutoBuildWasOn) {
        try {
          description.setAutoBuilding(true);
          workspace.setDescription(description);
        }
        catch (CoreException ce) {
          System.err.println("Unable to switch auto building back on.");
          ce.printStackTrace();
        }
      }

    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void configurePlugin(IProject project, LangInstModel lim,
      Resource limResource, SubMonitor progress) throws CoreException,
      EglRuntimeException, IOException {
    IFolder metaFolder = project.getFolder("/META-INF");
    IFile manifestMFFile = project.getFile("/META-INF/MANIFEST.MF");
    IFile pluginXMLFile = project.getFile("/plugin.xml");
    if (!metaFolder.exists())
      metaFolder.create(true, true, progress.newChild(5));

    // Create MANIFEST.MF
    if (manifestMFFile.exists()) {
      manifestMFFile.setContents(new ByteArrayInputStream(generateManifestMF(
          project, limResource, progress.newChild(3)).getBytes()), true, true,
          progress.newChild(2));
    }
    else {
      manifestMFFile.create(new ByteArrayInputStream(generateManifestMF(
          project, limResource, progress.newChild(3)).getBytes()), true,
          progress.newChild(2));
    }

    // Create plugin.xml
    if (pluginXMLFile.exists()) {
      pluginXMLFile.setContents(new ByteArrayInputStream(generatePluginXml(
          limResource, progress.newChild(3)).getBytes()), true, true, progress
          .newChild(2));
    }
    else {
      pluginXMLFile.create(new ByteArrayInputStream(generatePluginXml(
          limResource, progress.newChild(3)).getBytes()), true, progress
          .newChild(2));
    }

    // Copy over prepared build.properties file
    IFile targetBuildFile = project.getFile("/build.properties");
    InputStream isSourceBuildFile = FileLocator.openStream(Activator
        .getDefault().getBundle(), new Path("/resources/vml_build.properties"),
        false);
    targetBuildFile.create(isSourceBuildFile, true, progress.newChild(5));

  }

  private String generatePluginXml(Resource limResource, SubMonitor progress)
      throws IOException, EglRuntimeException {
    EglModule module = new EglModule();
    try {
      URL eglURL = FileLocator.toFileURL(FileLocator.find(Activator
          .getDefault().getBundle(), new Path("transformation/LIM2Plugin.egl"),
          null));
      java.net.URI eglURI = java.net.URI.create(eglURL.toString());
      module.parse(eglURI);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new RuntimeException("Parse Problems.");
      }

      // Attach the LanguageInstanceModel
      InMemoryEmfModel limModel = new InMemoryEmfModel("LIM", limResource,
          VmlLangInstPackage.eINSTANCE);
      module.getContext().getModelRepository().addModel(limModel);

      module.execute();

      return module.getContext().getOutputBuffer().toString();
    }
    finally {
      module.getContext().getModelRepository().dispose();
      progress.done();
    }
  }

  private String generateManifestMF(IProject project, Resource limResource,
      SubMonitor progress) throws IOException, EglRuntimeException {
    EglModule module = new EglModule();
    try {
      URL eglURL = FileLocator.toFileURL(FileLocator.find(Activator
          .getDefault().getBundle(),
          new Path("transformation/LIM2MANIFEST.egl"), null));
      java.net.URI eglURI = java.net.URI.create(eglURL.toString());
      module.parse(eglURI);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new RuntimeException("Parse Problems.");
      }

      // Attach the LanguageInstanceModel
      InMemoryEmfModel limModel = new InMemoryEmfModel("LIM", limResource,
          VmlLangInstPackage.eINSTANCE);
      module.getContext().getModelRepository().addModel(limModel);

      // Also communicate the name of the originating project.
      module.getContext().getFrameStack().put(
          Variable.createReadOnlyVariable("srcProject", project.getName()));

      module.execute();

      return module.getContext().getOutputBuffer().toString();
    }
    finally {
      module.getContext().getModelRepository().dispose();
      progress.done();
    }
  }

  /**
   * Generate all files for the specified language instance.
   * 
   * @param project
   * @param lim
   * @param progress
   * @throws Exception
   */
  private void generateLanguageInstance(IProject project, LangInstModel lim,
      Resource limResource, String srcProjectName, SubMonitor progress)
      throws Exception {
    generateEcore(project, lim, limResource, progress.newChild(5));
    generateGenModel(project, lim, srcProjectName, progress.newChild(5));
    generateSyntax(project, lim, limResource, progress.newChild(5));
    generateEditor(project, lim, limResource, progress.newChild(5));
  }

  private void generateEditor(IProject project, LangInstModel lim,
      Resource limResource, SubMonitor progress) throws IOException,
      EglRuntimeException, CoreException {
    generateTextEditor(project, lim, limResource, progress);
    generateReferenceResolution(project, lim, limResource, progress);
  }

  private void generateTextEditor(IProject project, LangInstModel lim,
      Resource limResource, SubMonitor progress) throws IOException,
      EglRuntimeException, CoreException {
    EglModule module = new EglModule();
    try {
      URL eglURL = FileLocator.toFileURL(FileLocator.find(Activator
          .getDefault().getBundle(), new Path(
          "transformation/LanguageInstanceModel2TextEditor.egl"), null));
      java.net.URI eglURI = java.net.URI.create(eglURL.toString());
      module.parse(eglURI);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new RuntimeException("Parse Problems.");
      }

      // Attach the LanguageInstanceModel
      InMemoryEmfModel limModel = new InMemoryEmfModel("LIM", limResource,
          VmlLangInstPackage.eINSTANCE);
      module.getContext().getModelRepository().addModel(limModel);

      module.execute();

      // Write generation result to file
      String sGenerated = module.getContext().getOutputBuffer().toString();
      javaProject.findPackageFragmentRoot(
          new Path("/" + project.getName() + "/src")).createPackageFragment(
          "uk.ac.lancs.comp.vml." + lim.getName(), false, progress.newChild(1));
      IFolder editorFolder = srcFolder.getFolder(new Path(
          "uk/ac/lancs/comp/vml/" + lim.getName()));
      IFile editorFile = editorFolder.getFile("TextEditor.java");
      editorFile.create(new ByteArrayInputStream(sGenerated.getBytes()), true,
          progress.newChild(5));
    }
    finally {
      module.getContext().getModelRepository().dispose();
      progress.done();
    }
  }

  private void generateReferenceResolution(IProject project, LangInstModel lim,
      Resource limResource, SubMonitor progress) throws IOException,
      EglRuntimeException, CoreException {
    EglModule module = new EglModule();
    try {
      URL eglURL = FileLocator.toFileURL(FileLocator.find(Activator
          .getDefault().getBundle(), new Path(
          "transformation/LIM2FeatureReferenceResolutionSemantics.egl"), null));
      java.net.URI eglURI = java.net.URI.create(eglURL.toString());
      module.parse(eglURI);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new RuntimeException("Parse Problems.");
      }

      // Attach the LanguageInstanceModel
      InMemoryEmfModel limModel = new InMemoryEmfModel("LIM", limResource,
          VmlLangInstPackage.eINSTANCE);
      module.getContext().getModelRepository().addModel(limModel);

      module.execute();

      // Write generation result to file
      String sGenerated = module.getContext().getOutputBuffer().toString();
      javaProject.findPackageFragmentRoot(
          new Path("/" + project.getName() + "/src")).createPackageFragment(
          "uk.ac.lancs.comp.vml." + lim.getName(), false, progress.newChild(1));
      IFolder editorFolder = srcFolder.getFolder(new Path(
          "uk/ac/lancs/comp/vml/" + lim.getName()));
      IFile rrFile = editorFolder
          .getFile("FeatureReferenceResolutionSemantics.java");
      rrFile.create(new ByteArrayInputStream(sGenerated.getBytes()), true,
          progress.newChild(5));
    }
    finally {
      module.getContext().getModelRepository().dispose();
      progress.done();
    }
  }

  private void generateSyntax(IProject project, LangInstModel lim,
      Resource limResource, SubMonitor progress) throws IOException,
      EglRuntimeException, CoreException {
    EglModule module = new EglModule();
    try {
      URL eglURL = FileLocator.toFileURL(FileLocator.find(Activator
          .getDefault().getBundle(), new Path(
          "transformation/LanguageInstanceModel2ETSLT.egl"), null));
      java.net.URI eglURI = java.net.URI.create(eglURL.toString());
      module.parse(eglURI);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new RuntimeException("Parse Problems.");
      }

      // Attach the LanguageInstanceModel
      InMemoryEmfModel limModel = new InMemoryEmfModel("LIM", limResource,
          VmlLangInstPackage.eINSTANCE);
      module.getContext().getModelRepository().addModel(limModel);

      module.execute();

      // Write generation result to file
      String sGenerated = module.getContext().getOutputBuffer().toString();
      IFile syntaxFile = resourcesFolder.getFile(lim.getName() + ".etslt");
      syntaxFile.create(new ByteArrayInputStream(sGenerated.getBytes()), true,
          progress.newChild(5));
    }
    finally {
      module.getContext().getModelRepository().dispose();
      progress.done();
    }
  }

  /**
   * Generate a Gen model for the ecore file generated just previously. Also use
   * this gen model to generate code for the new language instance.
   * 
   * @param project
   * @param lim
   * @param progress
   * @throws Exception
   */
  private void generateGenModel(IProject project, LangInstModel lim,
      String srcProjectName, SubMonitor progress) throws Exception {
    try {
      // Much of the code below copied and adjusted from
      // org.eclipse.emf.codegen.ecore.Generator#run

      // Create a GenModel
      IPath pEcorePath = resourcesFolder.getFile(lim.getName() + ".ecore")
          .getFullPath();
      String sBasePackage = project.getName() + ".model";
      String prefix = lim.getName();

      ResourceSet resourceSet = new ResourceSetImpl();
      resourceSet.getURIConverter().getURIMap().putAll(
          EcorePlugin.computePlatformURIMap());
      URI ecoreURI = URI.createFileURI(pEcorePath.toString());
      Resource resource = resourceSet.getResource(ecoreURI, true);
      EPackage ePackage = (EPackage) resource.getContents().get(0);

      IPath genModelPath = pEcorePath.removeFileExtension().addFileExtension(
          "genmodel");

      progress.beginTask("", 2);
      progress.subTask("Creating " + genModelPath);

      URI genModelURI = URI.createFileURI(genModelPath.toString());
      Resource genModelResource = Resource.Factory.Registry.INSTANCE
          .getFactory(genModelURI).createResource(genModelURI);
      GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
      genModelResource.getContents().add(genModel);
      resourceSet.getResources().add(genModelResource);

      String sModelDirectory = "/" + sBasePackage + "/src";
      genModel.setModelDirectory(sModelDirectory);
      genModel.getForeignModel().add(pEcorePath.toString());
      genModel.initialize(Collections.singleton(ePackage));
      GenPackage genPackage = genModel.getGenPackages().get(0);

      String genModelName = genModelURI.trimFileExtension().lastSegment();
      genModel.setModelName(genModelName);
      genModel.setModelPluginID(sBasePackage);

      genModel.setCodeFormatting(true);
      genModel.setDynamicTemplates(true);

      // Make sure the model plugin has a dependency to the original source
      // plugin so that users can simply put extension classes in their source
      // plugin
      genModel.getModelPluginVariables().add(srcProjectName);

      /*
       * Make sure code generation uses our own templates where needed.
       * 
       * Stupidly, EMF requires the path to templates to be relative to the
       * workspace. Hence, we need to actually copy the files.
       */
      // genModel.setTemplateDirectory
      // ("platform:/plugin/uk.ac.lancs.comp.vmlstar.lang_inst/templates");
      genModel.setTemplateDirectory("/" + project.getName() + "/templates");
      IFolder templateFolder = project.getFolder("templates");
      if (!templateFolder.exists()) {
        templateFolder.create(false, false, progress.newChild(1));
      }
      templateFolder = templateFolder.getFolder("model");
      if (!templateFolder.exists()) {
        templateFolder.create(false, false, progress.newChild(1));
      }
      templateFolder = templateFolder.getFolder("Class");
      if (!templateFolder.exists()) {
        templateFolder.create(false, false, progress.newChild(1));
      }
      String[] saFiles = new String[] { "insert.javajetinc",
          "setGenFeature.post.insert.javajetinc" };
      for (String sFile : saFiles) {
        IFile templateFile = templateFolder.getFile(sFile);
        URL urlSourceTemplate = FileLocator.toFileURL(FileLocator.find(
            Activator.getDefault().getBundle(), new Path(
                "templates/model/Class/" + sFile), null));
        templateFile.create(urlSourceTemplate.openStream(), true, progress
            .newChild(2));
      }

      genPackage.setPrefix(prefix);
      genPackage.setBasePackage(sBasePackage);

      progress.worked(1);

      genModelResource.save(Collections.EMPTY_MAP);

      progress.done();

      // Now try and generate some code from this :-)
      progress.beginTask("Generating " + genModelName, 2);

      IStatus status = genModel.validate();
      if (!status.isOK()) {
        System.err.println(status);
        throw new Exception("Couldn't validate GenModel");
      }

      // TODO This is where we should be able to do adaptations so that
      // our special code gets generated...
      // It would seem that the easiest way to do this is to provide customised
      // templates (based on the original templates from
      // platform:/plugin/org.eclipse.emf.codegen.ecore/templates/ in some
      // directory and then to specify the path to that directory in
      // genModel.templateDirectory, probably also setting
      // genModel.dynamicTemplates to true.
      org.eclipse.emf.codegen.ecore.generator.Generator gen = new org.eclipse.emf.codegen.ecore.generator.Generator();
      gen.setInput(genModel);

      genModel.setCanGenerate(true);

      /*
       * TODO: This may turn out to be useful... if (profileFile != null) {
       * Map<String, String> options =
       * CodeFormatterProfileParser.parse(profileFile); if (options == null) {
       * throw new CoreException (new Status (IStatus.ERROR,
       * CodeGenEcorePlugin.getPlugin().getBundle().getSymbolicName(), 0,
       * "Unable to read profile file: '" + profileFile + "'", null)); }
       * gen.getOptions().codeFormatterOptions = options;
       * 
       * }
       */

      gen.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
          CodeGenUtil.EclipseUtil.createMonitor(progress, 1));
      gen.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
          CodeGenUtil.EclipseUtil.createMonitor(progress, 1));
    }
    finally {
      progress.done();
    }
  }

  /**
   * Generate the ecore file containing the complete metamodel for the specified
   * language instance.
   * 
   * @param project
   * @param lim
   * @param newChild
   * @throws Exception
   */
  private void generateEcore(IProject project, LangInstModel lim,
      Resource limResource, SubMonitor progress) throws Exception {
    // TODO Once I figure out how to properly do references between models,
    // this
    // should really reference the core VML metamodel.
    // For now, we will just generate this along.
    EtlModule module = new EtlModule();
    try {
      URL etlURL = FileLocator.toFileURL(FileLocator.find(Activator
          .getDefault().getBundle(), new Path(
          "transformation/VMLLangInst2ECore.etl"), null));
      java.net.URI etlURI = java.net.URI.create(etlURL.toString());
      module.parse(etlURI);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new RuntimeException("Parse Problems.");
      }

      StringProperties properties;

      // Attach the LanguageInstanceModel
      InMemoryEmfModel limModel = new InMemoryEmfModel("LIM", limResource,
          VmlLangInstPackage.eINSTANCE);
      module.getContext().getModelRepository().addModel(limModel);

      // Attach the VML core model
      module.getContext().getModelRepository().addModel(
          uk.ac.lancs.comp.vmlstar.Activator.getVMLEmfModel("VML"));

      // Attach target model
      // Create target model file
      EmfModel target = new EmfModel();
      properties = new StringProperties();
      properties.put(EmfModel.PROPERTY_NAME, "target");
      properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
      properties.put(EmfModel.PROPERTY_METAMODEL_URI, EcorePackage.eNS_URI);
      properties.put(EmfModel.PROPERTY_MODEL_FILE, resourcesFolder.getFile(
          lim.getName() + ".ecore").getFullPath().toOSString());
      properties.put(EmfModel.PROPERTY_READONLOAD, "false");
      properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, "true");
      target.load(properties, ResourcesPlugin.getWorkspace().getRoot()
          .getRawLocation().toPortableString());
      module.getContext().getModelRepository().addModel(target);

      module.execute();
    }
    finally {
      module.getContext().getModelRepository().dispose();
      progress.done();
    }
  }

  private Resource putInResource(EObject eObject) {
    ResourceSet rs = new ResourceSetImpl();
    EPackage ePackage = eObject.eClass().getEPackage();
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
        new XMIResourceFactoryImpl());
    rs.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
    Resource r = rs.createResource(URI.createFileURI("foo"));
    r.getContents().add(eObject);
    return r;
  }

  /**
   * Generate a new project structure based on the {@see LangInstModel}. The new
   * project will initially be an empty plugin project.
   * 
   * @param lim
   * @return the reference to the newly created project.
   * @throws CoreException
   */
  private IProject createProject(LangInstModel lim, SubMonitor progress)
      throws CoreException {
    String sProjectName = "uk.ac.lancs.comp.vml." + lim.getName();

    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(
        sProjectName);

    if (!project.exists()) {
      project.create(progress.newChild(10));
    }

    project.open(progress.newChild(10));

    IProjectDescription description = project.getDescription();
    description.setNatureIds(new String[] { JavaCore.NATURE_ID,
        "org.eclipse.pde.PluginNature" });

    ICommand command1 = description.newCommand();
    command1.setBuilderName("org.eclipse.jdt.core.javabuilder");

    ICommand command2 = description.newCommand();
    command2.setBuilderName("org.eclipse.pde.ManifestBuilder");

    ICommand command3 = description.newCommand();
    command3.setBuilderName("org.eclipse.pde.SchemaBuilder");

    description.setBuildSpec(new ICommand[] { command1, command2, command3 });

    project.setDescription(description, null);

    srcFolder = project.getFolder("/src");
    if (!srcFolder.exists()) {
      srcFolder.create(true, true, progress.newChild(5));
    }
    outFolder = project.getFolder("/bin");
    if (!outFolder.exists()) {
      outFolder.create(true, true, progress.newChild(5));
    }
    resourcesFolder = project.getFolder("/resources");
    if (!resourcesFolder.exists()) {
      resourcesFolder.create(true, true, progress.newChild(5));
    }

    javaProject = JavaCore.create(project);
    javaProject.setRawClasspath(new IClasspathEntry[] {
        JavaCore.newSourceEntry(srcFolder.getFullPath()),
        JavaRuntime.getJREVariableEntry(),
        JavaCore.newContainerEntry(new Path(
            "org.eclipse.pde.core.requiredPlugins")) },
        outFolder.getFullPath(), progress.newChild(5));

    return project;
  }

  /**
   * Parse the given file into a {@see LangInstModel}.
   * 
   * @param file
   * @return
   * @throws VMLInstParsingException
   */
  private LangInstModel parse(IFile file, SubMonitor progress)
      throws VMLInstParsingException {
    try {
      String text;
      try {
        BufferedReader r = new BufferedReader(new InputStreamReader(file
            .getContents()));
        StringBuffer sbText = new StringBuffer();
        String sLine;
        do {
          sLine = r.readLine();
          if (sLine != null) {
            sbText.append(sLine);
            sbText.append("\n");
          }
        }
        while (sLine != null);
        text = sbText.toString();
      }
      catch (Exception e) {
        throw new VMLInstParsingException(e.getMessage(), e);
      }

      IModelCreatingContext context = new ModelCreatingContext(epaMetamodels,
          new DefaultSemanticsProvider(DefaultIdentificationScheme.INSTANCE),
          new ResourceImpl(), text);

      EObject eoLangInstModel;

      try {
        Syntax sSyntax = Utilities.loadSyntaxDescription(bSyntaxBundle,
            sSyntaxPath, epaMetamodels);

        eoLangInstModel = ModelCreating.createModelFromText(context, sSyntax);
      }
      catch (TslException te) {
        throw new VMLInstParsingException(te.getMessage(), te);
      }
      catch (ModelCreatingException e) {
        throw new VMLInstParsingException(e.getMessage(), e);
      }

      // Check for any errors that might have occurred...
      VMLInstParsingException except = null;
      for (AbstractError error : context.getErrors()) {
        if (except == null) {
          except = new VMLInstParsingException();
        }

        except.add(error, context);
      }
      if (except != null) {
        throw except;
      }

      if ((eoLangInstModel != null)
          && (eoLangInstModel instanceof LangInstModel)) {
        return (LangInstModel) eoLangInstModel;
      }
      else {
        throw new VMLInstParsingException(
            "Parsing did not result in a language instance model.");
      }
    }
    finally {
      progress.done();
    }
  }

  /**
   * @see IActionDelegate#selectionChanged(IAction, ISelection)
   */
  public void selectionChanged(IAction action, ISelection selection) {
    this.selection = selection;
  }

}