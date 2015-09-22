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
 * A representation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getSubConcerns <em>Sub Concerns</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getVariants <em>Variants</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getPointcuts <em>Pointcuts</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getConcern_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sub Concerns</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Concerns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Concerns</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getConcern_SubConcerns()
   * @model containment="true"
   * @generated
   */
  EList<Concern> getSubConcerns();

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getConcern_Variants()
   * @model containment="true"
   * @generated
   */
  EList<Variant> getVariants();

  /**
   * Returns the value of the '<em><b>Pointcuts</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointcuts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointcuts</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getConcern_Pointcuts()
   * @model containment="true"
   * @generated
   */
  EList<PointCut> getPointcuts();

} // Concern
