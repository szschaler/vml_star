/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst.impl;

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

import uk.ac.lancs.comp.vmlLangInst.ActionDescriptor;
import uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter;
import uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor;
import uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter;
import uk.ac.lancs.comp.vmlLangInst.LangInstModel;
import uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lang Inst Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl#getFma <em>Fma</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl#getCma <em>Cma</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.impl.LangInstModelImpl#getDesignators <em>Designators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LangInstModelImpl extends EObjectImpl implements LangInstModel {
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
   * The cached value of the '{@link #getFma() <em>Fma</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFma()
   * @generated
   * @ordered
   */
  protected FeatureModelAdapter fma;

  /**
   * The cached value of the '{@link #getCma() <em>Cma</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCma()
   * @generated
   * @ordered
   */
  protected CoreModelAdapter cma;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<ActionDescriptor> actions;

  /**
   * The cached value of the '{@link #getDesignators() <em>Designators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignators()
   * @generated
   * @ordered
   */
  protected EList<DesignatorDescriptor> designators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LangInstModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlLangInstPackage.Literals.LANG_INST_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.LANG_INST_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureModelAdapter getFma() {
    return fma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFma(FeatureModelAdapter newFma, NotificationChain msgs) {
    FeatureModelAdapter oldFma = fma;
    fma = newFma;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.LANG_INST_MODEL__FMA, oldFma, newFma);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFma(FeatureModelAdapter newFma) {
    if (newFma != fma) {
      NotificationChain msgs = null;
      if (fma != null)
        msgs = ((InternalEObject)fma).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlLangInstPackage.LANG_INST_MODEL__FMA, null, msgs);
      if (newFma != null)
        msgs = ((InternalEObject)newFma).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlLangInstPackage.LANG_INST_MODEL__FMA, null, msgs);
      msgs = basicSetFma(newFma, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.LANG_INST_MODEL__FMA, newFma, newFma));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreModelAdapter getCma() {
    return cma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCma(CoreModelAdapter newCma, NotificationChain msgs) {
    CoreModelAdapter oldCma = cma;
    cma = newCma;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.LANG_INST_MODEL__CMA, oldCma, newCma);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCma(CoreModelAdapter newCma) {
    if (newCma != cma) {
      NotificationChain msgs = null;
      if (cma != null)
        msgs = ((InternalEObject)cma).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlLangInstPackage.LANG_INST_MODEL__CMA, null, msgs);
      if (newCma != null)
        msgs = ((InternalEObject)newCma).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlLangInstPackage.LANG_INST_MODEL__CMA, null, msgs);
      msgs = basicSetCma(newCma, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VmlLangInstPackage.LANG_INST_MODEL__CMA, newCma, newCma));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionDescriptor> getActions() {
    if (actions == null) {
      actions = new EObjectContainmentEList<ActionDescriptor>(ActionDescriptor.class, this, VmlLangInstPackage.LANG_INST_MODEL__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DesignatorDescriptor> getDesignators() {
    if (designators == null) {
      designators = new EObjectContainmentEList<DesignatorDescriptor>(DesignatorDescriptor.class, this, VmlLangInstPackage.LANG_INST_MODEL__DESIGNATORS);
    }
    return designators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case VmlLangInstPackage.LANG_INST_MODEL__FMA:
        return basicSetFma(null, msgs);
      case VmlLangInstPackage.LANG_INST_MODEL__CMA:
        return basicSetCma(null, msgs);
      case VmlLangInstPackage.LANG_INST_MODEL__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case VmlLangInstPackage.LANG_INST_MODEL__DESIGNATORS:
        return ((InternalEList<?>)getDesignators()).basicRemove(otherEnd, msgs);
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
    switch (featureID) {
      case VmlLangInstPackage.LANG_INST_MODEL__NAME:
        return getName();
      case VmlLangInstPackage.LANG_INST_MODEL__FMA:
        return getFma();
      case VmlLangInstPackage.LANG_INST_MODEL__CMA:
        return getCma();
      case VmlLangInstPackage.LANG_INST_MODEL__ACTIONS:
        return getActions();
      case VmlLangInstPackage.LANG_INST_MODEL__DESIGNATORS:
        return getDesignators();
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
    switch (featureID) {
      case VmlLangInstPackage.LANG_INST_MODEL__NAME:
        setName((String)newValue);
        return;
      case VmlLangInstPackage.LANG_INST_MODEL__FMA:
        setFma((FeatureModelAdapter)newValue);
        return;
      case VmlLangInstPackage.LANG_INST_MODEL__CMA:
        setCma((CoreModelAdapter)newValue);
        return;
      case VmlLangInstPackage.LANG_INST_MODEL__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends ActionDescriptor>)newValue);
        return;
      case VmlLangInstPackage.LANG_INST_MODEL__DESIGNATORS:
        getDesignators().clear();
        getDesignators().addAll((Collection<? extends DesignatorDescriptor>)newValue);
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
      case VmlLangInstPackage.LANG_INST_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VmlLangInstPackage.LANG_INST_MODEL__FMA:
        setFma((FeatureModelAdapter)null);
        return;
      case VmlLangInstPackage.LANG_INST_MODEL__CMA:
        setCma((CoreModelAdapter)null);
        return;
      case VmlLangInstPackage.LANG_INST_MODEL__ACTIONS:
        getActions().clear();
        return;
      case VmlLangInstPackage.LANG_INST_MODEL__DESIGNATORS:
        getDesignators().clear();
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
      case VmlLangInstPackage.LANG_INST_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VmlLangInstPackage.LANG_INST_MODEL__FMA:
        return fma != null;
      case VmlLangInstPackage.LANG_INST_MODEL__CMA:
        return cma != null;
      case VmlLangInstPackage.LANG_INST_MODEL__ACTIONS:
        return actions != null && !actions.isEmpty();
      case VmlLangInstPackage.LANG_INST_MODEL__DESIGNATORS:
        return designators != null && !designators.isEmpty();
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

} //LangInstModelImpl
