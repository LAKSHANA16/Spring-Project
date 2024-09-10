package com.controller;

import java.util.List;
import java.util.Scanner;

import com.model.Employee;

import com.service.EmployeeService;

public class EmployeeController {
public static void main(String args[]) {
	EmployeeService employeeService=new EmployeeService();
	Scanner sc=new Scanner(System.in);
	while (true)
	{
		System.out.println("**************Product table***************");
		System.out.println("Enter 1 to insert");
		System.out.println("Enter 2 to fetch");
		System.out.println("Enter 3 to update");
		System.out.println("Enter 4 to delete");
		System.out.println("Enter 0 for exit");
		System.out.println("******************************************");
		int input=sc.nextInt();//user choice
		//now even if user gives 0 the code is not terminated so we do this
		if(input==0)
		{
			System.out.println("Exiting.....Thank You!!!");
			break;
		}
		switch(input)
		{
		case 1:
			System.out.println("Insertion....");
			System.out.println("Enter name ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter description ");
			String description=sc.nextLine();
			System.out.println("Enter price ");
			double price=sc.nextDouble();
			
			break;
		case 2:
			List <Employee> list=employeeService.fetchAllEmployee();
			System.out.println("Fetch...");
			for(Employee e:list) 
			{
				System.out.println(e.getName()+e.getDescription()+e.getPrice());
	     	}
			System.out.println(" ENTER A FOR ASCENDING");
			System.out.println(" ENTER D FOR DESCENDING");
			String order=sc.next();//character
			if(!(order.equalsIgnoreCase("A")|| order.equalsIgnoreCase("D")))
			{
				System.out.println("Invalid input");
				break;
			}
			System.out.println("Now sort");
			list=employeeService.orderRecords(list,order);
			for(Employee e:list) 
			{
				System.out.println(e.getName()+e.getDescription()+e.getPrice());
	     	}
			break;
			
		case 3:
			System.out.println(" update...");
			System.out.println("enter the data to be update");
			sc.nextLine();
			String ename=sc.nextLine();
			System.out.println(" Enter description");
			String edesc=sc.next();
			System.out.println(" Enter price");
			double eprice=sc.nextDouble();
			employeeService.updateEmployee(ename,edesc,eprice);
			System.out.println("updated");
			break;
		case 4:
			System.out.println(" delete...");
			System.out.println("Enter the product name to be deleted");
			sc.nextLine();
			name=sc.nextLine();
			employeeService.deleteEmployee(name);
			System.out.println("deleted");
			break;
			default:
				System.out.println("Invalid input");
			 break;
	}
	
	}
}
}