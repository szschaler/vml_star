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

import uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vml Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlModelImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlModelImpl#getCoreModel <em>Core Model</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlModelImpl#getConcerns <em>Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VmlModelImpl extends EObjectImpl implements VmlModel {
  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected FeatureModelRef features;

  /**
   * The cached value of the '{@link #getCoreModel() <em>Core Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoreModel()
   * @generated
   * @ordered
   */
  protected CoreModelRef coreModel;

  /**
   * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcerns()
   * @generated
   * @ordered
   */
  protected EList<Concern> concerns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VmlModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlstarPackage.Literals.VML_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureModelRef getFeatures() {
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatures(FeatureModelRef newFeatures, NotificationChain msgs) {
    FeatureModelRef oldFeatures = features;
    features = newFeatures;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlstarPackage.VML_MODEL__FEATURES, oldFeatures, newFeatures);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatures(FeatureModelRef newFeatures) {
    if (newFeatures != features)
    {
      NotificationChain msgs = null;
      if (features != null)
        msgs = ((InternalEObject)features).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlstarPackage.VML_MODEL__FEATURES, null, msgs);
      if (newFeatures != null)
        msgs = ((InternalEObject)newFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlstarPackage.VML_MODEL__FEATURES, null, msgs);
      msgs = basicSetFeatures(newFeatures, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlstarPackage.VML_MODEL__FEATURES, newFeatures, newFeatures));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreModelRef getCoreModel() {
    return coreModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoreModel(CoreModelRef newCoreModel, NotificationChain msgs) {
    CoreModelRef oldCoreModel = coreModel;
    coreModel = newCoreModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlstarPackage.VML_MODEL__CORE_MODEL, oldCoreModel, newCoreModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoreModel(CoreModelRef newCoreModel) {
    if (newCoreModel != coreModel)
    {
      NotificationChain msgs = null;
      if (coreModel != null)
        msgs = ((InternalEObject)coreModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlstarPackage.VML_MODEL__CORE_MODEL, null, msgs);
      if (newCoreModel != null)
        msgs = ((InternalEObject)newCoreModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlstarPackage.VML_MODEL__CORE_MODEL, null, msgs);
      msgs = basicSetCoreModel(newCoreModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlstarPackage.VML_MODEL__CORE_MODEL, newCoreModel, newCoreModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Concern> getConcerns() {
    if (concerns == null)
    {
      concerns = new EObjectContainmentEList<Concern>(Concern.class, this, VmlstarPackage.VML_MODEL__CONCERNS);
    }
    return concerns;
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
      case VmlstarPackage.VML_MODEL__FEATURES:
        return basicSetFeatures(null, msgs);
      case VmlstarPackage.VML_MODEL__CORE_MODEL:
        return basicSetCoreModel(null, msgs);
      case VmlstarPackage.VML_MODEL__CONCERNS:
        return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
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
      case VmlstarPackage.VML_MODEL__FEATURES:
        return getFeatures();
      case VmlstarPackage.VML_MODEL__CORE_MODEL:
        return getCoreModel();
      case VmlstarPackage.VML_MODEL__CONCERNS:
        return getConcerns();
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
      case VmlstarPackage.VML_MODEL__FEATURES:
        setFeatures((FeatureModelRef)newValue);
        return;
      case VmlstarPackage.VML_MODEL__CORE_MODEL:
        setCoreModel((CoreModelRef)newValue);
        return;
      case VmlstarPackage.VML_MODEL__CONCERNS:
        getConcerns().clear();
        getConcerns().addAll((Collection<? extends Concern>)newValue);
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
      case VmlstarPackage.VML_MODEL__FEATURES:
        setFeatures((FeatureModelRef)null);
        return;
      case VmlstarPackage.VML_MODEL__CORE_MODEL:
        setCoreModel((CoreModelRef)null);
        return;
      case VmlstarPackage.VML_MODEL__CONCERNS:
        getConcerns().clear();
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
      case VmlstarPackage.VML_MODEL__FEATURES:
        return features != null;
      case VmlstarPackage.VML_MODEL__CORE_MODEL:
        return coreModel != null;
      case VmlstarPackage.VML_MODEL__CONCERNS:
        return concerns != null && !concerns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VmlModelImpl
