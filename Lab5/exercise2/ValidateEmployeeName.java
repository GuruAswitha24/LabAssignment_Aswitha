package exercise2;

import java.util.Scanner;
/**
 * Validating full name of employee user defined exception
 * @author Aswitha
 *
 */

public class ValidateEmployeeName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // gets the input from user
		System.out.println("Enter First Name:");
		String FirstName=sc.nextLine();
		System.out.println("Enter Last Name:");			
		String LastName=sc.nextLine();
		try {
			/*
			 * checks for the conditon 
			 */
			if(FirstName.isBlank() || LastName.isBlank())
			{
				/**
				 * If the conditon is false, throws the user defined exception
				 */
				throw new EmployeeException("Provide valid Input");
			}
			else {
				System.out.println("Name is: " +FirstName+ " "+LastName);
			}
			
		}
		catch(EmployeeException e) {
			/*
			 * writes the exception message
			 */
			System.out.println(e.getMessage());
		}
			
	}
				
}
