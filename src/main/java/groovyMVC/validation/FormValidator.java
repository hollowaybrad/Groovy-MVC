package groovyMVC.validation;



/**
 * Simple interface for validation. Allows custom Grails like CSS form decoration
 *
 * @author bholloway
 *
 */
public interface FormValidator {

	/**
	 * Validates the object supplied.
	 *
	 * @param object
	 * @return
	 */
	 public ValidationResult validate(Object object);
}
