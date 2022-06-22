package com;

import java.util.Scanner;

public class PermanentEmployee extends Employee{
	static void employeeDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter employee id");
		int employee_id = scan.nextInt();
		System.err.println("enter user name");
		String userName = scan.next();
		String output = null;
		if(employee_id == 101)
			output = "permanent employee method called";
		else
			output = "not a permanent employee";
		System.err.println(output);
	}
}
