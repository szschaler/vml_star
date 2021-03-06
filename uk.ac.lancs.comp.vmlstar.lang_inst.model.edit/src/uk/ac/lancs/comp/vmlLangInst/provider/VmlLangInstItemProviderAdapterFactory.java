/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.lancs.comp.vmlLangInst.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.ac.lancs.comp.vmlLangInst.util.VmlLangInstAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VmlLangInstItemProviderAdapterFactory extends VmlLangInstAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmlLangInstItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link uk.ac.lancs.comp.vmlLangInst.LangInstModel} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LangInstModelItemProvider langInstModelItemProvider;

  /**
   * This creates an adapter for a {@link uk.ac.lancs.comp.vmlLangInst.LangInstModel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLangInstModelAdapter() {
    if (langInstModelItemProvider == null) {
      langInstModelItemProvider = new LangInstModelItemProvider(this);
    }

    return langInstModelItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureModelAdapterItemProvider featureModelAdapterItemProvider;

  /**
   * This creates an adapter for a {@link uk.ac.lancs.comp.vmlLangInst.FeatureModelAdapter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFeatureModelAdapterAdapter() {
    if (featureModelAdapterItemProvider == null) {
      featureModelAdapterItemProvider = new FeatureModelAdapterItemProvider(this);
    }

    return featureModelAdapterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoreModelAdapterItemProvider coreModelAdapterItemProvider;

  /**
   * This creates an adapter for a {@link uk.ac.lancs.comp.vmlLangInst.CoreModelAdapter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCoreModelAdapterAdapter() {
    if (coreModelAdapterItemProvider == null) {
      coreModelAdapterItemProvider = new CoreModelAdapterItemProvider(this);
    }

    return coreModelAdapterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionDescriptorItemProvider actionDescriptorItemProvider;

  /**
   * This creates an adapter for a {@link uk.ac.lancs.comp.vmlLangInst.ActionDescriptor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createActionDescriptorAdapter() {
    if (actionDescriptorItemProvider == null) {
      actionDescriptorItemProvider = new ActionDescriptorItemProvider(this);
    }

    return actionDescriptorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DesignatorDescriptorItemProvider designatorDescriptorItemProvider;

  /**
   * This creates an adapter for a {@link uk.ac.lancs.comp.vmlLangInst.DesignatorDescriptor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDesignatorDescriptorAdapter() {
    if (designatorDescriptorItemProvider == null) {
      designatorDescriptorItemProvider = new DesignatorDescriptorItemProvider(this);
    }

    return designatorDescriptorItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type) {
    if (isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose() {
    if (langInstModelItemProvider != null) langInstModelItemProvider.dispose();
    if (featureModelAdapterItemProvider != null) featureModelAdapterItemProvider.dispose();
    if (coreModelAdapterItemProvider != null) coreModelAdapterItemProvider.dispose();
    if (actionDescriptorItemProvider != null) actionDescriptorItemProvider.dispose();
    if (designatorDescriptorItemProvider != null) designatorDescriptorItemProvider.dispose();
  }

}
