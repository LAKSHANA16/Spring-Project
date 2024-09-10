package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String args[]) throws SQLException
	{
		EmployeeService service=new EmployeeService();
		List<Employee>employees = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("ENTER 1 TO ADD ALL DETAILS");
		System.out.println("ENTER 2 TO FETCH ALL DETAILS");
		System.out.println("ENTER 3 TO FETCH BY NAME");
		System.out.println("ENTER 4 TO DISPLAY EMPLOYEES UNDER MANAGER NAME AND DEPARTMENT");
		System.out.println("ENTER 0 TO EXIT");
		int input=sc.nextInt();
		if(input==0)
		{
			System.out.println("EXITING........ THANK YOU!!!!!!!!!!!");
			break;
		}
		switch(input)
		{
		case 1:
			System.out.println("TO ADD ALL DETAILS");

	        System.out.print("Name: ");
	        sc.nextLine();
	        String name = sc.nextLine();

	        System.out.print("Age: ");
	        int age = sc.nextInt();
	         // Consume newline character left by nextInt()

	        System.out.print("Role: ");
	        sc.nextLine();
	        String role = sc.nextLine();

	        System.out.print("Department: ");

	        String department = sc.nextLine();

	        System.out.print("Manager: ");
	        String manager = sc.next();

	        Employee newEmployee = new Employee(name, age, role, department, manager);
	        service.addEmployee(newEmployee);
	        /*System.out.println("List of Employees:");
	         employees = service.getAllEmployees();
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }*/
			break;
		case 2:
			System.out.println("TO FETCH ALL DETAILS");
			
		         employees = service.getAllEmployees();
		        for (Employee emp : employees) {
		            System.out.println(" [name=" + emp.getName() + ", age=" +emp.getAge() + ", designation=" + emp.getDesignation() + ","
		            		+ " department="
		            		+ emp.getDepartment() + ", manager=" + emp.getManager() + "]");
	
		              }
			break;
		case 3:
			System.out.println("TO FETCH DETAILS BY NAME");
			System.out.println("Enter the name:");
			sc.nextLine();
			String nname=sc.nextLine();
			 Employee emp = service.getEmployeeByName(nname);
		        if (emp != null) {
		            System.out.println("Employee found: " + emp);
		        } else {
		            System.out.println("Employee not found.");
		        }
			break;
		case 4:
			System.out.println("TO FETCH DETAILS BY NAME,DEPARTMENT");
			System.out.println("Enter manager name:");
			sc.nextLine();
			String mmanagerName=sc.nextLine();
			System.out.println("Enter department:");
			String ddepartment=sc.nextLine();
			 employees = service.getEmployeesByManagerAndDepartment(mmanagerName, ddepartment);
	        if (!employees.isEmpty()) {
	            System.out.println("Employees under manager " + mmanagerName + " in department " + ddepartment + ":");
	            for (Employee emp1 : employees) {
	                System.out.println(emp1);
	            }
	        } else {
	            System.out.println("No employees found for manager " + mmanagerName + " in department " + ddepartment);
	        }
			break;
		default:
			System.out.println("INVALID INPUT");
			break;
		  }
		}
}
}
