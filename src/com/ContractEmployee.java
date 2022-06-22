package com;

import java.util.Scanner;

public class ContractEmployee extends Employee{
	static void employeeDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter employee id");
		int employee_id = scan.nextInt();
		System.err.println("enter user name");
		String userName = scan.next();
		String output = null;
		if(employee_id == 301)
			output = "Contract employee method called";
		else
			output = "not a Contract employee";
		System.err.println(output);
	}
}
