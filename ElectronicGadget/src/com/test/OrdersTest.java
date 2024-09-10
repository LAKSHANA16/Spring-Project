package com.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.exception.CustomerNotFoundException;
import com.model.OrdersModel;
import com.service.OrderService;

public class OrdersTest {
OrderService orderService=new OrderService();
@Test()
public void fetchAll()
{//use case 1
	try 
	{
	List<OrdersModel>list=orderService.fetchAll();
	Assert.assertNotNull(list);
	}
	catch(SQLException e)
	{
		Assert.assertEquals("No fetch".toLowerCase(), e.getMessage().toLowerCase());
	}
}
public void updateTest()
{  //use case 1
	int ordersId=1;
	double totalAmount=52000;
	
	try {
	orderService.update(totalAmount, ordersId);
	}
	catch(SQLException e)
	{	Assert.assertEquals("customer not available".toLowerCase(), e.getMessage().toLowerCase());

	}
	ordersId=9;//use case 2
    totalAmount=52000;
	
	try {
	orderService.update(totalAmount, ordersId);
	}
	catch(SQLException e)
	{	Assert.assertEquals("customer not available".toLowerCase(), e.getMessage().toLowerCase());

	}
}
}
