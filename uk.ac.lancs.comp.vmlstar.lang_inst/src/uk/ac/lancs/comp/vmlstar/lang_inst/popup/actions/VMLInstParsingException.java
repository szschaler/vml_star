/**
 * 
 */
package uk.ac.lancs.comp.vmlstar.lang_inst.popup.actions;

import hub.sam.tef.modelcreating.IModelCreatingContext;
import hub.sam.tef.semantics.AbstractError;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.text.Position;

/**
 * An exception indicating an issue with parsing.
 * 
 * @author zschaler
 *
 */
public class VMLInstParsingException extends Exception {

  private List<String> m_lsErrors;
  
  public VMLInstParsingException() {
    super ("Errors while parsing language instance description:\n");
  }

  public VMLInstParsingException(String message) {
    super (message);
  }

  public VMLInstParsingException(Throwable cause) {
    super ("Exception while parsing language instance description:\n", cause);
  }

  public VMLInstParsingException(String message, Throwable cause) {
    super(message, cause);
  }

  public void add(AbstractError error, IModelCreatingContext context) {
    if (m_lsErrors == null) {
      m_lsErrors = new LinkedList<String>();
    }
    
    m_lsErrors.add(error.getMessage() + " at <" + error.getPosition(context) + ">");
  }

  @Override
  public String toString() {
    if (m_lsErrors != null) {
      StringBuffer sb = new StringBuffer(super.toString());
      
      for (String sError: m_lsErrors) {
        sb.append(sError);
        sb.append("\n");
      }
      
      return sb.toString();
    }
    else {
      return super.toString();      
    }
  }
}