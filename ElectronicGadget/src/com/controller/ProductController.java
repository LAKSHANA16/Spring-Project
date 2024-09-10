package com.controller;
import java.sql.SQLException;
import java.util.*;

import com.dto.ProductDto;
import com.exception.ProductIdNotFoundException;
import com.model.ProductModel;
import com.service.ProductService;


public class ProductController
{
	public static void main(String args[])throws ProductIdNotFoundException,SQLException
	{
		ProductService productService=new ProductService();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("ENTER 1 TO FETCH ALL DETAILS");
		System.out.println("ENTER 2 TO UPDATE");
		System.out.println("ENTER 3 TO GET STOCK");
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
			List<ProductModel>list=productService.fetchAll();
			for(ProductModel p:list)
			{
				System.out.println("[id=" + p.getProductId() + ", Name=" + p.getName() + ", description=" 
			+ p.getDescription()+ ", price=" + p.getPrice()+ "]");
			}
			break;
		case 2:
			System.out.println("UPDATE!!!!!!!!!!");
			System.out.println("ENTER ID TO BE UPDATED:");
			int pproductId=sc.nextInt();
			System.out.println("ENTER THE NAME:");
			sc.nextLine();
			String pname=sc.nextLine();
			productService.update(pproductId, pname);
		case 3:
			System.out.println("To check stock");
			List<ProductDto>list1=productService.getStock();
			for(ProductDto pd:list1 ) 
			{
				System.out.println("ProductDto [productId=" + pd.getProductId() + ", name=" 
			+ pd.getName() + ", quantityInStock=" + pd.getQuantityInStock() + "]");
			}
			break;
			default:
				System.out.println("Invalid input");
}
		}
	}
}
