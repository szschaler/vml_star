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
 * A representation of the model object '<em><b>Core Model Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef#getElements <em>Elements</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef#getCoreURI <em>Core URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getCoreModelRef()
 * @model
 * @generated
 */
public interface CoreModelRef extends EObject {
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getCoreModelRef_Elements()
   * @model containment="true" derived="true"
   * @generated
   */
  EList<EObject> getElements();

  /**
   * Returns the value of the '<em><b>Core URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Core URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core URI</em>' attribute.
   * @see #setCoreURI(String)
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getCoreModelRef_CoreURI()
   * @model
   * @generated
   */
  String getCoreURI();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef#getCoreURI <em>Core URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Core URI</em>' attribute.
   * @see #getCoreURI()
   * @generated
   */
  void setCoreURI(String value);

} // CoreModelRef
