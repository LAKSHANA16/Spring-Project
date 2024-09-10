package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.InventoryDaoImpl;
import com.dto.InventoryDto;
import com.dto.QuantityAvailableDto;
import com.model.InventoryModel;

public class InventoryService {
	InventoryDaoImpl inventoryDaoImpl=new InventoryDaoImpl();
	public List<InventoryModel> fetchAll() throws SQLException
	{
         return inventoryDaoImpl.fetchAll();
	}
	public List<InventoryDto> product() throws SQLException
	{
		return inventoryDaoImpl.product();
	}
	public List<QuantityAvailableDto> available() throws SQLException
	{
		return inventoryDaoImpl.available();
	}
	public List<QuantityAvailableDto> outOfStock() throws SQLException
	{
		return inventoryDaoImpl.outOfStock();
	}
	public List<QuantityAvailableDto> LowStock() throws SQLException
	{
		return inventoryDaoImpl.LowStock();
	}
	public void update(int quantityInStock,int inventoryId) throws SQLException
	{
		inventoryDaoImpl.update(quantityInStock, inventoryId);
	}
}
