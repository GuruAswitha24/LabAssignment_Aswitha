package com.cg.eis.exception;

/**
 * creating user defined exception class: EmployeeSalaryException 
 * @author Aswitha
 *
 */

public class EmployeeSalaryException extends Exception {
	
	public EmployeeSalaryException() {
		super();
		}
	/*
	 * @parameterized constructor
	 */
 public EmployeeSalaryException(String message) {
	super(message);
	}

}
