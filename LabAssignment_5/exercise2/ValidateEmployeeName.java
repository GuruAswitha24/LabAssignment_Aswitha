package exercise2;

import java.util.Scanner;

public class ValidateEmployeeName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String FirstName=sc.nextLine();
		System.out.println("Enter Last Name:");			
		String LastName=sc.nextLine();
		try {
			if(FirstName.isBlank() || LastName.isBlank())
			{
				throw new EmployeeException("Provide valid Input");
			}
			else {
				System.out.println("Name is: " +FirstName+ " "+LastName);
			}
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
			
	}
				
}
