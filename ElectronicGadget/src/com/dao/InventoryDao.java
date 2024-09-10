package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.InventoryDto;
import com.dto.QuantityAvailableDto;
import com.model.InventoryModel;

public interface InventoryDao 
{
	public List<InventoryModel> fetchAll() throws SQLException;
	public List<InventoryDto> product() throws SQLException;
	public List<QuantityAvailableDto> available() throws SQLException;
	public List<QuantityAvailableDto> outOfStock() throws SQLException;
	public List<QuantityAvailableDto> LowStock() throws SQLException;
	public void update(int quantityInStock,int inventoryId) throws SQLException;
}
