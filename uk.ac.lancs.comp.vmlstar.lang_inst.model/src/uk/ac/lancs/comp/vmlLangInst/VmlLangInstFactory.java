/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage
 * @generated
 */
public interface VmlLangInstFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VmlLangInstFactory eINSTANCE = uk.ac.lancs.comp.vmlLangInst.impl.VmlLangInstFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Lang Inst Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lang Inst Model</em>'.
   * @generated
   */
  LangInstModel createLangInstModel();

  /**
   * Returns a new object of class '<em>Feature Model Adapter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Model Adapter</em>'.
   * @generated
   */
  FeatureModelAdapter createFeatureModelAdapter();

  /**
   * Returns a new object of class '<em>Core Model Adapter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Core Model Adapter</em>'.
   * @generated
   */
  CoreModelAdapter createCoreModelAdapter();

  /**
   * Returns a new object of class '<em>Action Descriptor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Descriptor</em>'.
   * @generated
   */
  ActionDescriptor createActionDescriptor();

  /**
   * Returns a new object of class '<em>Designator Descriptor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Designator Descriptor</em>'.
   * @generated
   */
  DesignatorDescriptor createDesignatorDescriptor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VmlLangInstPackage getVmlLangInstPackage();

} //VmlLangInstFactory
