/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor;
import uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignatorDescriptorItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DesignatorDescriptorItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addNamePropertyDescriptor(object);
      addNumParamsPropertyDescriptor(object);
      addEvaluatorClassPropertyDescriptor(object);
      addEvaluatorMethodPropertyDescriptor(object);
      addCheckMethodPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DesignatorDescriptor_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DesignatorDescriptor_name_feature", "_UI_DesignatorDescriptor_type"),
         VmlLangInstPackage.Literals.DESIGNATOR_DESCRIPTOR__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Num Params feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNumParamsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DesignatorDescriptor_numParams_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DesignatorDescriptor_numParams_feature", "_UI_DesignatorDescriptor_type"),
         VmlLangInstPackage.Literals.DESIGNATOR_DESCRIPTOR__NUM_PARAMS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Evaluator Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEvaluatorClassPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DesignatorDescriptor_evaluatorClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DesignatorDescriptor_evaluatorClass_feature", "_UI_DesignatorDescriptor_type"),
         VmlLangInstPackage.Literals.DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Evaluator Method feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEvaluatorMethodPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DesignatorDescriptor_evaluatorMethod_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DesignatorDescriptor_evaluatorMethod_feature", "_UI_DesignatorDescriptor_type"),
         VmlLangInstPackage.Literals.DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Check Method feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCheckMethodPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DesignatorDescriptor_checkMethod_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DesignatorDescriptor_checkMethod_feature", "_UI_DesignatorDescriptor_type"),
         VmlLangInstPackage.Literals.DESIGNATOR_DESCRIPTOR__CHECK_METHOD,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns DesignatorDescriptor.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/DesignatorDescriptor"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((DesignatorDescriptor)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_DesignatorDescriptor_type") :
      getString("_UI_DesignatorDescriptor_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(DesignatorDescriptor.class)) {
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NAME:
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__NUM_PARAMS:
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_CLASS:
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__EVALUATOR_METHOD:
      case VmlLangInstPackage.DESIGNATOR_DESCRIPTOR__CHECK_METHOD:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return Vml_langinstEditPlugin.INSTANCE;
  }

}
