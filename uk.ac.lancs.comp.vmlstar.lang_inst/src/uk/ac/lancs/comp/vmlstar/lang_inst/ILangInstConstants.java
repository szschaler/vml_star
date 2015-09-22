package uk.ac.lancs.comp.vmlstar.lang_inst;

import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Bundle;

import uk.ac.lancs.comp.vmlLangInst.VmlLangInstPackage;

/**
 * Collection of common constants used throughout.
 * 
 * @author zschaler
 */
public interface ILangInstConstants {

  /**
   * Metamodel packages of all languages involved.
   */
  public static final EPackage[] epaMetamodels = 
     new EPackage[] { VmlLangInstPackage.eINSTANCE };
  
  /**
   * Syntax path
   */
  public static final String sSyntaxPath = "/metamodel/vml_langinst.etslt";
  
  /**
   * The bundle in which the syntax is contained.
   */
  public static final Bundle bSyntaxBundle = Activator.getDefault().getBundle();
}
