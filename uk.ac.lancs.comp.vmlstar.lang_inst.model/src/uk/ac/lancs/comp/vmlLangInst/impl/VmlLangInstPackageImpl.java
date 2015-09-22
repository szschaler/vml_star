/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.lancs.comp.vmlLangInst.ActionDescriptor;
import uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter;
import uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor;
import uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter;
import uk.ac.lancs.comp.vmlLangInst.LangInstModel;
import uk.ac.lancs.comp.vmlLangInst.VmlLangInstFactory;
import uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmlLangInstPackageImpl extends EPackageImpl implements VmlLangInstPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass langInstModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureModelAdapterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coreModelAdapterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionDescriptorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass designatorDescriptorEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VmlLangInstPackageImpl() {
    super(eNS_URI, VmlLangInstFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VmlLangInstPackage init() {
    if (isInited) return (VmlLangInstPackage)EPackage.Registry.INSTANCE.getEPackage(VmlLangInstPackage.eNS_URI);

    // Obtain or create and register package
    VmlLangInstPackageImpl theVmlLangInstPackage = (VmlLangInstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof VmlLangInstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new VmlLangInstPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVmlLangInstPackage.createPackageContents();

    // Initialize created meta-data
    theVmlLangInstPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVmlLangInstPackage.freeze();

    return theVmlLangInstPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLangInstModel() {
    return langInstModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLangInstModel_Name() {
    return (EAttribute)langInstModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLangInstModel_Fma() {
    return (EReference)langInstModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLangInstModel_Cma() {
    return (EReference)langInstModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLangInstModel_Actions() {
    return (EReference)langInstModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLangInstModel_Designators() {
    return (EReference)langInstModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureModelAdapter() {
    return featureModelAdapterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureModelAdapter_AdapterClass() {
    return (EAttribute)featureModelAdapterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureModelAdapter_AdapterOperation() {
    return (EAttribute)featureModelAdapterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoreModelAdapter() {
    return coreModelAdapterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoreModelAdapter_AdapterClass() {
    return (EAttribute)coreModelAdapterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoreModelAdapter_AdapterOperation() {
    return (EAttribute)coreModelAdapterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionDescriptor() {
    return actionDescriptorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionDescriptor_Name() {
    return (EAttribute)actionDescriptorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionDescriptor_NumParams() {
    return (EAttribute)actionDescriptorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionDescriptor_EvaluatorClass() {
    return (EAttribute)actionDescriptorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionDescriptor_EvaluatorMethod() {
    return (EAttribute)actionDescriptorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionDescriptor_CheckMethod() {
    return (EAttribute)actionDescriptorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesignatorDescriptor() {
    return designatorDescriptorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesignatorDescriptor_Name() {
    return (EAttribute)designatorDescriptorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesignatorDescriptor_NumParams() {
    return (EAttribute)designatorDescriptorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesignatorDescriptor_EvaluatorClass() {
    return (EAttribute)designatorDescriptorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesignatorDescriptor_EvaluatorMethod() {
    return (EAttribute)designatorDescriptorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesignatorDescriptor_CheckMethod() {
    return (EAttribute)designatorDescriptorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlLangInstFactory getVmlLangInstFactory() {
    return (VmlLangInstFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    langInstModelEClass = createEClass(LANG_INST_MODEL);
    createEAttribute(langInstModelEClass, LANG_INST_MODEL__NAME);
    createEReference(langInstModelEClass, LANG_INST_MODEL__FMA);
    createEReference(langInstModelEClass, LANG_INST_MODEL__CMA);
    createEReference(langInstModelEClass, LANG_INST_MODEL__ACTIONS);
    createEReference(langInstModelEClass, LANG_INST_MODEL__DESIGNATORS);

    featureModelAdapterEClass = createEClass(FEATURE_MODEL_ADAPTER);
    createEAttribute(featureModelAdapterEClass, FEATURE_MODEL_ADAPTER__ADAPTER_CLASS);
    createEAttribute(featureModelAdapterEClass, FEATURE_MODEL_ADAPTER__ADAPTER_OPERATION);

    coreModelAdapterEClass = createEClass(CORE_MODEL_ADAPTER);
    createEAttribute(coreModelAdapterEClass, CORE_MODEL_ADAPTER__ADAPTER_CLASS);
    createEAttribute(coreModelAdapterEClass, CORE_MODEL_ADAPTER__ADAPTER_OPERATION);

    actionDescriptorEClass = createEClass(ACTION_DESCRIPTOR);
    createEAttribute(actionDescriptorEClass, ACTION_DESCRIPTOR__NAME);
    createEAttribute(actionDescriptorEClass, ACTION_DESCRIPTOR__NUM_PARAMS);
    createEAttribute(actionDescriptorEClass, ACTION_DESCRIPTOR__EVALUATOR_CLASS);
    createEAttribute(actionDescriptorEClass, ACTION_DESCRIPTOR__EVALUATOR_METHOD);
    createEAttribute(actionDescriptorEClass, ACTION_DESCRIPTOR__CHECK_METHOD);

    designatorDescriptorEClass = createEClass(DESIGNATOR_DESCRIPTOR);
    createEAttribute(designatorDescriptorEClass, DESIGNATOR_DESCRIPTOR__NAME);
    createEAttribute(designatorDescriptorEClass, DESIGNATOR_DESCRIPTOR__NUM_PARAMS);
    createEAttribute(designatorDescriptorEClass, DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS);
    createEAttribute(designatorDescriptorEClass, DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD);
    createEAttribute(designatorDescriptorEClass, DESIGNATOR_DESCRIPTOR__CHECK_METHOD);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(langInstModelEClass, LangInstModel.class, "LangInstModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLangInstModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, LangInstModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLangInstModel_Fma(), this.getFeatureModelAdapter(), null, "fma", null, 0, 1, LangInstModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLangInstModel_Cma(), this.getCoreModelAdapter(), null, "cma", null, 0, 1, LangInstModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLangInstModel_Actions(), this.getActionDescriptor(), null, "actions", null, 0, -1, LangInstModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLangInstModel_Designators(), this.getDesignatorDescriptor(), null, "designators", null, 0, -1, LangInstModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureModelAdapterEClass, FeatureModelAdapter.class, "FeatureModelAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeatureModelAdapter_AdapterClass(), ecorePackage.getEString(), "adapterClass", null, 0, 1, FeatureModelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureModelAdapter_AdapterOperation(), ecorePackage.getEString(), "adapterOperation", null, 0, 1, FeatureModelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coreModelAdapterEClass, CoreModelAdapter.class, "CoreModelAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoreModelAdapter_AdapterClass(), ecorePackage.getEString(), "adapterClass", null, 0, 1, CoreModelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoreModelAdapter_AdapterOperation(), ecorePackage.getEString(), "adapterOperation", null, 0, 1, CoreModelAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionDescriptorEClass, ActionDescriptor.class, "ActionDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionDescriptor_NumParams(), ecorePackage.getEInt(), "numParams", null, 0, 1, ActionDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionDescriptor_EvaluatorClass(), ecorePackage.getEString(), "evaluatorClass", null, 0, 1, ActionDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionDescriptor_EvaluatorMethod(), ecorePackage.getEString(), "evaluatorMethod", null, 0, 1, ActionDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionDescriptor_CheckMethod(), ecorePackage.getEString(), "checkMethod", null, 0, 1, ActionDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(designatorDescriptorEClass, DesignatorDescriptor.class, "DesignatorDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesignatorDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, DesignatorDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDesignatorDescriptor_NumParams(), ecorePackage.getEInt(), "numParams", null, 0, 1, DesignatorDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDesignatorDescriptor_EvaluatorClass(), ecorePackage.getEString(), "evaluatorClass", null, 0, 1, DesignatorDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDesignatorDescriptor_EvaluatorMethod(), ecorePackage.getEString(), "evaluatorMethod", null, 0, 1, DesignatorDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDesignatorDescriptor_CheckMethod(), ecorePackage.getEString(), "checkMethod", null, 0, 1, DesignatorDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // comment
    createCommentAnnotations();
  }

  /**
   * Initializes the annotations for <b>comment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createCommentAnnotations() {
    String source = "comment";		
    addAnnotation
      (langInstModelEClass, 
       source, 
       new String[] {
       "value", "A model to describe a language extension for VML*"
       });		
    addAnnotation
      (featureModelAdapterEClass, 
       source, 
       new String[] {
       "value", "References an operation to use in determining the set of features for a given reference"
       });		
    addAnnotation
      (getFeatureModelAdapter_AdapterClass(), 
       source, 
       new String[] {
       "value", "Name of the class containing the operaton"
       });		
    addAnnotation
      (getFeatureModelAdapter_AdapterOperation(), 
       source, 
       new String[] {
       "value", "Name of the operation. This operation must have the following signature:\r\n            Feature[*] getFeatures (String uri);"
       });		
    addAnnotation
      (coreModelAdapterEClass, 
       source, 
       new String[] {
       "value", "References an operation to use in determining the set of model elements for a given reference"
       });		
    addAnnotation
      (getCoreModelAdapter_AdapterClass(), 
       source, 
       new String[] {
       "value", "Name of the class containing the operaton"
       });		
    addAnnotation
      (getCoreModelAdapter_AdapterOperation(), 
       source, 
       new String[] {
       "value", "Name of the operation. This operation must have the following signature:\r\n            EObject[*] getModelElements (String uri);"
       });		
    addAnnotation
      (actionDescriptorEClass, 
       source, 
       new String[] {
       "value", "Describes a custom action"
       });		
    addAnnotation
      (getActionDescriptor_Name(), 
       source, 
       new String[] {
       "value", "The name of the action. This will be used to invoke the action from a VML script."
       });		
    addAnnotation
      (getActionDescriptor_NumParams(), 
       source, 
       new String[] {
       "value", "Number of parameters the action takes."
       });		
    addAnnotation
      (getActionDescriptor_EvaluatorClass(), 
       source, 
       new String[] {
       "value", "A class containing methods for executing the action and checking type-safety constraints."
       });		
    addAnnotation
      (getActionDescriptor_EvaluatorMethod(), 
       source, 
       new String[] {
       "value", "Name of an operation implementing evaluation of the action. This must have the following signature:\r\n            void invoke (ElementReference[*] parameters)"
       });		
    addAnnotation
      (getActionDescriptor_CheckMethod(), 
       source, 
       new String[] {
       "value", "Name of an operation implementing type checking of the action\'s parameters. This must have the following signature:\r\n            boolean checkParameters (ElementReference[*] parameters)"
       });		
    addAnnotation
      (designatorDescriptorEClass, 
       source, 
       new String[] {
       "value", "Describes a custom designator"
       });		
    addAnnotation
      (getDesignatorDescriptor_Name(), 
       source, 
       new String[] {
       "value", "The name of the designator. This will be used to invoke the designator from a VML script."
       });		
    addAnnotation
      (getDesignatorDescriptor_NumParams(), 
       source, 
       new String[] {
       "value", "Number of parameters the designator takes."
       });		
    addAnnotation
      (getDesignatorDescriptor_EvaluatorClass(), 
       source, 
       new String[] {
       "value", "A class containing methods for evaluating the designator and checking type-safety constraints."
       });		
    addAnnotation
      (getDesignatorDescriptor_EvaluatorMethod(), 
       source, 
       new String[] {
       "value", "Name of an operation implementing evaluation of the designator. This must have the following signature:\r\n            ElementReference[*] evaluate (CoreModelRef core, String[*] parameters)"
       });		
    addAnnotation
      (getDesignatorDescriptor_CheckMethod(), 
       source, 
       new String[] {
       "value", "Name of an operation implementing type checking of the designator\'s parameters. This must have the following signature:\r\n            boolean checkParameters (CoreModelRef core, String[*] parameters)"
       });
  }

} //VmlLangInstPackageImpl
