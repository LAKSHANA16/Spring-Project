package com.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.exception.CustomerNotFoundException;
import com.exception.ProductIdNotFoundException;
import com.model.CustomerModel;
import com.model.ProductModel;
import com.service.ProductService;

import junit.framework.Assert;

public class ProductTest {
	ProductService productservice=new ProductService();
	@Test
	public void updateTest() 
	{
		//use case 1
		int pproductId=1;
		String pname="MacBook";
		try {
		productservice.update(pproductId, pname);
		}
		catch(ProductIdNotFoundException  | SQLException e)
		{	Assert.assertEquals("Id not found".toLowerCase(), e.getMessage().toLowerCase());

		}
		
		pproductId=15;//use case 2
		 pname="MacBook";
		try {
		productservice.update(pproductId, pname);
		}
		catch(ProductIdNotFoundException e)
		{	Assert.assertEquals("Id not found".toLowerCase(), e.getMessage().toLowerCase());

		}
		catch(SQLException e)
		{
		}
	}
	public void fetchAll() 
	{
	try {
		List<ProductModel>al=productservice.fetchAll();
		Assert.assertNotNull(al);
	}
	catch(SQLException e)
	{
		Assert.assertEquals("Not available".toLowerCase(),e.getMessage().toLowerCase() );
	}
	
}
}
