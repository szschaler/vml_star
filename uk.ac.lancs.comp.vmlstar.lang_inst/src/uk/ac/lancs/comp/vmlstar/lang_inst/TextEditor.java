package uk.ac.lancs.comp.vmlstar.lang_inst;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Bundle;

import uk.ac.lancs.comp.vmlLangInst.provider.VmlLangInstItemProviderAdapterFactory;

public class TextEditor extends hub.sam.tef.editor.text.TextEditor implements ILangInstConstants {

	@Override
	public EPackage[] createMetaModelPackages() {
		return epaMetamodels;
	}

	@Override
	protected Bundle getPluginBundle() {
		return bSyntaxBundle;
	}

	@Override
	protected String getSyntaxPath() {
		return sSyntaxPath;
	}

	@Override
	public AdapterFactory[] createItemProviderAdapterFactories() {
		return new AdapterFactory[] { new VmlLangInstItemProviderAdapterFactory() };
	}
}