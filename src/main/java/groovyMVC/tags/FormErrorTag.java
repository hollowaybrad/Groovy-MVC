package groovyMVC.tags;

import groovyMVC.utils.SpringPropertyUtils;
import groovyMVC.validation.FormError;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FormErrorTag extends SimpleTagSupport{

	private String path;
	private List<FormError> errors;

	public void setPath(String path) {
		this.path = path;
	}

	public void setErrors(List<FormError> errors) {
		this.errors = errors;
	}

	@Override
	public void doTag() throws JspException, IOException {

		if(errors != null && !errors.isEmpty()){

			try {
				getJspContext().getOut().print("<div class='errors'><ul>");

				if(path.equals("*")){
					for(FormError formError: errors){
						getJspContext().getOut().print("<li>" + SpringPropertyUtils.getProperty(formError.getMessage()) + "</li>");
					}
				}else{
					for(FormError formError: errors){
						if(formError.getName().equals(path)){
							getJspContext().getOut().print("<li>" + SpringPropertyUtils.getProperty(formError.getMessage()) + "</li>");
						}
					}
				}

				getJspContext().getOut().print("</ul></div>");
			} catch (Exception e) {
				e.printStackTrace();
		    	throw new JspTagException("FormErrorTag: " + e.getMessage());
			}
		}
	}


}
