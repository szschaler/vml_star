/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Cut Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.PointCutReferenceImpl#getPc <em>Pc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointCutReferenceImpl extends ElementReferenceImpl implements PointCutReference {
  /**
   * The cached value of the '{@link #getPc() <em>Pc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPc()
   * @generated
   * @ordered
   */
  protected PointCut pc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointCutReferenceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlstarPackage.Literals.POINT_CUT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointCut getPc() {
    if (pc != null && pc.eIsProxy())
    {
      InternalEObject oldPc = (InternalEObject)pc;
      pc = (PointCut)eResolveProxy(oldPc);
      if (pc != oldPc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlstarPackage.POINT_CUT_REFERENCE__PC, oldPc, pc));
      }
    }
    return pc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointCut basicGetPc() {
    return pc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPc(PointCut newPc) {
    PointCut oldPc = pc;
    pc = newPc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlstarPackage.POINT_CUT_REFERENCE__PC, oldPc, pc));
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
      case VmlstarPackage.POINT_CUT_REFERENCE__PC:
        if (resolve) return getPc();
        return basicGetPc();
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
      case VmlstarPackage.POINT_CUT_REFERENCE__PC:
        setPc((PointCut)newValue);
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
      case VmlstarPackage.POINT_CUT_REFERENCE__PC:
        setPc((PointCut)null);
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
      case VmlstarPackage.POINT_CUT_REFERENCE__PC:
        return pc != null;
    }
    return super.eIsSet(featureID);
  }

} //PointCutReferenceImpl
