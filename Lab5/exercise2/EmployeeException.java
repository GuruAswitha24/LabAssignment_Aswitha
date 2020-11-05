package exercise2;

/**
 *  creating user defined exception class: EmployeeException
 * @author Aswitha
 *
 */

public class EmployeeException extends Exception {
	
	public EmployeeException() {
		super();
	}
      /*
       * @parameterized constructor of user defined exception
       */
	public EmployeeException(String message) {
		super(message);
	}

	
}
