/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmlstarFactoryImpl extends EFactoryImpl implements VmlstarFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VmlstarFactory init() {
    try
    {
      VmlstarFactory theVmlstarFactory = (VmlstarFactory)EPackage.Registry.INSTANCE.getEFactory("http://uk.ac.lancs.comp/vmlstar"); 
      if (theVmlstarFactory != null)
      {
        return theVmlstarFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VmlstarFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlstarFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case VmlstarPackage.VML_MODEL: return createVmlModel();
      case VmlstarPackage.FEATURE_MODEL_REF: return createFeatureModelRef();
      case VmlstarPackage.FEATURE: return createFeature();
      case VmlstarPackage.CORE_MODEL_REF: return createCoreModelRef();
      case VmlstarPackage.CONCERN: return createConcern();
      case VmlstarPackage.VARIANT: return createVariant();
      case VmlstarPackage.POINT_CUT_REFERENCE: return createPointCutReference();
      case VmlstarPackage.POINT_CUT: return createPointCut();
      case VmlstarPackage.PCE_AND_OPERATOR: return createPCEAndOperator();
      case VmlstarPackage.PCE_OR_OPERATOR: return createPCEOrOperator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlModel createVmlModel() {
    VmlModelImpl vmlModel = new VmlModelImpl();
    return vmlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureModelRef createFeatureModelRef() {
    FeatureModelRefImpl featureModelRef = new FeatureModelRefImpl();
    return featureModelRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature() {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreModelRef createCoreModelRef() {
    CoreModelRefImpl coreModelRef = new CoreModelRefImpl();
    return coreModelRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concern createConcern() {
    ConcernImpl concern = new ConcernImpl();
    return concern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variant createVariant() {
    VariantImpl variant = new VariantImpl();
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointCutReference createPointCutReference() {
    PointCutReferenceImpl pointCutReference = new PointCutReferenceImpl();
    return pointCutReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointCut createPointCut() {
    PointCutImpl pointCut = new PointCutImpl();
    return pointCut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCEAndOperator createPCEAndOperator() {
    PCEAndOperatorImpl pceAndOperator = new PCEAndOperatorImpl();
    return pceAndOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCEOrOperator createPCEOrOperator() {
    PCEOrOperatorImpl pceOrOperator = new PCEOrOperatorImpl();
    return pceOrOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlstarPackage getVmlstarPackage() {
    return (VmlstarPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VmlstarPackage getPackage() {
    return VmlstarPackage.eINSTANCE;
  }

} //VmlstarFactoryImpl
