package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeSalary {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		double Salary=sc.nextInt();
		try {
			if(Salary<=3000) {
				throw new EmployeeSalaryException("Not Valid.");
			}
			else
			{
				System.out.println("Salary is:"+Salary);
			}
		
		}
		catch(EmployeeSalaryException e) {
			System.out.println(e.getMessage());
		}
	}

}
