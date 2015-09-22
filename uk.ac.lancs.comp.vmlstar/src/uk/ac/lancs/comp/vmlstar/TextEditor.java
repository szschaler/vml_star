package uk.ac.lancs.comp.vmlstar;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Bundle;

import uk.ac.lancs.comp.vmlstar.model.vmlstar.VmlstarPackage;
import uk.ac.lancs.comp.vmlstar.model.vmlstar.util.VmlstarAdapterFactory;

public class TextEditor extends hub.sam.tef.editor.text.TextEditor {

	@Override
	public EPackage[] createMetaModelPackages() {
		return new EPackage[] { VmlstarPackage.eINSTANCE };
	}

	@Override
	protected Bundle getPluginBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected String getSyntaxPath() {
		return "/resources/vml.etslt";
	}

	@Override
	public AdapterFactory[] createItemProviderAdapterFactories() {
		return new AdapterFactory[] { new VmlstarAdapterFactory() };
	}
}