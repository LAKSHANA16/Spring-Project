package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.OrdersModel;

public interface OrderDao {
	public List<OrdersModel> fetchAll() throws SQLException;
	public void update(double totalAmount,int ordersId) throws SQLException;
	public void delete( int ordersId1)throws SQLException;
	
}
