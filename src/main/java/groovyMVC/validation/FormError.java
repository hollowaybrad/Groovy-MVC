package groovyMVC.validation;

/**
 * Simple class to hold form errors
 * 
 * @author bradh
 *
 */
public class FormError {

	public FormError() {
	}
	
	public FormError(String name, String message) {
		this.name = name;
		this.message = message;
	}
	
	private String name;
	private String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
