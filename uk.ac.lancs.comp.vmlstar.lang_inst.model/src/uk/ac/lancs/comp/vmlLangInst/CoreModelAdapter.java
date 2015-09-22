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
 * A representation of the model object '<em><b>Core Model Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter#getAdapterClass <em>Adapter Class</em>}</li>
 *   <li>{@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter#getAdapterOperation <em>Adapter Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getCoreModelAdapter()
 * @model annotation="comment value='References an operation to use in determining the set of model elements for a given reference'"
 * @generated
 */
public interface CoreModelAdapter extends EObject {
  /**
   * Returns the value of the '<em><b>Adapter Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adapter Class</em>' attribute.
   * @see #setAdapterClass(String)
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getCoreModelAdapter_AdapterClass()
   * @model annotation="comment value='Name of the class containing the operaton'"
   * @generated
   */
  String getAdapterClass();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter#getAdapterClass <em>Adapter Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adapter Class</em>' attribute.
   * @see #getAdapterClass()
   * @generated
   */
  void setAdapterClass(String value);

  /**
   * Returns the value of the '<em><b>Adapter Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adapter Operation</em>' attribute.
   * @see #setAdapterOperation(String)
   * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage#getCoreModelAdapter_AdapterOperation()
   * @model annotation="comment value='Name of the operation. This operation must have the following signature:\r\n            EObject[*] getModelElements (String uri);'"
   * @generated
   */
  String getAdapterOperation();

  /**
   * Sets the value of the '{@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter#getAdapterOperation <em>Adapter Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adapter Operation</em>' attribute.
   * @see #getAdapterOperation()
   * @generated
   */
  void setAdapterOperation(String value);

} // CoreModelAdapter
