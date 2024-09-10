package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.InventoryDto;
import com.dto.QuantityAvailableDto;
import com.model.InventoryModel;
import com.util.DBUtil;

public class InventoryDaoImpl implements InventoryDao {
	Connection conn;
	DBUtil db = new DBUtil();

public List<InventoryModel> fetchAll() throws SQLException
{
	conn=db.dbConnect();
	List<InventoryModel>list=new ArrayList<>();
	String sql="select * from inventory";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
	{
	int inventoryId=rst.getInt("inventory_id");
	int productProductId=rst.getInt("product_product_id");
	int quantityInStock=rst.getInt("quantity_in_stock");
	int lastStockUpdate=rst.getInt("last_stock_update");
	InventoryModel i=new InventoryModel();
	i.setInventoryId(inventoryId);
	i.setProductProductId(productProductId);
	i.setQuantityInStock(quantityInStock);
	i.setLastStockUpdate(lastStockUpdate);
	list.add(i);
	}
	db.dbClose();
	return list;
}
public List<InventoryDto> product() throws SQLException
{
	conn=db.dbConnect();
	List<InventoryDto>lists=new ArrayList<>();
	String sql="select * from inventory i,product p where p.product_id=i.product_product_id";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
	{
	int inventoryId=rst.getInt("inventory_id");
	int productProductId=rst.getInt("product_product_id");
	int quantityInStock=rst.getInt("quantity_in_stock");
	int lastStockUpdate=rst.getInt("last_stock_update");
	String name=rst.getString("name");
	String description=rst.getString("description");
	double price=rst.getDouble("price");
	InventoryDto i=new InventoryDto();
	i.setInventoryId(inventoryId);
	i.setProductProductId(productProductId);
	i.setQuantityInStock(quantityInStock);
	i.setLastStockUpdate(lastStockUpdate);
	i.setName(name);
	i.setDescription(description);
	i.setPrice(price);
	lists.add(i);
	}
	db.dbClose();
	return lists;
}
public List<QuantityAvailableDto> available() throws SQLException
{
	conn=db.dbConnect();
	List<QuantityAvailableDto>list1=new ArrayList<>();
	String sql="select * from inventory i,product p ,orders_deatil od "
			+ "where p.product_id=i.product_product_id"
			+" and p.product_id=od.product_product_id "
			+ "and quantity_in_stock>=quantity";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
	{
	int inventoryId=rst.getInt("inventory_id");
	int productProductId=rst.getInt("product_product_id");
	int quantityInStock=rst.getInt("quantity_in_stock");
	int lastStockUpdate=rst.getInt("last_stock_update");
	String name=rst.getString("name");
	String description=rst.getString("description");
	double price=rst.getDouble("price");
	int quantity=rst.getInt("quantity");
	QuantityAvailableDto i=new QuantityAvailableDto();
	i.setInventoryId(inventoryId);
	i.setProductProductId(productProductId);
	i.setQuantityInStock(quantityInStock);
	i.setLastStockUpdate(lastStockUpdate);
	i.setName(name);
	i.setDescription(description);
	i.setPrice(price);
	i.setQuantity(quantity);
	list1.add(i);
	}
	db.dbClose();
	return list1;
}
public List<QuantityAvailableDto> outOfStock() throws SQLException
{
	conn=db.dbConnect();
	List<QuantityAvailableDto>list11=new ArrayList<>();
	String sql="select * from inventory i,product p ,orders_deatil od "
			+ "where p.product_id=i.product_product_id"
			+" and p.product_id=od.product_product_id "
			+ "and quantity_in_stock < quantity";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
	{
	int inventoryId=rst.getInt("inventory_id");
	int productProductId=rst.getInt("product_product_id");
	int quantityInStock=rst.getInt("quantity_in_stock");
	int lastStockUpdate=rst.getInt("last_stock_update");
	String name=rst.getString("name");
	String description=rst.getString("description");
	double price=rst.getDouble("price");
	int quantity=rst.getInt("quantity");
	QuantityAvailableDto i=new QuantityAvailableDto();
	i.setInventoryId(inventoryId);
	i.setProductProductId(productProductId);
	i.setQuantityInStock(quantityInStock);
	i.setLastStockUpdate(lastStockUpdate);
	i.setName(name);
	i.setDescription(description);
	i.setPrice(price);
	i.setQuantity(quantity);
	list11.add(i);
	}
	db.dbClose();
	return list11;
}
public List<QuantityAvailableDto> LowStock() throws SQLException
{
	conn=db.dbConnect();
	List<QuantityAvailableDto>list2=new ArrayList<>();
	String sql="select * from inventory i,product p ,orders_deatil od "
			+ "where p.product_id=i.product_product_id"
			+" and p.product_id=od.product_product_id "
			+ "and quantity_in_stock < 100";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
	{
	int inventoryId=rst.getInt("inventory_id");
	int productProductId=rst.getInt("product_product_id");
	int quantityInStock=rst.getInt("quantity_in_stock");
	int lastStockUpdate=rst.getInt("last_stock_update");
	String name=rst.getString("name");
	String description=rst.getString("description");
	double price=rst.getDouble("price");
	int quantity=rst.getInt("quantity");
	QuantityAvailableDto i=new QuantityAvailableDto();
	i.setInventoryId(inventoryId);
	i.setProductProductId(productProductId);
	i.setQuantityInStock(quantityInStock);
	i.setLastStockUpdate(lastStockUpdate);
	i.setName(name);
	i.setDescription(description);
	i.setPrice(price);
	i.setQuantity(quantity);
	list2.add(i);
	}
	db.dbClose();
	return list2;
}
public void update(int quantityInStock,int inventoryId) throws SQLException
{
	conn=db.dbConnect();
	String sql="update inventory set quantity_in_stock=?where inventory_id=?";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setDouble(1, quantityInStock);
	pstmt.setInt(2, inventoryId);
	int updated=pstmt.executeUpdate();
	if(updated<0)
		System.out.println("no proper validation");
	db.dbClose();
}
}
