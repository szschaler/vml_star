/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst;

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
 * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstFactory
 * @model kind="package"
 * @generated
 */
public interface VmlLangInstPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "vmlLangInst";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://uk.ac.lancs.comp/vmlstar.lang_inst";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "vmlstar.lang_inst";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VmlLangInstPackage eINSTANCE = uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl <em>Lang Inst Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl
   * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getLangInstModel()
   * @generated
   */
  int LANG_INST_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_INST_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Fma</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_INST_MODEL__FMA = 1;

  /**
   * The feature id for the '<em><b>Cma</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_INST_MODEL__CMA = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_INST_MODEL__ACTIONS = 3;

  /**
   * The feature id for the '<em><b>Designators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_INST_MODEL__DESIGNATORS = 4;

  /**
   * The number of structural features of the '<em>Lang Inst Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_INST_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.FeatureModelAdapterImpl <em>Feature Model Adapter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlLangInst.impl.FeatureModelAdapterImpl
   * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getFeatureModelAdapter()
   * @generated
   */
  int FEATURE_MODEL_ADAPTER = 1;

  /**
   * The feature id for the '<em><b>Adapter Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MODEL_ADAPTER__ADAPTER_CLASS = 0;

  /**
   * The feature id for the '<em><b>Adapter Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MODEL_ADAPTER__ADAPTER_OPERATION = 1;

  /**
   * The number of structural features of the '<em>Feature Model Adapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MODEL_ADAPTER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.CoreModelAdapterImpl <em>Core Model Adapter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlLangInst.impl.CoreModelAdapterImpl
   * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getCoreModelAdapter()
   * @generated
   */
  int CORE_MODEL_ADAPTER = 2;

  /**
   * The feature id for the '<em><b>Adapter Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORE_MODEL_ADAPTER__ADAPTER_CLASS = 0;

  /**
   * The feature id for the '<em><b>Adapter Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORE_MODEL_ADAPTER__ADAPTER_OPERATION = 1;

  /**
   * The number of structural features of the '<em>Core Model Adapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORE_MODEL_ADAPTER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.ActionDescriptorImpl <em>Action Descriptor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlLangInst.impl.ActionDescriptorImpl
   * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getActionDescriptor()
   * @generated
   */
  int ACTION_DESCRIPTOR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DESCRIPTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Num Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DESCRIPTOR__NUM_PARAMS = 1;

  /**
   * The feature id for the '<em><b>Evaluator Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DESCRIPTOR__EVALUATOR_CLASS = 2;

  /**
   * The feature id for the '<em><b>Evaluator Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DESCRIPTOR__EVALUATOR_METHOD = 3;

  /**
   * The feature id for the '<em><b>Check Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DESCRIPTOR__CHECK_METHOD = 4;

  /**
   * The number of structural features of the '<em>Action Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DESCRIPTOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl <em>Designator Descriptor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl
   * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getDesignatorDescriptor()
   * @generated
   */
  int DESIGNATOR_DESCRIPTOR = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR_DESCRIPTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Num Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR_DESCRIPTOR__NUM_PARAMS = 1;

  /**
   * The feature id for the '<em><b>Evaluator Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS = 2;

  /**
   * The feature id for the '<em><b>Evaluator Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD = 3;

  /**
   * The feature id for the '<em><b>Check Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR_DESCRIPTOR__CHECK_METHOD = 4;

  /**
   * The number of structural features of the '<em>Designator Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR_DESCRIPTOR_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel <em>Lang Inst Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lang Inst Model</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.LangInstModel
   * @generated
   */
  EClass getLangInstModel();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.LangInstModel#getName()
   * @see #getLangInstModel()
   * @generated
   */
  EAttribute getLangInstModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getFma <em>Fma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fma</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.LangInstModel#getFma()
   * @see #getLangInstModel()
   * @generated
   */
  EReference getLangInstModel_Fma();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getCma <em>Cma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cma</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.LangInstModel#getCma()
   * @see #getLangInstModel()
   * @generated
   */
  EReference getLangInstModel_Cma();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.LangInstModel#getActions()
   * @see #getLangInstModel()
   * @generated
   */
  EReference getLangInstModel_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getDesignators <em>Designators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Designators</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.LangInstModel#getDesignators()
   * @see #getLangInstModel()
   * @generated
   */
  EReference getLangInstModel_Designators();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter <em>Feature Model Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Model Adapter</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter
   * @generated
   */
  EClass getFeatureModelAdapter();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter#getAdapterClass <em>Adapter Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adapter Class</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter#getAdapterClass()
   * @see #getFeatureModelAdapter()
   * @generated
   */
  EAttribute getFeatureModelAdapter_AdapterClass();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter#getAdapterOperation <em>Adapter Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adapter Operation</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter#getAdapterOperation()
   * @see #getFeatureModelAdapter()
   * @generated
   */
  EAttribute getFeatureModelAdapter_AdapterOperation();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter <em>Core Model Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Core Model Adapter</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter
   * @generated
   */
  EClass getCoreModelAdapter();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter#getAdapterClass <em>Adapter Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adapter Class</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter#getAdapterClass()
   * @see #getCoreModelAdapter()
   * @generated
   */
  EAttribute getCoreModelAdapter_AdapterClass();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter#getAdapterOperation <em>Adapter Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adapter Operation</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter#getAdapterOperation()
   * @see #getCoreModelAdapter()
   * @generated
   */
  EAttribute getCoreModelAdapter_AdapterOperation();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor <em>Action Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Descriptor</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.ActionDescriptor
   * @generated
   */
  EClass getActionDescriptor();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getName()
   * @see #getActionDescriptor()
   * @generated
   */
  EAttribute getActionDescriptor_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getNumParams <em>Num Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Params</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getNumParams()
   * @see #getActionDescriptor()
   * @generated
   */
  EAttribute getActionDescriptor_NumParams();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getEvaluatorClass <em>Evaluator Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluator Class</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getEvaluatorClass()
   * @see #getActionDescriptor()
   * @generated
   */
  EAttribute getActionDescriptor_EvaluatorClass();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getEvaluatorMethod <em>Evaluator Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluator Method</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getEvaluatorMethod()
   * @see #getActionDescriptor()
   * @generated
   */
  EAttribute getActionDescriptor_EvaluatorMethod();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getCheckMethod <em>Check Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check Method</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getCheckMethod()
   * @see #getActionDescriptor()
   * @generated
   */
  EAttribute getActionDescriptor_CheckMethod();

  /**
   * Returns the meta object for class '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor <em>Designator Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Designator Descriptor</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor
   * @generated
   */
  EClass getDesignatorDescriptor();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getName()
   * @see #getDesignatorDescriptor()
   * @generated
   */
  EAttribute getDesignatorDescriptor_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getNumParams <em>Num Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Params</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getNumParams()
   * @see #getDesignatorDescriptor()
   * @generated
   */
  EAttribute getDesignatorDescriptor_NumParams();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getEvaluatorClass <em>Evaluator Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluator Class</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getEvaluatorClass()
   * @see #getDesignatorDescriptor()
   * @generated
   */
  EAttribute getDesignatorDescriptor_EvaluatorClass();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getEvaluatorMethod <em>Evaluator Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluator Method</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getEvaluatorMethod()
   * @see #getDesignatorDescriptor()
   * @generated
   */
  EAttribute getDesignatorDescriptor_EvaluatorMethod();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getCheckMethod <em>Check Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check Method</em>'.
   * @see uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getCheckMethod()
   * @see #getDesignatorDescriptor()
   * @generated
   */
  EAttribute getDesignatorDescriptor_CheckMethod();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VmlLangInstFactory getVmlLangInstFactory();

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
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl <em>Lang Inst Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl
     * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getLangInstModel()
     * @generated
     */
    EClass LANG_INST_MODEL = eINSTANCE.getLangInstModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANG_INST_MODEL__NAME = eINSTANCE.getLangInstModel_Name();

    /**
     * The meta object literal for the '<em><b>Fma</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANG_INST_MODEL__FMA = eINSTANCE.getLangInstModel_Fma();

    /**
     * The meta object literal for the '<em><b>Cma</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANG_INST_MODEL__CMA = eINSTANCE.getLangInstModel_Cma();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANG_INST_MODEL__ACTIONS = eINSTANCE.getLangInstModel_Actions();

    /**
     * The meta object literal for the '<em><b>Designators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANG_INST_MODEL__DESIGNATORS = eINSTANCE.getLangInstModel_Designators();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.FeatureModelAdapterImpl <em>Feature Model Adapter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlLangInst.impl.FeatureModelAdapterImpl
     * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getFeatureModelAdapter()
     * @generated
     */
    EClass FEATURE_MODEL_ADAPTER = eINSTANCE.getFeatureModelAdapter();

    /**
     * The meta object literal for the '<em><b>Adapter Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MODEL_ADAPTER__ADAPTER_CLASS = eINSTANCE.getFeatureModelAdapter_AdapterClass();

    /**
     * The meta object literal for the '<em><b>Adapter Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MODEL_ADAPTER__ADAPTER_OPERATION = eINSTANCE.getFeatureModelAdapter_AdapterOperation();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.CoreModelAdapterImpl <em>Core Model Adapter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlLangInst.impl.CoreModelAdapterImpl
     * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getCoreModelAdapter()
     * @generated
     */
    EClass CORE_MODEL_ADAPTER = eINSTANCE.getCoreModelAdapter();

    /**
     * The meta object literal for the '<em><b>Adapter Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORE_MODEL_ADAPTER__ADAPTER_CLASS = eINSTANCE.getCoreModelAdapter_AdapterClass();

    /**
     * The meta object literal for the '<em><b>Adapter Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORE_MODEL_ADAPTER__ADAPTER_OPERATION = eINSTANCE.getCoreModelAdapter_AdapterOperation();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.ActionDescriptorImpl <em>Action Descriptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlLangInst.impl.ActionDescriptorImpl
     * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getActionDescriptor()
     * @generated
     */
    EClass ACTION_DESCRIPTOR = eINSTANCE.getActionDescriptor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_DESCRIPTOR__NAME = eINSTANCE.getActionDescriptor_Name();

    /**
     * The meta object literal for the '<em><b>Num Params</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_DESCRIPTOR__NUM_PARAMS = eINSTANCE.getActionDescriptor_NumParams();

    /**
     * The meta object literal for the '<em><b>Evaluator Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_DESCRIPTOR__EVALUATOR_CLASS = eINSTANCE.getActionDescriptor_EvaluatorClass();

    /**
     * The meta object literal for the '<em><b>Evaluator Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_DESCRIPTOR__EVALUATOR_METHOD = eINSTANCE.getActionDescriptor_EvaluatorMethod();

    /**
     * The meta object literal for the '<em><b>Check Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_DESCRIPTOR__CHECK_METHOD = eINSTANCE.getActionDescriptor_CheckMethod();

    /**
     * The meta object literal for the '{@link uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl <em>Designator Descriptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl
     * @see uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstPackageImpl#getDesignatorDescriptor()
     * @generated
     */
    EClass DESIGNATOR_DESCRIPTOR = eINSTANCE.getDesignatorDescriptor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGNATOR_DESCRIPTOR__NAME = eINSTANCE.getDesignatorDescriptor_Name();

    /**
     * The meta object literal for the '<em><b>Num Params</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGNATOR_DESCRIPTOR__NUM_PARAMS = eINSTANCE.getDesignatorDescriptor_NumParams();

    /**
     * The meta object literal for the '<em><b>Evaluator Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS = eINSTANCE.getDesignatorDescriptor_EvaluatorClass();

    /**
     * The meta object literal for the '<em><b>Evaluator Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD = eINSTANCE.getDesignatorDescriptor_EvaluatorMethod();

    /**
     * The meta object literal for the '<em><b>Check Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGNATOR_DESCRIPTOR__CHECK_METHOD = eINSTANCE.getDesignatorDescriptor_CheckMethod();

  }

} //VmlLangInstPackage
