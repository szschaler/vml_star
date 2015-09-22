package uk.ac.lancs.comp.vmlstar;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.epsilon.commons.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "uk.ac.lancs.comp.vmlstar";

  // The shared instance
  private static Activator plugin;

  /**
   * The constructor
   */
  public Activator() {
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
   * )
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
   * )
   */
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  /**
   * Returns the shared instance
   * 
   * @return the shared instance
   */
  public static Activator getDefault() {
    return plugin;
  }

  /**
   * Construct and return an EMF model for vml.ecore.
   * 
   * @param sName
   * @return
   * @throws EolModelLoadingException
   * @throws IOException
   */
  public static EmfModel getVMLEmfModel(String sName)
      throws EolModelLoadingException, IOException {

    URL vmlURL = FileLocator.toFileURL(FileLocator.find(plugin.getBundle(), new Path(
        "resources/vml.ecore"), null));
     
    EmfModel vml = new EmfModel();
    StringProperties properties = new StringProperties();
    properties.put(EmfModel.PROPERTY_NAME, sName);
    properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
    properties.put(EmfModel.PROPERTY_METAMODEL_URI, EcorePackage.eNS_URI);
    properties.put(EmfModel.PROPERTY_MODEL_FILE, vmlURL.getPath());
    properties.put(EmfModel.PROPERTY_READONLOAD, "true");
    properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, "false");
    vml.load(properties, null);
    return vml;
  }

}
