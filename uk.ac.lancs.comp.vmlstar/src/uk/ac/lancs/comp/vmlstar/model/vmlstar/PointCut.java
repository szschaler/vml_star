/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut#getPce <em>Pce</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getPointCut()
 * @model
 * @generated
 */
public interface PointCut extends EObject {
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
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getPointCut_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pce</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pce</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pce</em>' containment reference.
   * @see #setPce(PointCutExpression)
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getPointCut_Pce()
   * @model containment="true"
   * @generated
   */
  PointCutExpression getPce();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut#getPce <em>Pce</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pce</em>' containment reference.
   * @see #getPce()
   * @generated
   */
  void setPce(PointCutExpression value);

} // PointCut
