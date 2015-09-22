/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.Action;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.Feature;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PCDesignator;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEAndOperator;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOperator;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOrOperator;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutExpression;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarFactory;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmlstarPackageImpl extends EPackageImpl implements VmlstarPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vmlModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureModelRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coreModelRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concernEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointCutReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointCutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointCutExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pceOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pceAndOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pceOrOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pcDesignatorEClass = null;

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
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VmlstarPackageImpl() {
    super(eNS_URI, VmlstarFactory.eINSTANCE);
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
  public static VmlstarPackage init() {
    if (isInited) return (VmlstarPackage)EPackage.Registry.INSTANCE.getEPackage(VmlstarPackage.eNS_URI);

    // Obtain or create and register package
    VmlstarPackageImpl theVmlstarPackage = (VmlstarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof VmlstarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new VmlstarPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVmlstarPackage.createPackageContents();

    // Initialize created meta-data
    theVmlstarPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVmlstarPackage.freeze();

    return theVmlstarPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVmlModel() {
    return vmlModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVmlModel_Features() {
    return (EReference)vmlModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVmlModel_CoreModel() {
    return (EReference)vmlModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVmlModel_Concerns() {
    return (EReference)vmlModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureModelRef() {
    return featureModelRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureModelRef_Features() {
    return (EReference)featureModelRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureModelRef_FmURI() {
    return (EAttribute)featureModelRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature() {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name() {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoreModelRef() {
    return coreModelRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCoreModelRef_Elements() {
    return (EReference)coreModelRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoreModelRef_CoreURI() {
    return (EAttribute)coreModelRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcern() {
    return concernEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcern_Name() {
    return (EAttribute)concernEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcern_SubConcerns() {
    return (EReference)concernEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcern_Variants() {
    return (EReference)concernEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcern_Pointcuts() {
    return (EReference)concernEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariant() {
    return variantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariant_OnSelect() {
    return (EReference)variantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariant_OnUnSelect() {
    return (EReference)variantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariant_Feature() {
    return (EReference)variantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction() {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Parameters() {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementReference() {
    return elementReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementReference_ReferencedElements() {
    return (EReference)elementReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointCutReference() {
    return pointCutReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointCutReference_Pc() {
    return (EReference)pointCutReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointCut() {
    return pointCutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPointCut_Name() {
    return (EAttribute)pointCutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointCut_Pce() {
    return (EReference)pointCutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointCutExpression() {
    return pointCutExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPCEOperator() {
    return pceOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPCEOperator_Operands() {
    return (EReference)pceOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPCEAndOperator() {
    return pceAndOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPCEOrOperator() {
    return pceOrOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPCDesignator() {
    return pcDesignatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPCDesignator_Parameters() {
    return (EAttribute)pcDesignatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlstarFactory getVmlstarFactory() {
    return (VmlstarFactory)getEFactoryInstance();
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
    vmlModelEClass = createEClass(VML_MODEL);
    createEReference(vmlModelEClass, VML_MODEL__FEATURES);
    createEReference(vmlModelEClass, VML_MODEL__CORE_MODEL);
    createEReference(vmlModelEClass, VML_MODEL__CONCERNS);

    featureModelRefEClass = createEClass(FEATURE_MODEL_REF);
    createEReference(featureModelRefEClass, FEATURE_MODEL_REF__FEATURES);
    createEAttribute(featureModelRefEClass, FEATURE_MODEL_REF__FM_URI);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);

    coreModelRefEClass = createEClass(CORE_MODEL_REF);
    createEReference(coreModelRefEClass, CORE_MODEL_REF__ELEMENTS);
    createEAttribute(coreModelRefEClass, CORE_MODEL_REF__CORE_URI);

    concernEClass = createEClass(CONCERN);
    createEAttribute(concernEClass, CONCERN__NAME);
    createEReference(concernEClass, CONCERN__SUB_CONCERNS);
    createEReference(concernEClass, CONCERN__VARIANTS);
    createEReference(concernEClass, CONCERN__POINTCUTS);

    variantEClass = createEClass(VARIANT);
    createEReference(variantEClass, VARIANT__ON_SELECT);
    createEReference(variantEClass, VARIANT__ON_UN_SELECT);
    createEReference(variantEClass, VARIANT__FEATURE);

    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__PARAMETERS);

    elementReferenceEClass = createEClass(ELEMENT_REFERENCE);
    createEReference(elementReferenceEClass, ELEMENT_REFERENCE__REFERENCED_ELEMENTS);

    pointCutReferenceEClass = createEClass(POINT_CUT_REFERENCE);
    createEReference(pointCutReferenceEClass, POINT_CUT_REFERENCE__PC);

    pointCutEClass = createEClass(POINT_CUT);
    createEAttribute(pointCutEClass, POINT_CUT__NAME);
    createEReference(pointCutEClass, POINT_CUT__PCE);

    pointCutExpressionEClass = createEClass(POINT_CUT_EXPRESSION);

    pceOperatorEClass = createEClass(PCE_OPERATOR);
    createEReference(pceOperatorEClass, PCE_OPERATOR__OPERANDS);

    pceAndOperatorEClass = createEClass(PCE_AND_OPERATOR);

    pceOrOperatorEClass = createEClass(PCE_OR_OPERATOR);

    pcDesignatorEClass = createEClass(PC_DESIGNATOR);
    createEAttribute(pcDesignatorEClass, PC_DESIGNATOR__PARAMETERS);
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
    pointCutReferenceEClass.getESuperTypes().add(this.getElementReference());
    pointCutExpressionEClass.getESuperTypes().add(this.getElementReference());
    pceOperatorEClass.getESuperTypes().add(this.getPointCutExpression());
    pceAndOperatorEClass.getESuperTypes().add(this.getPCEOperator());
    pceOrOperatorEClass.getESuperTypes().add(this.getPCEOperator());
    pcDesignatorEClass.getESuperTypes().add(this.getPointCutExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(vmlModelEClass, VmlModel.class, "VmlModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVmlModel_Features(), this.getFeatureModelRef(), null, "features", null, 0, 1, VmlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVmlModel_CoreModel(), this.getCoreModelRef(), null, "coreModel", null, 0, 1, VmlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVmlModel_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, VmlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureModelRefEClass, FeatureModelRef.class, "FeatureModelRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureModelRef_Features(), this.getFeature(), null, "features", null, 0, -1, FeatureModelRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureModelRef_FmURI(), ecorePackage.getEString(), "fmURI", null, 0, 1, FeatureModelRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coreModelRefEClass, CoreModelRef.class, "CoreModelRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCoreModelRef_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, CoreModelRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoreModelRef_CoreURI(), ecorePackage.getEString(), "coreURI", null, 0, 1, CoreModelRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcern_Name(), ecorePackage.getEString(), "name", null, 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcern_SubConcerns(), this.getConcern(), null, "subConcerns", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcern_Variants(), this.getVariant(), null, "variants", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcern_Pointcuts(), this.getPointCut(), null, "pointcuts", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariant_OnSelect(), this.getAction(), null, "onSelect", null, 0, -1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariant_OnUnSelect(), this.getAction(), null, "onUnSelect", null, 0, -1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariant_Feature(), this.getFeature(), null, "feature", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAction_Parameters(), this.getElementReference(), null, "parameters", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementReferenceEClass, ElementReference.class, "ElementReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementReference_ReferencedElements(), ecorePackage.getEObject(), null, "referencedElements", null, 0, -1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(pointCutReferenceEClass, PointCutReference.class, "PointCutReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointCutReference_Pc(), this.getPointCut(), null, "pc", null, 0, 1, PointCutReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointCutEClass, PointCut.class, "PointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPointCut_Name(), ecorePackage.getEString(), "name", null, 0, 1, PointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPointCut_Pce(), this.getPointCutExpression(), null, "pce", null, 0, 1, PointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointCutExpressionEClass, PointCutExpression.class, "PointCutExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pceOperatorEClass, PCEOperator.class, "PCEOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPCEOperator_Operands(), this.getPointCutExpression(), null, "operands", null, 0, -1, PCEOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pceAndOperatorEClass, PCEAndOperator.class, "PCEAndOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pceOrOperatorEClass, PCEOrOperator.class, "PCEOrOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pcDesignatorEClass, PCDesignator.class, "PCDesignator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPCDesignator_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, PCDesignator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VmlstarPackageImpl
