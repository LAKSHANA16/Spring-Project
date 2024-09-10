package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.OrderDaoImpl;
import com.model.OrdersModel;

public class OrderService {
OrderDaoImpl orderDaoImpl=new OrderDaoImpl();
public List<OrdersModel> fetchAll() throws SQLException
{
return orderDaoImpl.fetchAll();
}
public void update(double totalAmount,int ordersId) throws SQLException
{
	orderDaoImpl.update(totalAmount, ordersId);
}
public void delete( int ordersId1)throws SQLException
{
	orderDaoImpl.delete(ordersId1);
}
}
