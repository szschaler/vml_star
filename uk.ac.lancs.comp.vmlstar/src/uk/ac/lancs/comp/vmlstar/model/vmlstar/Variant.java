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
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getOnSelect <em>On Select</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getOnUnSelect <em>On Un Select</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getVariant()
 * @model
 * @generated
 */
public interface Variant extends EObject {
  /**
   * Returns the value of the '<em><b>On Select</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Select</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Select</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getVariant_OnSelect()
   * @model containment="true"
   * @generated
   */
  EList<Action> getOnSelect();

  /**
   * Returns the value of the '<em><b>On Un Select</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Un Select</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Un Select</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getVariant_OnUnSelect()
   * @model containment="true"
   * @generated
   */
  EList<Action> getOnUnSelect();

  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(Feature)
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getVariant_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // Variant
