/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Model Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.CoreModelRefImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.CoreModelRefImpl#getCoreURI <em>Core URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoreModelRefImpl extends EObjectImpl implements CoreModelRef {
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<EObject> elements;

  /**
   * The default value of the '{@link #getCoreURI() <em>Core URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoreURI()
   * @generated
   * @ordered
   */
  protected static final String CORE_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCoreURI() <em>Core URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoreURI()
   * @generated
   * @ordered
   */
  protected String coreURI = CORE_URI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoreModelRefImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlstarPackage.Literals.CORE_MODEL_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getElements() {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<EObject>(EObject.class, this, VmlstarPackage.CORE_MODEL_REF__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCoreURI() {
    return coreURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoreURI(String newCoreURI) {
    String oldCoreURI = coreURI;
    coreURI = newCoreURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlstarPackage.CORE_MODEL_REF__CORE_URI, oldCoreURI, coreURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case VmlstarPackage.CORE_MODEL_REF__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case VmlstarPackage.CORE_MODEL_REF__ELEMENTS:
        return getElements();
      case VmlstarPackage.CORE_MODEL_REF__CORE_URI:
        return getCoreURI();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case VmlstarPackage.CORE_MODEL_REF__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends EObject>)newValue);
        return;
      case VmlstarPackage.CORE_MODEL_REF__CORE_URI:
        setCoreURI((String)newValue);
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
    switch (featureID)
    {
      case VmlstarPackage.CORE_MODEL_REF__ELEMENTS:
        getElements().clear();
        return;
      case VmlstarPackage.CORE_MODEL_REF__CORE_URI:
        setCoreURI(CORE_URI_EDEFAULT);
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
    switch (featureID)
    {
      case VmlstarPackage.CORE_MODEL_REF__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case VmlstarPackage.CORE_MODEL_REF__CORE_URI:
        return CORE_URI_EDEFAULT == null ? coreURI != null : !CORE_URI_EDEFAULT.equals(coreURI);
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
    result.append(" (coreURI: ");
    result.append(coreURI);
    result.append(')');
    return result.toString();
  }

} //CoreModelRefImpl
