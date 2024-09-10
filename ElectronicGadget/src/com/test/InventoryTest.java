package com.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.model.InventoryModel;
import com.service.InventoryService;

public class InventoryTest {
InventoryService inventoryService=new InventoryService();
@Test
public void product()
{
	try {
		inventoryService.product();
	} catch (SQLException e) {
		Assert.assertEquals("no stock".toLowerCase(), e.getMessage());
	}
}
@Test
public void available()
{
	try {
		inventoryService.available();
	}
	catch(SQLException e)
	{
		Assert.assertEquals("product not available".toLowerCase(), e.getMessage());
	}
}
public void fetchAll()
{
	try {
	List<InventoryModel>list=inventoryService.fetchAll();
	Assert.assertNotNull(list);
	}
	catch(SQLException e)
	{
		Assert.assertEquals("Not valid".toLowerCase(), e.getMessage().toLowerCase());
	}
}
}
