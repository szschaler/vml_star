/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage
 * @generated
 */
public class VmlstarAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VmlstarPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlstarAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = VmlstarPackage.eINSTANCE;
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
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected VmlstarSwitch<Adapter> modelSwitch =
    new VmlstarSwitch<Adapter>()
    {
      @Override
      public Adapter caseVmlModel(VmlModel object)
      {
        return createVmlModelAdapter();
      }
      @Override
      public Adapter caseFeatureModelRef(FeatureModelRef object)
      {
        return createFeatureModelRefAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseCoreModelRef(CoreModelRef object)
      {
        return createCoreModelRefAdapter();
      }
      @Override
      public Adapter caseConcern(Concern object)
      {
        return createConcernAdapter();
      }
      @Override
      public Adapter caseVariant(Variant object)
      {
        return createVariantAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseElementReference(ElementReference object)
      {
        return createElementReferenceAdapter();
      }
      @Override
      public Adapter casePointCutReference(PointCutReference object)
      {
        return createPointCutReferenceAdapter();
      }
      @Override
      public Adapter casePointCut(PointCut object)
      {
        return createPointCutAdapter();
      }
      @Override
      public Adapter casePointCutExpression(PointCutExpression object)
      {
        return createPointCutExpressionAdapter();
      }
      @Override
      public Adapter casePCEOperator(PCEOperator object)
      {
        return createPCEOperatorAdapter();
      }
      @Override
      public Adapter casePCEAndOperator(PCEAndOperator object)
      {
        return createPCEAndOperatorAdapter();
      }
      @Override
      public Adapter casePCEOrOperator(PCEOrOperator object)
      {
        return createPCEOrOperatorAdapter();
      }
      @Override
      public Adapter casePCDesignator(PCDesignator object)
      {
        return createPCDesignatorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel <em>Vml Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlModel
   * @generated
   */
  public Adapter createVmlModelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef <em>Feature Model Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.FeatureModelRef
   * @generated
   */
  public Adapter createFeatureModelRefAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Feature
   * @generated
   */
  public Adapter createFeatureAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef <em>Core Model Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef
   * @generated
   */
  public Adapter createCoreModelRefAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern <em>Concern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Concern
   * @generated
   */
  public Adapter createConcernAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Variant
   * @generated
   */
  public Adapter createVariantAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.Action
   * @generated
   */
  public Adapter createActionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference <em>Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.ElementReference
   * @generated
   */
  public Adapter createElementReferenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference <em>Point Cut Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutReference
   * @generated
   */
  public Adapter createPointCutReferenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut <em>Point Cut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCut
   * @generated
   */
  public Adapter createPointCutAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutExpression <em>Point Cut Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PointCutExpression
   * @generated
   */
  public Adapter createPointCutExpressionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOperator <em>PCE Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOperator
   * @generated
   */
  public Adapter createPCEOperatorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEAndOperator <em>PCE And Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEAndOperator
   * @generated
   */
  public Adapter createPCEAndOperatorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOrOperator <em>PCE Or Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCEOrOperator
   * @generated
   */
  public Adapter createPCEOrOperatorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.lancs.comp.vmlstar.model.vmlstar.PCDesignator <em>PC Designator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.PCDesignator
   * @generated
   */
  public Adapter createPCDesignatorAdapter() {
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

} //VmlstarAdapterFactory
