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
 * A representation of the model object '<em><b>Designator Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getNumParams <em>Num Params</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getEvaluatorClass <em>Evaluator Class</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getEvaluatorMethod <em>Evaluator Method</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getCheckMethod <em>Check Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getDesignatorDescriptor()
 * @model annotation="comment value='Describes a custom designator'"
 * @generated
 */
public interface DesignatorDescriptor extends EObject {
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
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getDesignatorDescriptor_Name()
   * @model annotation="comment value='The name of the designator. This will be used to invoke the designator from a VML script.'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getName <em>Name</em>}' attribute.
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
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getDesignatorDescriptor_NumParams()
   * @model annotation="comment value='Number of parameters the designator takes.'"
   * @generated
   */
  int getNumParams();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getNumParams <em>Num Params</em>}' attribute.
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
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getDesignatorDescriptor_EvaluatorClass()
   * @model annotation="comment value='A class containing methods for evaluating the designator and checking type-safety constraints.'"
   * @generated
   */
  String getEvaluatorClass();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getEvaluatorClass <em>Evaluator Class</em>}' attribute.
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
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getDesignatorDescriptor_EvaluatorMethod()
   * @model annotation="comment value='Name of an operation implementing evaluation of the designator. This must have the following signature:\r\n            ElementReference[*] evaluate (CoreModelRef core, String[*] parameters)'"
   * @generated
   */
  String getEvaluatorMethod();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getEvaluatorMethod <em>Evaluator Method</em>}' attribute.
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
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getDesignatorDescriptor_CheckMethod()
   * @model annotation="comment value='Name of an operation implementing type checking of the designator\'s parameters. This must have the following signature:\r\n            boolean checkParameters (CoreModelRef core, String[*] parameters)'"
   * @generated
   */
  String getCheckMethod();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor#getCheckMethod <em>Check Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Method</em>' attribute.
   * @see #getCheckMethod()
   * @generated
   */
  void setCheckMethod(String value);

} // DesignatorDescriptor
