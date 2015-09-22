/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor;
import uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Designator Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl#getNumParams <em>Num Params</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl#getEvaluatorClass <em>Evaluator Class</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl#getEvaluatorMethod <em>Evaluator Method</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.DesignatorDescriptorImpl#getCheckMethod <em>Check Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignatorDescriptorImpl extends EObjectImpl implements DesignatorDescriptor {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNumParams() <em>Num Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumParams()
   * @generated
   * @ordered
   */
  protected static final int NUM_PARAMS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumParams() <em>Num Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumParams()
   * @generated
   * @ordered
   */
  protected int numParams = NUM_PARAMS_EDEFAULT;

  /**
   * The default value of the '{@link #getEvaluatorClass() <em>Evaluator Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluatorClass()
   * @generated
   * @ordered
   */
  protected static final String EVALUATOR_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvaluatorClass() <em>Evaluator Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluatorClass()
   * @generated
   * @ordered
   */
  protected String evaluatorClass = EVALUATOR_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getEvaluatorMethod() <em>Evaluator Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluatorMethod()
   * @generated
   * @ordered
   */
  protected static final String EVALUATOR_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvaluatorMethod() <em>Evaluator Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluatorMethod()
   * @generated
   * @ordered
   */
  protected String evaluatorMethod = EVALUATOR_METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getCheckMethod() <em>Check Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckMethod()
   * @generated
   * @ordered
   */
  protected static final String CHECK_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCheckMethod() <em>Check Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckMethod()
   * @generated
   * @ordered
   */
  protected String checkMethod = CHECK_METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DesignatorDescriptorImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlLangInstPackage.Literals.DESIGNATOR_DESCRIPTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumParams() {
    return numParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumParams(int newNumParams) {
    int oldNumParams = numParams;
    numParams = newNumParams;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NUM_PARAMS, oldNumParams, numParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEvaluatorClass() {
    return evaluatorClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluatorClass(String newEvaluatorClass) {
    String oldEvaluatorClass = evaluatorClass;
    evaluatorClass = newEvaluatorClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS, oldEvaluatorClass, evaluatorClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEvaluatorMethod() {
    return evaluatorMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluatorMethod(String newEvaluatorMethod) {
    String oldEvaluatorMethod = evaluatorMethod;
    evaluatorMethod = newEvaluatorMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD, oldEvaluatorMethod, evaluatorMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCheckMethod() {
    return checkMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheckMethod(String newCheckMethod) {
    String oldCheckMethod = checkMethod;
    checkMethod = newCheckMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__CHECK_METHOD, oldCheckMethod, checkMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NAME:
        return getName();
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NUM_PARAMS:
        return new Integer(getNumParams());
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS:
        return getEvaluatorClass();
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD:
        return getEvaluatorMethod();
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__CHECK_METHOD:
        return getCheckMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NAME:
        setName((String)newValue);
        return;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NUM_PARAMS:
        setNumParams(((Integer)newValue).intValue());
        return;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS:
        setEvaluatorClass((String)newValue);
        return;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD:
        setEvaluatorMethod((String)newValue);
        return;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__CHECK_METHOD:
        setCheckMethod((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NUM_PARAMS:
        setNumParams(NUM_PARAMS_EDEFAULT);
        return;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS:
        setEvaluatorClass(EVALUATOR_CLASS_EDEFAULT);
        return;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD:
        setEvaluatorMethod(EVALUATOR_METHOD_EDEFAULT);
        return;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__CHECK_METHOD:
        setCheckMethod(CHECK_METHOD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NUM_PARAMS:
        return numParams != NUM_PARAMS_EDEFAULT;
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS:
        return EVALUATOR_CLASS_EDEFAULT == null ? evaluatorClass != null : !EVALUATOR_CLASS_EDEFAULT.equals(evaluatorClass);
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD:
        return EVALUATOR_METHOD_EDEFAULT == null ? evaluatorMethod != null : !EVALUATOR_METHOD_EDEFAULT.equals(evaluatorMethod);
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__CHECK_METHOD:
        return CHECK_METHOD_EDEFAULT == null ? checkMethod != null : !CHECK_METHOD_EDEFAULT.equals(checkMethod);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", numParams: ");
    result.append(numParams);
    result.append(", evaluatorClass: ");
    result.append(evaluatorClass);
    result.append(", evaluatorMethod: ");
    result.append(evaluatorMethod);
    result.append(", checkMethod: ");
    result.append(checkMethod);
    result.append(')');
    return result.toString();
  }

} //DesignatorDescriptorImpl
