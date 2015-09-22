/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference#getReferencedElements <em>Referenced Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getElementReference()
 * @model abstract="true"
 * @generated
 */
public interface ElementReference extends EObject {
  /**
   * Returns the value of the '<em><b>Referenced Elements</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Elements</em>' reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getElementReference_ReferencedElements()
   * @model changeable="false" derived="true"
   * @generated
   */
  EList<EObject> getReferencedElements();

} // ElementReference
