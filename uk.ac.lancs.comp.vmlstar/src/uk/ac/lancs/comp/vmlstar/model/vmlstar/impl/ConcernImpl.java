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
import uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ConcernImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ConcernImpl#getSubConcerns <em>Sub Concerns</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ConcernImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ConcernImpl#getPointcuts <em>Pointcuts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcernImpl extends EObjectImpl implements Concern {
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
   * The cached value of the '{@link #getSubConcerns() <em>Sub Concerns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubConcerns()
   * @generated
   * @ordered
   */
  protected EList<Concern> subConcerns;

  /**
   * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariants()
   * @generated
   * @ordered
   */
  protected EList<Variant> variants;

  /**
   * The cached value of the '{@link #getPointcuts() <em>Pointcuts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcuts()
   * @generated
   * @ordered
   */
  protected EList<PointCut> pointcuts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcernImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlstarPackage.Literals.CONCERN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VmlstarPackage.CONCERN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Concern> getSubConcerns() {
    if (subConcerns == null)
    {
      subConcerns = new EObjectContainmentEList<Concern>(Concern.class, this, VmlstarPackage.CONCERN__SUB_CONCERNS);
    }
    return subConcerns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variant> getVariants() {
    if (variants == null)
    {
      variants = new EObjectContainmentEList<Variant>(Variant.class, this, VmlstarPackage.CONCERN__VARIANTS);
    }
    return variants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PointCut> getPointcuts() {
    if (pointcuts == null)
    {
      pointcuts = new EObjectContainmentEList<PointCut>(PointCut.class, this, VmlstarPackage.CONCERN__POINTCUTS);
    }
    return pointcuts;
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
      case VmlstarPackage.CONCERN__SUB_CONCERNS:
        return ((InternalEList<?>)getSubConcerns()).basicRemove(otherEnd, msgs);
      case VmlstarPackage.CONCERN__VARIANTS:
        return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
      case VmlstarPackage.CONCERN__POINTCUTS:
        return ((InternalEList<?>)getPointcuts()).basicRemove(otherEnd, msgs);
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
      case VmlstarPackage.CONCERN__NAME:
        return getName();
      case VmlstarPackage.CONCERN__SUB_CONCERNS:
        return getSubConcerns();
      case VmlstarPackage.CONCERN__VARIANTS:
        return getVariants();
      case VmlstarPackage.CONCERN__POINTCUTS:
        return getPointcuts();
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
      case VmlstarPackage.CONCERN__NAME:
        setName((String)newValue);
        return;
      case VmlstarPackage.CONCERN__SUB_CONCERNS:
        getSubConcerns().clear();
        getSubConcerns().addAll((Collection<? extends Concern>)newValue);
        return;
      case VmlstarPackage.CONCERN__VARIANTS:
        getVariants().clear();
        getVariants().addAll((Collection<? extends Variant>)newValue);
        return;
      case VmlstarPackage.CONCERN__POINTCUTS:
        getPointcuts().clear();
        getPointcuts().addAll((Collection<? extends PointCut>)newValue);
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
      case VmlstarPackage.CONCERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VmlstarPackage.CONCERN__SUB_CONCERNS:
        getSubConcerns().clear();
        return;
      case VmlstarPackage.CONCERN__VARIANTS:
        getVariants().clear();
        return;
      case VmlstarPackage.CONCERN__POINTCUTS:
        getPointcuts().clear();
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
      case VmlstarPackage.CONCERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VmlstarPackage.CONCERN__SUB_CONCERNS:
        return subConcerns != null && !subConcerns.isEmpty();
      case VmlstarPackage.CONCERN__VARIANTS:
        return variants != null && !variants.isEmpty();
      case VmlstarPackage.CONCERN__POINTCUTS:
        return pointcuts != null && !pointcuts.isEmpty();
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

} //ConcernImpl
