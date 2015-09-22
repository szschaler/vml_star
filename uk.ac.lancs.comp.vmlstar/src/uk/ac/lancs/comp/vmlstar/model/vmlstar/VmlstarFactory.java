/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage
 * @generated
 */
public interface VmlstarFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VmlstarFactory eINSTANCE = uk.ac.lancs.comp.vmlstar.model.vmlstar.impl.VmlstarFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Vml Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vml Model</em>'.
   * @generated
   */
  VmlModel createVmlModel();

  /**
   * Returns a new object of class '<em>Feature Model Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Model Ref</em>'.
   * @generated
   */
  FeatureModelRef createFeatureModelRef();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Core Model Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Core Model Ref</em>'.
   * @generated
   */
  CoreModelRef createCoreModelRef();

  /**
   * Returns a new object of class '<em>Concern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concern</em>'.
   * @generated
   */
  Concern createConcern();

  /**
   * Returns a new object of class '<em>Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variant</em>'.
   * @generated
   */
  Variant createVariant();

  /**
   * Returns a new object of class '<em>Point Cut Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point Cut Reference</em>'.
   * @generated
   */
  PointCutReference createPointCutReference();

  /**
   * Returns a new object of class '<em>Point Cut</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point Cut</em>'.
   * @generated
   */
  PointCut createPointCut();

  /**
   * Returns a new object of class '<em>PCE And Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PCE And Operator</em>'.
   * @generated
   */
  PCEAndOperator createPCEAndOperator();

  /**
   * Returns a new object of class '<em>PCE Or Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PCE Or Operator</em>'.
   * @generated
   */
  PCEOrOperator createPCEOrOperator();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VmlstarPackage getVmlstarPackage();

} //VmlstarFactory
