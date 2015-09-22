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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.Action;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.Feature;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VariantImpl#getOnSelect <em>On Select</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VariantImpl#getOnUnSelect <em>On Un Select</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VariantImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariantImpl extends EObjectImpl implements Variant {
  /**
   * The cached value of the '{@link #getOnSelect() <em>On Select</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnSelect()
   * @generated
   * @ordered
   */
  protected EList<Action> onSelect;

  /**
   * The cached value of the '{@link #getOnUnSelect() <em>On Un Select</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnUnSelect()
   * @generated
   * @ordered
   */
  protected EList<Action> onUnSelect;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected Feature feature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariantImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlstarPackage.Literals.VARIANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getOnSelect() {
    if (onSelect == null)
    {
      onSelect = new EObjectContainmentEList<Action>(Action.class, this, VmlstarPackage.VARIANT__ON_SELECT);
    }
    return onSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getOnUnSelect() {
    if (onUnSelect == null)
    {
      onUnSelect = new EObjectContainmentEList<Action>(Action.class, this, VmlstarPackage.VARIANT__ON_UN_SELECT);
    }
    return onUnSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getFeature() {
    if (feature != null && feature.eIsProxy())
    {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (Feature)eResolveProxy(oldFeature);
      if (feature != oldFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlstarPackage.VARIANT__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetFeature() {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(Feature newFeature) {
    Feature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlstarPackage.VARIANT__FEATURE, oldFeature, feature));
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
      case VmlstarPackage.VARIANT__ON_SELECT:
        return ((InternalEList<?>)getOnSelect()).basicRemove(otherEnd, msgs);
      case VmlstarPackage.VARIANT__ON_UN_SELECT:
        return ((InternalEList<?>)getOnUnSelect()).basicRemove(otherEnd, msgs);
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
      case VmlstarPackage.VARIANT__ON_SELECT:
        return getOnSelect();
      case VmlstarPackage.VARIANT__ON_UN_SELECT:
        return getOnUnSelect();
      case VmlstarPackage.VARIANT__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
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
      case VmlstarPackage.VARIANT__ON_SELECT:
        getOnSelect().clear();
        getOnSelect().addAll((Collection<? extends Action>)newValue);
        return;
      case VmlstarPackage.VARIANT__ON_UN_SELECT:
        getOnUnSelect().clear();
        getOnUnSelect().addAll((Collection<? extends Action>)newValue);
        return;
      case VmlstarPackage.VARIANT__FEATURE:
        setFeature((Feature)newValue);
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
      case VmlstarPackage.VARIANT__ON_SELECT:
        getOnSelect().clear();
        return;
      case VmlstarPackage.VARIANT__ON_UN_SELECT:
        getOnUnSelect().clear();
        return;
      case VmlstarPackage.VARIANT__FEATURE:
        setFeature((Feature)null);
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
      case VmlstarPackage.VARIANT__ON_SELECT:
        return onSelect != null && !onSelect.isEmpty();
      case VmlstarPackage.VARIANT__ON_UN_SELECT:
        return onUnSelect != null && !onUnSelect.isEmpty();
      case VmlstarPackage.VARIANT__FEATURE:
        return feature != null;
    }
    return super.eIsSet(featureID);
  }

} //VariantImpl
