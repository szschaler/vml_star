/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.ElementReferenceImpl#getReferencedElements <em>Referenced Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementReferenceImpl extends EObjectImpl implements ElementReference {
  /**
   * The cached value of the '{@link #getReferencedElements() <em>Referenced Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedElements()
   * @generated
   * @ordered
   */
  protected EList<EObject> referencedElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementReferenceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VmlstarPackage.Literals.ELEMENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getReferencedElements() {
    if (referencedElements == null)
    {
      referencedElements = new EObjectResolvingEList<EObject>(EObject.class, this, VmlstarPackage.ELEMENT_REFERENCE__REFERENCED_ELEMENTS);
    }
    return referencedElements;
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
      case VmlstarPackage.ELEMENT_REFERENCE__REFERENCED_ELEMENTS:
        return getReferencedElements();
    }
    return super.eGet(featureID, resolve, coreType);
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
      case VmlstarPackage.ELEMENT_REFERENCE__REFERENCED_ELEMENTS:
        return referencedElements != null && !referencedElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ElementReferenceImpl
