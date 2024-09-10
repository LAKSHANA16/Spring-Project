package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.InventoryDto;
import com.dto.QuantityAvailableDto;
import com.model.InventoryModel;
import com.service.InventoryService;

public class InventoryController {
public static void main(String[] args)throws SQLException {
	InventoryService inventoryService=new InventoryService();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("ENTER 1 TO FETCH ALL DETAILS");
		System.out.println("ENTER 2 FOR PRODUCT DETAILS");
		System.out.println("ENTER 3 FOR AVAILABLE STOCKS");
		System.out.println("ENTER 4 TO FETCH OUT OF STOCK");
		System.out.println("ENTER 5 TO FETCH LOW STOCK");
		System.out.println("ENTER 6 TO UPDATE");
		System.out.println("ENTER 0 TO EXIT");
		int input=sc.nextInt();
		if(input==0)
		{
			System.out.println("EXITING......THANK YOU!!!!");
			break;
		}
		switch(input)
		{
		case 1:
			System.out.println("FETCH");
			List<InventoryModel>list=inventoryService.fetchAll();
			for(InventoryModel i:list)
			{
				System.out.println(i);
			}
			break;
		case 2:
			System.out.println("FETCH ");
			List<InventoryDto>lists=inventoryService.product();
			for(InventoryDto i:lists)
			{
				System.out.println(i);
			}
			break;
		case 3:
			System.out.println("quantity in stock ");
			List<QuantityAvailableDto>list1=inventoryService.available();
			for(QuantityAvailableDto i:list1)
			{
				System.out.println(i);
			}
			break;
		case 4:
			System.out.println("quantity out of stock ");
			List<QuantityAvailableDto>list11=inventoryService.outOfStock();
			for(QuantityAvailableDto i:list11)
			{
				System.out.println(i);
			}
			break;
		case 5:
			System.out.println("Low stock ");
			List<QuantityAvailableDto>list2=inventoryService.LowStock();
			for(QuantityAvailableDto i:list2)
			{
				System.out.println(i);
			}
			break;
		case 6:
			System.out.println("UPDATE");
			System.out.println("Enter the inventory id to be updated");
			int inventoryId=sc.nextInt();
			System.out.println("Enter the quantity");
			int quantityInStock=sc.nextInt();
			inventoryService.update(quantityInStock, inventoryId);
			break;
			default:
				System.out.println("INVALID INPUT");
				break;
		}
	}
}
}
