/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutExpression;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutImpl#getPce <em>Pce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointCutImpl extends EObjectImpl implements PointCut {
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
   * The cached value of the '{@link #getPce() <em>Pce</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPce()
   * @generated
   * @ordered
   */
  protected PointCutExpression pce;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointCutImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlstarPackage.Literals.POINT_CUT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VmlstarPackage.POINT_CUT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointCutExpression getPce() {
    return pce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPce(PointCutExpression newPce, NotificationChain msgs) {
    PointCutExpression oldPce = pce;
    pce = newPce;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlstarPackage.POINT_CUT__PCE, oldPce, newPce);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPce(PointCutExpression newPce) {
    if (newPce != pce)
    {
      NotificationChain msgs = null;
      if (pce != null)
        msgs = ((InternalEObject)pce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlstarPackage.POINT_CUT__PCE, null, msgs);
      if (newPce != null)
        msgs = ((InternalEObject)newPce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlstarPackage.POINT_CUT__PCE, null, msgs);
      msgs = basicSetPce(newPce, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlstarPackage.POINT_CUT__PCE, newPce, newPce));
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
      case VmlstarPackage.POINT_CUT__PCE:
        return basicSetPce(null, msgs);
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
      case VmlstarPackage.POINT_CUT__NAME:
        return getName();
      case VmlstarPackage.POINT_CUT__PCE:
        return getPce();
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
    switch (featureID)
    {
      case VmlstarPackage.POINT_CUT__NAME:
        setName((String)newValue);
        return;
      case VmlstarPackage.POINT_CUT__PCE:
        setPce((PointCutExpression)newValue);
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
      case VmlstarPackage.POINT_CUT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VmlstarPackage.POINT_CUT__PCE:
        setPce((PointCutExpression)null);
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
      case VmlstarPackage.POINT_CUT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VmlstarPackage.POINT_CUT__PCE:
        return pce != null;
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
    result.append(')');
    return result.toString();
  }

} //PointCutImpl
