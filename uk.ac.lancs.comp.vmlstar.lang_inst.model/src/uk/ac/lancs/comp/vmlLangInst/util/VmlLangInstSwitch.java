/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uk.ac.lancs.comp.vmlLangInst.*;

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
 * @see uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage
 * @generated
 */
public class VmlLangInstSwitch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VmlLangInstPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlLangInstSwitch() {
    if (modelPackage == null) {
      modelPackage = VmlLangInstPackage.eINSTANCE;
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
    if (theEClass.eContainer() == modelPackage) {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else {
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
    switch (classifierID) {
      case VmlLangInstPackage.LANG_INST_MODEL: {
        LangInstModel langInstModel = (LangInstModel)theEObject;
        T result = caseLangInstModel(langInstModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlLangInstPackage.FEATURE_MODEL_ADAPTER: {
        FeatureModelAdapter featureModelAdapter = (FeatureModelAdapter)theEObject;
        T result = caseFeatureModelAdapter(featureModelAdapter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlLangInstPackage.CORE_MODEL_ADAPTER: {
        CoreModelAdapter coreModelAdapter = (CoreModelAdapter)theEObject;
        T result = caseCoreModelAdapter(coreModelAdapter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlLangInstPackage.ACTION_DESCRIPTOR: {
        ActionDescriptor actionDescriptor = (ActionDescriptor)theEObject;
        T result = caseActionDescriptor(actionDescriptor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR: {
        DesignatorDescriptor designatorDescriptor = (DesignatorDescriptor)theEObject;
        T result = caseDesignatorDescriptor(designatorDescriptor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lang Inst Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lang Inst Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLangInstModel(LangInstModel object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Model Adapter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Model Adapter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureModelAdapter(FeatureModelAdapter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Core Model Adapter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Core Model Adapter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoreModelAdapter(CoreModelAdapter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Descriptor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Descriptor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDescriptor(ActionDescriptor object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Designator Descriptor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Designator Descriptor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesignatorDescriptor(DesignatorDescriptor object) {
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

} //VmlLangInstSwitch
