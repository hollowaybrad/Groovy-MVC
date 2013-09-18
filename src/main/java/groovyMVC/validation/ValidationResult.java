package groovyMVC.validation;

import java.util.List;

/**
 * Simple class to handle validation results
 *
 * @author bradh
 *
 */
public class ValidationResult {

	public ValidationResult(List<FormError> errors){
		this.errors = errors;
	}

	private List<FormError> errors;

	public boolean hasErrors(){
		if(errors.size() > 0){
			return true;
		}else{
			return false;
		}
	}

	public List<FormError> getErrors() {
		return errors;
	}

	public void setErrors(List<FormError> errors) {
		this.errors = errors;
	}


}
