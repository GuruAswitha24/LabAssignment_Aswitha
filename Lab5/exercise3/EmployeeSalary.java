package com.cg.eis.exception;

import java.util.Scanner;
/**
 * Validating the salary of employee using user defined exception
 * @author Aswitha
 *
 */

public class EmployeeSalary {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in); //Read the value of salary
		System.out.println("Enter Salary");
		double Salary=sc.nextInt();
		try {
			/*
			 * check whether the salary as per the required condition
			 */
			if(Salary<=3000) {
				/*
				 *checks for the conditon and throws exception if false 
				 */
				throw new EmployeeSalaryException("Not Valid."); 
			}
			else
			{
				System.out.println("Salary is:"+Salary);
			}
			sc.close(); //close the scanner function
		
		}
		catch(EmployeeSalaryException e) {
			/*
			 * writes the exception message
			 */
			System.out.println(e.getMessage());
		}
	}

}
