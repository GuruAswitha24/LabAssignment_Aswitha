package exercise1;

import java.util.Scanner;

public class ValidateAge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Using try for age validation and throwing the exception if age is not above 15.
		 */
		try {
			/**
			 * Taking the age of the person from the user.
			 */
			System.out.print("Enter the age of the person: ");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			
			/**
			 * Validating whether the age is above 15.
			 */
			if(age<=15) {
				/**
				 * If age is not above 15 then throwing the user defined exception with appropriate message.
				 */
				throw new AgeException("Age of a person should be above 15");
			}
			else {
				System.out.println("Age is validated");
			}
		}
		/**
		 * Catching the user defined exception.
		 */
		catch(AgeException a) {
			/**
			 * Printing the appropriate message if age is not above 15.
			 */
			System.out.println(a.getMessage());
		}
	}

}
