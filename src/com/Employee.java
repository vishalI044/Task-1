package com;

import java.util.Scanner;

public class Employee {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.
		 * println("enter employee Departmanent ID 1. permanent | 2. part Time | 3. contract"
		 * ); int employee_Did = scan.nextInt();
		 */
		
		
		System.out.println("enter id");
		int id = scan.nextInt(); 
		
		PermanentEmployee.employeeDetails(id);
		
		System.out.println("enter user");
		String user = scan.next();
		
		PartTimeEmployee.employeeDetails(user);
		
		boolean doub_id = false;
		ContractEmployee.employeeDetails(doub_id);
		/*
		 * if(employee_Did == 1) { System.out.println("enter id"); int id =
		 * scan.nextInt(); //Employee employe = new PermanentEmployee();
		 * PermanentEmployee.employeeDetails(id); } else if(employee_Did == 2) {
		 * System.out.println("enter user"); String user = scan.next(); //Employee
		 * employee = new PartTimeEmployee(); PartTimeEmployee.employeeDetails(user); }
		 * else if(employee_Did == 3) {
		 * 
		 * boolean doub_id = false; //Employee employee = new ContractEmployee();
		 * ContractEmployee.employeeDetails(doub_id); }
		 */		
	}
}
