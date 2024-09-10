package com.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.dto.CustomerDto;
import com.exception.CustomerNotFoundException;
import com.exception.ProductIdNotFoundException;
import com.model.CustomerModel;
import com.service.CustomerService;


import junit.framework.Assert;

public class CustomerTest {
CustomerService customerService=new CustomerService();
@Test
public void fetchAll() 
{
try {
	List<CustomerModel>al=customerService.fetchAll();
	Assert.assertNotNull(al);
}
catch(SQLException e)
{
	
}
catch(CustomerNotFoundException e)
{
	Assert.assertEquals("No record found".toLowerCase(),e.getMessage());
}
}

@Test
public void updateTest() 
{
	//use case 1
	int ccustomerId=2;
	String cfirstName="goyal";
	try {
	customerService.update(ccustomerId, cfirstName);
	}
	catch(CustomerNotFoundException e)
	{	Assert.assertEquals("customer not available".toLowerCase(), e.getMessage().toLowerCase());

	}
	catch(SQLException e)
	{
	}
	ccustomerId=15;//use case 2
	 cfirstName="goyal";
	try {
	customerService.update(ccustomerId, cfirstName);
	}
	catch(CustomerNotFoundException e)
	{	Assert.assertEquals("customer not available".toLowerCase(), e.getMessage().toLowerCase());

	}
	catch(SQLException e)
	{
	}
}
}
