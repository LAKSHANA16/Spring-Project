package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.CustomerDto;
import com.exception.CustomerNotFoundException;
import com.model.CustomerModel;
import com.service.CustomerService;

public class CustomerController {
public static void main(String args[]) throws SQLException, CustomerNotFoundException 
{
	CustomerService customerService=new CustomerService();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("ENTER 1 TO FETCH ALL DETAILS");
	System.out.println("ENTER 2 TO UPDATE");
	System.out.println("ENTER 3 TO DISPLAY TOTAL ORDERS BY EACH CUSTOMER");
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
		System.out.println("TO FETCH ALL DETAILS");
		List<CustomerModel>list=customerService.fetchAll();
		for(CustomerModel m:list)
		{
			System.out.println("[id=" + m.getCustomerId() + ", firstName=" + m.getFirstName() + ", lastName=" 
		+ m.getLastName()+ ", email=" + m.getEmail()
	+ ", phoneNumber=" + m.getPhoneNumber() + ", address=" + m.getAddress ()+ "]");
		}
		break;
	case 2:
		System.out.println("UPDATE!!!!!!!!!!");
		System.out.println("ENTER ID TO BE UPDATED:");
		int ccustomerId=sc.nextInt();
		System.out.println("ENTER THE NAME:");
		sc.nextLine();
		String cfirstName=sc.nextLine();
		customerService.update(ccustomerId, cfirstName);
		break;
	case 3:
		System.out.println("TOTAL ORDERS");
		List<CustomerDto>list1=customerService.totalOrders();
		for(CustomerDto d:list1)
		{
			System.out.println("CustomerDto [total=" + d.getTotal() + ", firstName=" + d.getFirstName() + 
					", lastName=" + d.getLastName()+"]");
		}
		break;
		default:
			System.out.println("INVALID INPUT");
			break;
			
	}
}
}
}
