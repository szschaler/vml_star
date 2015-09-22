/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lang Inst Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getFma <em>Fma</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getCma <em>Cma</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getDesignators <em>Designators</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getLangInstModel()
 * @model annotation="comment value='A model to describe a language extension for VML*'"
 * @generated
 */
public interface LangInstModel extends EObject {
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
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getLangInstModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fma</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fma</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fma</em>' containment reference.
   * @see #setFma(FeatureModelAdapter)
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getLangInstModel_Fma()
   * @model containment="true"
   * @generated
   */
  FeatureModelAdapter getFma();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getFma <em>Fma</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fma</em>' containment reference.
   * @see #getFma()
   * @generated
   */
  void setFma(FeatureModelAdapter value);

  /**
   * Returns the value of the '<em><b>Cma</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cma</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cma</em>' containment reference.
   * @see #setCma(CoreModelAdapter)
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getLangInstModel_Cma()
   * @model containment="true"
   * @generated
   */
  CoreModelAdapter getCma();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel#getCma <em>Cma</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cma</em>' containment reference.
   * @see #getCma()
   * @generated
   */
  void setCma(CoreModelAdapter value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getLangInstModel_Actions()
   * @model containment="true"
   * @generated
   */
  EList<ActionDescriptor> getActions();

  /**
   * Returns the value of the '<em><b>Designators</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Designators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Designators</em>' containment reference list.
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getLangInstModel_Designators()
   * @model containment="true"
   * @generated
   */
  EList<DesignatorDescriptor> getDesignators();

} // LangInstModel
