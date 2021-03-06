/**
 * 
 */
package uk.ac.lancs.comp.vml.vml4arch;

import hub.sam.tef.modelcreating.IModelCreatingContext;
import hub.sam.tef.modelcreating.ModelCreatingException;
import hub.sam.tef.modelcreating.ParseTreeNode;
import hub.sam.tef.semantics.AbstractPropertySemantics;
import hub.sam.tef.semantics.IIdentificationScheme;
import hub.sam.tef.semantics.IPropertyResolutionSemantics;
import hub.sam.tef.semantics.ModelCheckError;
import hub.sam.tef.semantics.UnresolvableReferenceError;
import hub.sam.tef.semantics.UnresolvableReferenceError.UnresolveableReferenceErrorException;
import hub.sam.tef.tsl.ReferenceBinding;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Position;

import uk.ac.lancs.comp.vml.vml4arch.model.vml4arch.VmlModel;

/**
 * @author zschaler
 * 
 */
public class FeatureReferenceResolutionSemantics extends
		AbstractPropertySemantics implements IPropertyResolutionSemantics {

	private IIdentificationScheme m_iisIdScheme;

	public FeatureReferenceResolutionSemantics(IIdentificationScheme scheme) {
		super();
		m_iisIdScheme = scheme;
	}

	public EObject resolve(ParseTreeNode parseTreeNode, Object actual,
			Object value, IModelCreatingContext context,
			ReferenceBinding binding) throws ModelCreatingException,
			UnresolveableReferenceErrorException {
		if (!(actual instanceof EObject)) {
			throw new ModelCreatingException(
					"Attempt to resolve a non object value: " + actual);
		}
		EObject eoActual = (EObject) actual;
		if (value == null) {
			Position range = parseTreeNode.getPosition();
			int offset = range.getOffset();
			value = context.getText().substring(offset,
					offset + range.getLength());
		}
		EObject container = eoActual;
		while (container.eContainer() != null) {
			container = container.eContainer();
		}

		EObject resolution = null;
		try {
			resolution = resolve(m_iisIdScheme, value, (EObject) actual,
					binding.getProperty().getEType(), ((VmlModel) container)
							.getFeatures().getFeatures());
		} catch (AmbiguousReferenceException ex) {
			context.addError(new ModelCheckError("Reference is ambiguous",
					(EObject) actual));
		}
		if (resolution == null) {
			new UnresolvableReferenceError("Could not resolve " + value,
					parseTreeNode).throwIt();
			return null;
		} else {
			return resolution;
		}
	}

}