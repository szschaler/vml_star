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
 * A representation of the model object '<em><b>Vml Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getCoreModel <em>Core Model</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getConcerns <em>Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getVmlModel()
 * @model
 * @generated
 */
public interface VmlModel extends EObject {
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference.
   * @see #setFeatures(FeatureModelRef)
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getVmlModel_Features()
   * @model containment="true"
   * @generated
   */
  FeatureModelRef getFeatures();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getFeatures <em>Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features</em>' containment reference.
   * @see #getFeatures()
   * @generated
   */
  void setFeatures(FeatureModelRef value);

  /**
   * Returns the value of the '<em><b>Core Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Core Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core Model</em>' containment reference.
   * @see #setCoreModel(CoreModelRef)
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getVmlModel_CoreModel()
   * @model containment="true"
   * @generated
   */
  CoreModelRef getCoreModel();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel#getCoreModel <em>Core Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Core Model</em>' containment reference.
   * @see #getCoreModel()
   * @generated
   */
  void setCoreModel(CoreModelRef value);

  /**
   * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concerns</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage#getVmlModel_Concerns()
   * @model containment="true"
   * @generated
   */
  EList<Concern> getConcerns();

} // VmlModel
