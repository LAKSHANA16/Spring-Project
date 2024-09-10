package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.dto.RestuarantDto;
import com.model.Restuarant;
import com.service.RestuarantService;

public class RestuarantController 
{ public static void main(String args[])
	{
	RestuarantService restuarantService = new RestuarantService();
	Scanner sc=new Scanner(System.in);
	

	while(true)
	{
		System.out.println("**************Dishes table***************");
		
		System.out.println("Enter 1 to fetch");
		System.out.println("Enter 2 to update");
		System.out.println("Enter 3 to delete");
		System.out.println("Enter 4  to calculate total cost");
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
			List <Restuarant> list=restuarantService.fetchDetails();
			System.out.println("FETCH...........");
			for(Restuarant r:list) 
			{
				System.out.println(r.getId()+" \t"+r.getName()+"\t"+r.getCuisine()+"\t"+
			r.getNoOfOrdered()+"\t"+r.getPricePer()+"\t"+r.getDessert()+"\t"+r.getDessertCost());
	     	}
			System.out.println("********************************");
			
			
		
			
			System.out.println("sort");
			System.out.println(" ENTER A FOR ASCENDING");
			System.out.println(" ENTER D FOR DESCENDING");
			String order=sc.next();//character
			
			if(!(order.equalsIgnoreCase("A")|| order.equalsIgnoreCase("D")))
			{
				System.out.println("Invalid input");
				break;
			}
			System.out.println("Now sort");
			list=restuarantService.orderRecords(list,order);
			for(Restuarant r:list) 
			{
				System.out.println(r.getId()+"\t"+r.getName()+"\t"+r.getCuisine()+"\t"+r.getPricePer());
	     	}
			break;
		case 2:
			System.out.println("UPDATE...........");
			System.out.println("enter the id to be update");
			int eid=sc.nextInt();
			System.out.println(" Enter dessert");
			sc.nextLine();
			String edessert=sc.nextLine();
			restuarantService.updateRestuarant(eid,edessert);
			System.out.println("updated");
			break;
		case 3:
			System.out.println("DELETE...........");
			System.out.println("enter the cuisine to be deleted");
			sc.nextLine();
			String cuisine=sc.nextLine();
			restuarantService.deleteRestuarant(cuisine);
			System.out.println("DELETED############");
			break;
		case 4:
			System.out.println("CALCULATE........");
			
			break;
			default:
				System.out.println("INVALID INPUT");
				break;
		}
}
}
}
