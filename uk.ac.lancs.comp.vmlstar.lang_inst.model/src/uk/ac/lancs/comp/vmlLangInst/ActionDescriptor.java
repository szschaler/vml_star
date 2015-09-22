/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getNumParams <em>Num Params</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getEvaluatorClass <em>Evaluator Class</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getEvaluatorMethod <em>Evaluator Method</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getCheckMethod <em>Check Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getActionDescriptor()
 * @model annotation="comment value='Describes a custom action'"
 * @generated
 */
public interface ActionDescriptor extends EObject {
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
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getActionDescriptor_Name()
   * @model annotation="comment value='The name of the action. This will be used to invoke the action from a VML script.'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Num Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Params</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Params</em>' attribute.
   * @see #setNumParams(int)
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getActionDescriptor_NumParams()
   * @model annotation="comment value='Number of parameters the action takes.'"
   * @generated
   */
  int getNumParams();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getNumParams <em>Num Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Params</em>' attribute.
   * @see #getNumParams()
   * @generated
   */
  void setNumParams(int value);

  /**
   * Returns the value of the '<em><b>Evaluator Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluator Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluator Class</em>' attribute.
   * @see #setEvaluatorClass(String)
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getActionDescriptor_EvaluatorClass()
   * @model annotation="comment value='A class containing methods for executing the action and checking type-safety constraints.'"
   * @generated
   */
  String getEvaluatorClass();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getEvaluatorClass <em>Evaluator Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluator Class</em>' attribute.
   * @see #getEvaluatorClass()
   * @generated
   */
  void setEvaluatorClass(String value);

  /**
   * Returns the value of the '<em><b>Evaluator Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluator Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluator Method</em>' attribute.
   * @see #setEvaluatorMethod(String)
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getActionDescriptor_EvaluatorMethod()
   * @model annotation="comment value='Name of an operation implementing evaluation of the action. This must have the following signature:\r\n            void invoke (ElementReference[*] parameters)'"
   * @generated
   */
  String getEvaluatorMethod();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getEvaluatorMethod <em>Evaluator Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluator Method</em>' attribute.
   * @see #getEvaluatorMethod()
   * @generated
   */
  void setEvaluatorMethod(String value);

  /**
   * Returns the value of the '<em><b>Check Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check Method</em>' attribute.
   * @see #setCheckMethod(String)
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getActionDescriptor_CheckMethod()
   * @model annotation="comment value='Name of an operation implementing type checking of the action\'s parameters. This must have the following signature:\r\n            boolean checkParameters (ElementReference[*] parameters)'"
   * @generated
   */
  String getCheckMethod();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor#getCheckMethod <em>Check Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Method</em>' attribute.
   * @see #getCheckMethod()
   * @generated
   */
  void setCheckMethod(String value);

} // ActionDescriptor
