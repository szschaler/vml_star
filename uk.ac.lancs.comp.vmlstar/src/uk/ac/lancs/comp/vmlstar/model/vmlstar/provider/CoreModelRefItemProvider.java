/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlstar.model.vmlstar.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarFactory;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.lancs.comp.vmlstar.model.vmlstar.CoreModelRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreModelRefItemProvider
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
  public CoreModelRefItemProvider(AdapterFactory adapterFactory) {
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

      addCoreURIPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Core URI feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCoreURIPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_CoreModelRef_coreURI_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_CoreModelRef_coreURI_feature", "_UI_CoreModelRef_type"),
         VmlstarPackage.Literals.CORE_MODEL_REF__CORE_URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns CoreModelRef.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/CoreModelRef"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((CoreModelRef)object).getCoreURI();
    return label == null || label.length() == 0 ?
      getString("_UI_CoreModelRef_type") :
      getString("_UI_CoreModelRef_type") + " " + label;
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

    switch (notification.getFeatureID(CoreModelRef.class)) {
      case VmlstarPackage.CORE_MODEL_REF__CORE_URI:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case VmlstarPackage.CORE_MODEL_REF__ELEMENTS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createVmlModel()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createFeatureModelRef()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createFeature()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createCoreModelRef()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createConcern()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createVariant()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createPointCutReference()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createPointCut()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createPCEAndOperator()));

    newChildDescriptors.add
      (createChildParameter
        (VmlstarPackage.Literals.CORE_MODEL_REF__ELEMENTS,
         VmlstarFactory.eINSTANCE.createPCEOrOperator()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return VmlEditPlugin.INSTANCE;
  }

}
