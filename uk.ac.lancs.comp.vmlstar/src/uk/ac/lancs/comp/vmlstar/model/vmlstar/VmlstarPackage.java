/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarFactory
 * @model kind="package"
 * @generated
 */
public interface VmlstarPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "vmlstar";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://uk.ac.lancs.comp/vmlstar";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "vmlstar";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VmlstarPackage eINSTANCE = uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlModelImpl <em>Vml Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlModelImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getVmlModel()
   * @generated
   */
  int VML_MODEL = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VML_MODEL__FEATURES = 0;

  /**
   * The feature id for the '<em><b>Core Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VML_MODEL__CORE_MODEL = 1;

  /**
   * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VML_MODEL__CONCERNS = 2;

  /**
   * The number of structural features of the '<em>Vml Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VML_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.FeatureModelRefImpl <em>Feature Model Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.FeatureModelRefImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getFeatureModelRef()
   * @generated
   */
  int FEATURE_MODEL_REF = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MODEL_REF__FEATURES = 0;

  /**
   * The feature id for the '<em><b>Fm URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MODEL_REF__FM_URI = 1;

  /**
   * The number of structural features of the '<em>Feature Model Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MODEL_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.FeatureImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.CoreModelRefImpl <em>Core Model Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.CoreModelRefImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getCoreModelRef()
   * @generated
   */
  int CORE_MODEL_REF = 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORE_MODEL_REF__ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Core URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORE_MODEL_REF__CORE_URI = 1;

  /**
   * The number of structural features of the '<em>Core Model Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORE_MODEL_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ConcernImpl <em>Concern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ConcernImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getConcern()
   * @generated
   */
  int CONCERN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN__NAME = 0;

  /**
   * The feature id for the '<em><b>Sub Concerns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN__SUB_CONCERNS = 1;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN__VARIANTS = 2;

  /**
   * The feature id for the '<em><b>Pointcuts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN__POINTCUTS = 3;

  /**
   * The number of structural features of the '<em>Concern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VariantImpl <em>Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VariantImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getVariant()
   * @generated
   */
  int VARIANT = 5;

  /**
   * The feature id for the '<em><b>On Select</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__ON_SELECT = 0;

  /**
   * The feature id for the '<em><b>On Un Select</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__ON_UN_SELECT = 1;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__FEATURE = 2;

  /**
   * The number of structural features of the '<em>Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ActionImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ElementReferenceImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getElementReference()
   * @generated
   */
  int ELEMENT_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__REFERENCED_ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutReferenceImpl <em>Point Cut Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutReferenceImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPointCutReference()
   * @generated
   */
  int POINT_CUT_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_CUT_REFERENCE__REFERENCED_ELEMENTS = ELEMENT_REFERENCE__REFERENCED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Pc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_CUT_REFERENCE__PC = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Point Cut Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_CUT_REFERENCE_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutImpl <em>Point Cut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPointCut()
   * @generated
   */
  int POINT_CUT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_CUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Pce</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_CUT__PCE = 1;

  /**
   * The number of structural features of the '<em>Point Cut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_CUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutExpressionImpl <em>Point Cut Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutExpressionImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPointCutExpression()
   * @generated
   */
  int POINT_CUT_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_CUT_EXPRESSION__REFERENCED_ELEMENTS = ELEMENT_REFERENCE__REFERENCED_ELEMENTS;

  /**
   * The number of structural features of the '<em>Point Cut Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_CUT_EXPRESSION_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEOperatorImpl <em>PCE Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEOperatorImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPCEOperator()
   * @generated
   */
  int PCE_OPERATOR = 11;

  /**
   * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_OPERATOR__REFERENCED_ELEMENTS = POINT_CUT_EXPRESSION__REFERENCED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_OPERATOR__OPERANDS = POINT_CUT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PCE Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_OPERATOR_FEATURE_COUNT = POINT_CUT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEAndOperatorImpl <em>PCE And Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEAndOperatorImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPCEAndOperator()
   * @generated
   */
  int PCE_AND_OPERATOR = 12;

  /**
   * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_AND_OPERATOR__REFERENCED_ELEMENTS = PCE_OPERATOR__REFERENCED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_AND_OPERATOR__OPERANDS = PCE_OPERATOR__OPERANDS;

  /**
   * The number of structural features of the '<em>PCE And Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_AND_OPERATOR_FEATURE_COUNT = PCE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEOrOperatorImpl <em>PCE Or Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEOrOperatorImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPCEOrOperator()
   * @generated
   */
  int PCE_OR_OPERATOR = 13;

  /**
   * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_OR_OPERATOR__REFERENCED_ELEMENTS = PCE_OPERATOR__REFERENCED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_OR_OPERATOR__OPERANDS = PCE_OPERATOR__OPERANDS;

  /**
   * The number of structural features of the '<em>PCE Or Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCE_OR_OPERATOR_FEATURE_COUNT = PCE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCDesignatorImpl <em>PC Designator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCDesignatorImpl
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPCDesignator()
   * @generated
   */
  int PC_DESIGNATOR = 14;

  /**
   * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PC_DESIGNATOR__REFERENCED_ELEMENTS = POINT_CUT_EXPRESSION__REFERENCED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PC_DESIGNATOR__PARAMETERS = POINT_CUT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PC Designator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PC_DESIGNATOR_FEATURE_COUNT = POINT_CUT_EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel <em>Vml Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vml Model</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel
   * @generated
   */
  EClass getVmlModel();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Features</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getFeatures()
   * @see #getVmlModel()
   * @generated
   */
  EReference getVmlModel_Features();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getCoreModel <em>Core Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Core Model</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getCoreModel()
   * @see #getVmlModel()
   * @generated
   */
  EReference getVmlModel_CoreModel();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getConcerns <em>Concerns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concerns</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getConcerns()
   * @see #getVmlModel()
   * @generated
   */
  EReference getVmlModel_Concerns();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef <em>Feature Model Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Model Ref</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef
   * @generated
   */
  EClass getFeatureModelRef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef#getFeatures()
   * @see #getFeatureModelRef()
   * @generated
   */
  EReference getFeatureModelRef_Features();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef#getFmURI <em>Fm URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fm URI</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef#getFmURI()
   * @see #getFeatureModelRef()
   * @generated
   */
  EAttribute getFeatureModelRef_FmURI();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef <em>Core Model Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Core Model Ref</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef
   * @generated
   */
  EClass getCoreModelRef();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef#getElements()
   * @see #getCoreModelRef()
   * @generated
   */
  EReference getCoreModelRef_Elements();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef#getCoreURI <em>Core URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Core URI</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef#getCoreURI()
   * @see #getCoreModelRef()
   * @generated
   */
  EAttribute getCoreModelRef_CoreURI();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern <em>Concern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concern</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern
   * @generated
   */
  EClass getConcern();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getName()
   * @see #getConcern()
   * @generated
   */
  EAttribute getConcern_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getSubConcerns <em>Sub Concerns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Concerns</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getSubConcerns()
   * @see #getConcern()
   * @generated
   */
  EReference getConcern_SubConcerns();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getVariants()
   * @see #getConcern()
   * @generated
   */
  EReference getConcern_Variants();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getPointcuts <em>Pointcuts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pointcuts</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getPointcuts()
   * @see #getConcern()
   * @generated
   */
  EReference getConcern_Pointcuts();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variant</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant
   * @generated
   */
  EClass getVariant();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getOnSelect <em>On Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>On Select</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getOnSelect()
   * @see #getVariant()
   * @generated
   */
  EReference getVariant_OnSelect();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getOnUnSelect <em>On Un Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>On Un Select</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getOnUnSelect()
   * @see #getVariant()
   * @generated
   */
  EReference getVariant_OnUnSelect();

  /**
   * Returns the meta object for the reference '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getFeature()
   * @see #getVariant()
   * @generated
   */
  EReference getVariant_Feature();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Action#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Action#getParameters()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Parameters();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference <em>Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Reference</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference
   * @generated
   */
  EClass getElementReference();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference#getReferencedElements <em>Referenced Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Referenced Elements</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference#getReferencedElements()
   * @see #getElementReference()
   * @generated
   */
  EReference getElementReference_ReferencedElements();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference <em>Point Cut Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point Cut Reference</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference
   * @generated
   */
  EClass getPointCutReference();

  /**
   * Returns the meta object for the reference '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference#getPc <em>Pc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pc</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference#getPc()
   * @see #getPointCutReference()
   * @generated
   */
  EReference getPointCutReference_Pc();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut <em>Point Cut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point Cut</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut
   * @generated
   */
  EClass getPointCut();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut#getName()
   * @see #getPointCut()
   * @generated
   */
  EAttribute getPointCut_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut#getPce <em>Pce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pce</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut#getPce()
   * @see #getPointCut()
   * @generated
   */
  EReference getPointCut_Pce();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutExpression <em>Point Cut Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point Cut Expression</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutExpression
   * @generated
   */
  EClass getPointCutExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOperator <em>PCE Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PCE Operator</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOperator
   * @generated
   */
  EClass getPCEOperator();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOperator#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOperator#getOperands()
   * @see #getPCEOperator()
   * @generated
   */
  EReference getPCEOperator_Operands();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEAndOperator <em>PCE And Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PCE And Operator</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEAndOperator
   * @generated
   */
  EClass getPCEAndOperator();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOrOperator <em>PCE Or Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PCE Or Operator</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOrOperator
   * @generated
   */
  EClass getPCEOrOperator();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCDesignator <em>PC Designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PC Designator</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCDesignator
   * @generated
   */
  EClass getPCDesignator();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCDesignator#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCDesignator#getParameters()
   * @see #getPCDesignator()
   * @generated
   */
  EAttribute getPCDesignator_Parameters();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VmlstarFactory getVmlstarFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlModelImpl <em>Vml Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlModelImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getVmlModel()
     * @generated
     */
    EClass VML_MODEL = eINSTANCE.getVmlModel();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VML_MODEL__FEATURES = eINSTANCE.getVmlModel_Features();

    /**
     * The meta object literal for the '<em><b>Core Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VML_MODEL__CORE_MODEL = eINSTANCE.getVmlModel_CoreModel();

    /**
     * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VML_MODEL__CONCERNS = eINSTANCE.getVmlModel_Concerns();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.FeatureModelRefImpl <em>Feature Model Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.FeatureModelRefImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getFeatureModelRef()
     * @generated
     */
    EClass FEATURE_MODEL_REF = eINSTANCE.getFeatureModelRef();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MODEL_REF__FEATURES = eINSTANCE.getFeatureModelRef_Features();

    /**
     * The meta object literal for the '<em><b>Fm URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MODEL_REF__FM_URI = eINSTANCE.getFeatureModelRef_FmURI();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.FeatureImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.CoreModelRefImpl <em>Core Model Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.CoreModelRefImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getCoreModelRef()
     * @generated
     */
    EClass CORE_MODEL_REF = eINSTANCE.getCoreModelRef();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CORE_MODEL_REF__ELEMENTS = eINSTANCE.getCoreModelRef_Elements();

    /**
     * The meta object literal for the '<em><b>Core URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORE_MODEL_REF__CORE_URI = eINSTANCE.getCoreModelRef_CoreURI();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ConcernImpl <em>Concern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ConcernImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getConcern()
     * @generated
     */
    EClass CONCERN = eINSTANCE.getConcern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCERN__NAME = eINSTANCE.getConcern_Name();

    /**
     * The meta object literal for the '<em><b>Sub Concerns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCERN__SUB_CONCERNS = eINSTANCE.getConcern_SubConcerns();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCERN__VARIANTS = eINSTANCE.getConcern_Variants();

    /**
     * The meta object literal for the '<em><b>Pointcuts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCERN__POINTCUTS = eINSTANCE.getConcern_Pointcuts();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VariantImpl <em>Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VariantImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getVariant()
     * @generated
     */
    EClass VARIANT = eINSTANCE.getVariant();

    /**
     * The meta object literal for the '<em><b>On Select</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT__ON_SELECT = eINSTANCE.getVariant_OnSelect();

    /**
     * The meta object literal for the '<em><b>On Un Select</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT__ON_UN_SELECT = eINSTANCE.getVariant_OnUnSelect();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT__FEATURE = eINSTANCE.getVariant_Feature();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ActionImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ElementReferenceImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getElementReference()
     * @generated
     */
    EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

    /**
     * The meta object literal for the '<em><b>Referenced Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_REFERENCE__REFERENCED_ELEMENTS = eINSTANCE.getElementReference_ReferencedElements();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutReferenceImpl <em>Point Cut Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutReferenceImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPointCutReference()
     * @generated
     */
    EClass POINT_CUT_REFERENCE = eINSTANCE.getPointCutReference();

    /**
     * The meta object literal for the '<em><b>Pc</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT_CUT_REFERENCE__PC = eINSTANCE.getPointCutReference_Pc();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutImpl <em>Point Cut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPointCut()
     * @generated
     */
    EClass POINT_CUT = eINSTANCE.getPointCut();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT_CUT__NAME = eINSTANCE.getPointCut_Name();

    /**
     * The meta object literal for the '<em><b>Pce</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT_CUT__PCE = eINSTANCE.getPointCut_Pce();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutExpressionImpl <em>Point Cut Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutExpressionImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPointCutExpression()
     * @generated
     */
    EClass POINT_CUT_EXPRESSION = eINSTANCE.getPointCutExpression();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEOperatorImpl <em>PCE Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEOperatorImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPCEOperator()
     * @generated
     */
    EClass PCE_OPERATOR = eINSTANCE.getPCEOperator();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PCE_OPERATOR__OPERANDS = eINSTANCE.getPCEOperator_Operands();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEAndOperatorImpl <em>PCE And Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEAndOperatorImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPCEAndOperator()
     * @generated
     */
    EClass PCE_AND_OPERATOR = eINSTANCE.getPCEAndOperator();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEOrOperatorImpl <em>PCE Or Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCEOrOperatorImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPCEOrOperator()
     * @generated
     */
    EClass PCE_OR_OPERATOR = eINSTANCE.getPCEOrOperator();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCDesignatorImpl <em>PC Designator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PCDesignatorImpl
     * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarPackageImpl#getPCDesignator()
     * @generated
     */
    EClass PC_DESIGNATOR = eINSTANCE.getPCDesignator();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PC_DESIGNATOR__PARAMETERS = eINSTANCE.getPCDesignator_Parameters();

  }

} //VmlstarPackage
