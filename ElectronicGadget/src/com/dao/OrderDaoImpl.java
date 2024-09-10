package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dto.QuantityDto;
import com.model.OrdersModel;
import com.util.DBUtil;

public class OrderDaoImpl implements OrderDao{
Connection conn;
DBUtil db=new DBUtil();
public List<OrdersModel> fetchAll()throws SQLException
{
	conn=db.dbConnect();
	List<OrdersModel>list=new ArrayList<>();
	String sql="select * from orders";
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
	{
	int ordersId=rst.getInt("orders_id");
	int customerCustomerId=rst.getInt("customer_customer_id");
	LocalDate orderDate=rst.getDate("order_date").toLocalDate();
	double totalAmount=rst.getInt("total_amount");
	OrdersModel o=new OrdersModel();
	o.setOrdersId(ordersId);
	o.setCustomerCustomerId(customerCustomerId);
	o.setOrderDate(orderDate);
	o.setTotalAmount(totalAmount);
	list.add(o);
	}

	db.dbClose();
	return list;
}
public void update(double totalAmount,int ordersId) throws SQLException
{
	conn=db.dbConnect();
	String sql="update orders set total_amount=?where orders_id=?";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setDouble(1, totalAmount);
	pstmt.setInt(2, ordersId);
	int updated=pstmt.executeUpdate();
	if(updated<0)
		System.out.println("no proper validation");
	db.dbClose();
}
public void delete( int ordersId1)throws SQLException
{
	conn=db.dbConnect();
	String sql="delete from orders where ordersId=?";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setInt(1, ordersId1);
	pstmt.executeUpdate();
	
	db.dbClose();
}

}
