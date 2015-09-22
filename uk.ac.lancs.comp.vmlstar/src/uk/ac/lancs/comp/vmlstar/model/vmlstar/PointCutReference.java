/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Cut Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference#getPc <em>Pc</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getPointCutReference()
 * @model
 * @generated
 */
public interface PointCutReference extends ElementReference {
  /**
   * Returns the value of the '<em><b>Pc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pc</em>' reference.
   * @see #setPc(PointCut)
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getPointCutReference_Pc()
   * @model
   * @generated
   */
  PointCut getPc();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference#getPc <em>Pc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pc</em>' reference.
   * @see #getPc()
   * @generated
   */
  void setPc(PointCut value);

} // PointCutReference
