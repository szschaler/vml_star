/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCE Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOperator#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getPCEOperator()
 * @model abstract="true"
 * @generated
 */
public interface PCEOperator extends PointCutExpression {
  /**
   * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operands</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getPCEOperator_Operands()
   * @model containment="true"
   * @generated
   */
  EList<PointCutExpression> getOperands();

} // PCEOperator
