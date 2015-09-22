/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage
 * @generated
 */
public class VmlstarSwitch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VmlstarPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlstarSwitch() {
    if (modelPackage == null)
    {
      modelPackage = VmlstarPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case VmlstarPackage.VML_MODEL:
      {
        VmlModel vmlModel = (VmlModel)theEObject;
        T result = caseVmlModel(vmlModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.FEATURE_MODEL_REF:
      {
        FeatureModelRef featureModelRef = (FeatureModelRef)theEObject;
        T result = caseFeatureModelRef(featureModelRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.CORE_MODEL_REF:
      {
        CoreModelRef coreModelRef = (CoreModelRef)theEObject;
        T result = caseCoreModelRef(coreModelRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.CONCERN:
      {
        Concern concern = (Concern)theEObject;
        T result = caseConcern(concern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.VARIANT:
      {
        Variant variant = (Variant)theEObject;
        T result = caseVariant(variant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.ELEMENT_REFERENCE:
      {
        ElementReference elementReference = (ElementReference)theEObject;
        T result = caseElementReference(elementReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.POINT_CUT_REFERENCE:
      {
        PointCutReference pointCutReference = (PointCutReference)theEObject;
        T result = casePointCutReference(pointCutReference);
        if (result == null) result = caseElementReference(pointCutReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.POINT_CUT:
      {
        PointCut pointCut = (PointCut)theEObject;
        T result = casePointCut(pointCut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.POINT_CUT_EXPRESSION:
      {
        PointCutExpression pointCutExpression = (PointCutExpression)theEObject;
        T result = casePointCutExpression(pointCutExpression);
        if (result == null) result = caseElementReference(pointCutExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.PCE_OPERATOR:
      {
        PCEOperator pceOperator = (PCEOperator)theEObject;
        T result = casePCEOperator(pceOperator);
        if (result == null) result = casePointCutExpression(pceOperator);
        if (result == null) result = caseElementReference(pceOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.PCE_AND_OPERATOR:
      {
        PCEAndOperator pceAndOperator = (PCEAndOperator)theEObject;
        T result = casePCEAndOperator(pceAndOperator);
        if (result == null) result = casePCEOperator(pceAndOperator);
        if (result == null) result = casePointCutExpression(pceAndOperator);
        if (result == null) result = caseElementReference(pceAndOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.PCE_OR_OPERATOR:
      {
        PCEOrOperator pceOrOperator = (PCEOrOperator)theEObject;
        T result = casePCEOrOperator(pceOrOperator);
        if (result == null) result = casePCEOperator(pceOrOperator);
        if (result == null) result = casePointCutExpression(pceOrOperator);
        if (result == null) result = caseElementReference(pceOrOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlstarPackage.PC_DESIGNATOR:
      {
        PCDesignator pcDesignator = (PCDesignator)theEObject;
        T result = casePCDesignator(pcDesignator);
        if (result == null) result = casePointCutExpression(pcDesignator);
        if (result == null) result = caseElementReference(pcDesignator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vml Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vml Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVmlModel(VmlModel object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Model Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Model Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureModelRef(FeatureModelRef object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Core Model Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Core Model Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoreModelRef(CoreModelRef object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcern(Concern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariant(Variant object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementReference(ElementReference object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point Cut Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Cut Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointCutReference(PointCutReference object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point Cut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Cut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointCut(PointCut object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point Cut Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Cut Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointCutExpression(PointCutExpression object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PCE Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PCE Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePCEOperator(PCEOperator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PCE And Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PCE And Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePCEAndOperator(PCEAndOperator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PCE Or Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PCE Or Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePCEOrOperator(PCEOrOperator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PC Designator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PC Designator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePCDesignator(PCDesignator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object) {
    return null;
  }

} //VmlstarSwitch
