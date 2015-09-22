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

import uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter;
import uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Model Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.CoreModelAdapterImpl#getAdapterClass <em>Adapter Class</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.CoreModelAdapterImpl#getAdapterOperation <em>Adapter Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoreModelAdapterImpl extends EObjectImpl implements CoreModelAdapter {
  /**
   * The default value of the '{@link #getAdapterClass() <em>Adapter Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapterClass()
   * @generated
   * @ordered
   */
  protected static final String ADAPTER_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdapterClass() <em>Adapter Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapterClass()
   * @generated
   * @ordered
   */
  protected String adapterClass = ADAPTER_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getAdapterOperation() <em>Adapter Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapterOperation()
   * @generated
   * @ordered
   */
  protected static final String ADAPTER_OPERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdapterOperation() <em>Adapter Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapterOperation()
   * @generated
   * @ordered
   */
  protected String adapterOperation = ADAPTER_OPERATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoreModelAdapterImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlLangInstPackage.Literals.CORE_MODEL_ADAPTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdapterClass() {
    return adapterClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdapterClass(String newAdapterClass) {
    String oldAdapterClass = adapterClass;
    adapterClass = newAdapterClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_CLASS, oldAdapterClass, adapterClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdapterOperation() {
    return adapterOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdapterOperation(String newAdapterOperation) {
    String oldAdapterOperation = adapterOperation;
    adapterOperation = newAdapterOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_OPERATION, oldAdapterOperation, adapterOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_CLASS:
        return getAdapterClass();
      case VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_OPERATION:
        return getAdapterOperation();
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
      case VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_CLASS:
        setAdapterClass((String)newValue);
        return;
      case VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_OPERATION:
        setAdapterOperation((String)newValue);
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
      case VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_CLASS:
        setAdapterClass(ADAPTER_CLASS_EDEFAULT);
        return;
      case VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_OPERATION:
        setAdapterOperation(ADAPTER_OPERATION_EDEFAULT);
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
      case VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_CLASS:
        return ADAPTER_CLASS_EDEFAULT == null ? adapterClass != null : !ADAPTER_CLASS_EDEFAULT.equals(adapterClass);
      case VmlLangInstPackage.CORE_MODEL_ADAPTER__ADAPTER_OPERATION:
        return ADAPTER_OPERATION_EDEFAULT == null ? adapterOperation != null : !ADAPTER_OPERATION_EDEFAULT.equals(adapterOperation);
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
    result.append(" (adapterClass: ");
    result.append(adapterClass);
    result.append(", adapterOperation: ");
    result.append(adapterOperation);
    result.append(')');
    return result.toString();
  }

} //CoreModelAdapterImpl
