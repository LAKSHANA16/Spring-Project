package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.DiscountDto;
import com.dto.OrderDetailDto;

import com.model.OrderDetailModel;
import com.service.OrderDetailService;

public class OrderDetailController {
public static void main(String[] args) throws SQLException {
	OrderDetailService orderDetailService=new OrderDetailService();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("ENTER 1 TO FETCH ALL DETAILS");
		System.out.println("ENTER 2 TO UPDATE");
		System.out.println("ENTER 3 TO FIND SUBTOTAL");
		System.out.println("ENTER 4 TO FIND DISCOUNT");
		System.out.println("ENTER 0 TO EXIT");
		int input=sc.nextInt();
		if(input==0)
		{
			System.out.println("EXITING.............");
			break;
		}
		switch(input)
		{
		case 1:
			System.out.println("FETCH ALL DETAILS");
			List<OrderDetailModel>list=orderDetailService.fetch();
			for(OrderDetailModel o:list)
			{
				System.out.println("OrderDetailModel [ordersDetailId=" + o.getOrdersDetailId() + ", ordersOrdersId=" 
			+ o.getOrdersOrdersId()+ ", productProductId=" + o.getProductProductId() + 
			", quantity=" + o.getQuantity() + "]");
			}
			break;
		case 2:
			System.out.println("Update");
			System.out.println("Enter the id:");
			int orderDetailId1=sc.nextInt();
			System.out.println("Enter the quantity:");
			int quantity1=sc.nextInt();
			orderDetailService.update(quantity1, orderDetailId1);
		case 3:
			System.out.println("SUBTOTAL");
			List<OrderDetailDto>list1=orderDetailService.sub();
			for(OrderDetailDto dto:list1)
			{
				System.out.println("OrderDetailDto [orders_id=" + dto.getOrders_id() + 
						", subtotal=" + dto.getSubtotal() + "]");
			}
			break;
		case 4:
			System.out.println("Discount");
			List<DiscountDto>list11=orderDetailService.dis();
			for(DiscountDto dto:list11)
			{
				System.out.println("DscountDto [orders_id=" + dto.getOrdersId() + 
						 ", quantity=" + dto.getQuantity() + ", totalAmount="
						+ dto.getTotalAmount() + ", discount=" + dto.getDiscount()+"]");
			}
			break;
			default:
				System.out.println("INVALID INPUT");
				break;
		}
	}
}
}
