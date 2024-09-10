package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.OrdersModel;
import com.service.OrderService;

public class OrderController {
public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	OrderService orderService=new OrderService();
	while(true)
	{
		System.out.println("ENTER 1 TO FETCH ALL DETAILS");
		System.out.println("ENTER 2 TO UPDATE");
		System.out.println("ENTER 3 TO CANCEL ORDER");
		System.out.println("ENTER 0 TO EXIT");
	
	int input=sc.nextInt();
	if(input==0)
	{
		System.out.println("Exiting....Thank You");
		break;
	}
	switch(input)
	{
	case 1:
		System.out.println("Fetch");
		List<OrdersModel>list=orderService.fetchAll();
		for(OrdersModel o:list)
		{
			System.out.println(o);
		}
		break;
	case 2:
		System.out.println("update");
		System.out.println("Enter id to be updated:");
		int ordersId=sc.nextInt();
		System.out.println("Enter amount");
		double totalAmount=sc.nextDouble();
		orderService.update(totalAmount, ordersId);
		break;
	case 3:
		System.out.println("CANCEL");
		System.out.println("Enter id to be canceled:");
		int ordersId1=sc.nextInt();
		orderService.delete(ordersId1);
		default:
			System.out.println("INVALID INPUT");
			break;
			
	}
	}
}
}
