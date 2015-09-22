/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.lancs.comp.vmlLangInst.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmlLangInstFactoryImpl extends EFactoryImpl implements VmlLangInstFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VmlLangInstFactory init() {
    try {
      VmlLangInstFactory theVmlLangInstFactory = (VmlLangInstFactory)EPackage.Registry.INSTANCE.getEFactory("http://uk.ac.lancs.comp/vmlstar.lang_inst"); 
      if (theVmlLangInstFactory != null) {
        return theVmlLangInstFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VmlLangInstFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlLangInstFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case VmlLangInstPackage.LANG_INST_MODEL: return createLangInstModel();
      case VmlLangInstPackage.FEATURE_MODEL_ADAPTER: return createFeatureModelAdapter();
      case VmlLangInstPackage.CORE_MODEL_ADAPTER: return createCoreModelAdapter();
      case VmlLangInstPackage.ACTION_DESCRIPTOR: return createActionDescriptor();
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR: return createDesignatorDescriptor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangInstModel createLangInstModel() {
    LangInstModelImpl langInstModel = new LangInstModelImpl();
    return langInstModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureModelAdapter createFeatureModelAdapter() {
    FeatureModelAdapterImpl featureModelAdapter = new FeatureModelAdapterImpl();
    return featureModelAdapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreModelAdapter createCoreModelAdapter() {
    CoreModelAdapterImpl coreModelAdapter = new CoreModelAdapterImpl();
    return coreModelAdapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDescriptor createActionDescriptor() {
    ActionDescriptorImpl actionDescriptor = new ActionDescriptorImpl();
    return actionDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DesignatorDescriptor createDesignatorDescriptor() {
    DesignatorDescriptorImpl designatorDescriptor = new DesignatorDescriptorImpl();
    return designatorDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlLangInstPackage getVmlLangInstPackage() {
    return (VmlLangInstPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VmlLangInstPackage getPackage() {
    return VmlLangInstPackage.eINSTANCE;
  }

} //VmlLangInstFactoryImpl
