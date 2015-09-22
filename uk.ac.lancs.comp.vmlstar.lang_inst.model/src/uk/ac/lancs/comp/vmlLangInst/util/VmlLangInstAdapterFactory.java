/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.lancs.comp.vmlLangInst.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage
 * @generated
 */
public class VmlLangInstAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VmlLangInstPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlLangInstAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = VmlLangInstPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VmlLangInstSwitch<Adapter> modelSwitch =
    new VmlLangInstSwitch<Adapter>() {
      @Override
      public Adapter caseLangInstModel(LangInstModel object) {
        return createLangInstModelAdapter();
      }
      @Override
      public Adapter caseFeatureModelAdapter(FeatureModelAdapter object) {
        return createFeatureModelAdapterAdapter();
      }
      @Override
      public Adapter caseCoreModelAdapter(CoreModelAdapter object) {
        return createCoreModelAdapterAdapter();
      }
      @Override
      public Adapter caseActionDescriptor(ActionDescriptor object) {
        return createActionDescriptorAdapter();
      }
      @Override
      public Adapter caseDesignatorDescriptor(DesignatorDescriptor object) {
        return createDesignatorDescriptorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlLangInst.LangInstModel <em>Lang Inst Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlLangInst.LangInstModel
   * @generated
   */
  public Adapter createLangInstModelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter <em>Feature Model Adapter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter
   * @generated
   */
  public Adapter createFeatureModelAdapterAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter <em>Core Model Adapter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter
   * @generated
   */
  public Adapter createCoreModelAdapterAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor <em>Action Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlLangInst.ActionDescriptor
   * @generated
   */
  public Adapter createActionDescriptorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor <em>Designator Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor
   * @generated
   */
  public Adapter createDesignatorDescriptorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //VmlLangInstAdapterFactory
