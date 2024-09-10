package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DiscountDto;
import com.dto.OrderDetailDto;
import com.exception.ProductIdNotFoundException;
import com.model.OrderDetailModel;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
import com.util.DBUtil;

public class OrderDetailDaoImpl implements OrderDetailDao{
	Connection conn;
	DBUtil db=new DBUtil();
public List<OrderDetailModel> fetch()
{
	conn=db.dbConnect();
	List<OrderDetailModel>list=new ArrayList<>();
	String sql="select * from orders_deatil";
	try
	{
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
		{
			int ordersDetailId=rst.getInt("orders_detail_id");
			int ordersOrdersId=rst.getInt("orders_orders_id");
			int productProductId=rst.getInt("product_product_id");
			int quantity=rst.getInt("quantity");
			OrderDetailModel o=new OrderDetailModel(ordersDetailId,ordersOrdersId,productProductId,quantity);
			list.add(o);
			
		}
	
	}
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	db.dbClose();
	return list;
}
public void update(int quantity1,int ordersDetailId1)throws SQLException
{
	conn=db.dbConnect();
	String sql="update orders_deatil set quantity=? where orders_detail_id=?";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setInt(1,quantity1);
	pstmt.setInt(2, ordersDetailId1);
	pstmt.executeUpdate();
	db.dbClose();
}
public List<OrderDetailDto> sub()
{
	conn=db.dbConnect();
	List<OrderDetailDto>list1=new ArrayList<>();
	String sql="select o.orders_id,(od.quantity*o.total_amount)as subtotal"
				+ " from orders o,orders_deatil od"
			+" where o.orders_id=od.orders_orders_id";
	try {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
		{
			int ordersId=rst.getInt("orders_id");
			int subtotal=rst.getInt("subtotal");
			OrderDetailDto dto=new OrderDetailDto(ordersId,subtotal);
			list1.add(dto);
		}
	}
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	db.dbClose();
	return list1;
}
public List<DiscountDto> dis()throws SQLException
{
	conn=db.dbConnect();
	List<DiscountDto>list1=new ArrayList<>();
	String sql="select o.orders_id,o.total_amount,od.quantity,(od.quantity*o.total_amount*(7/100))as discount"
				+ " from orders o,orders_deatil od"
			+" where o.orders_id=od.orders_orders_id";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
		{
			int ordersId=rst.getInt("orders_id");
			int discount=rst.getInt("discount");
			int quantity=rst.getInt("quantity");
			double totalAmount=rst.getInt("total_amount");
			DiscountDto dto=new DiscountDto(ordersId,discount,quantity,totalAmount);
			list1.add(dto);
		
		}
		
	
	return list1;
}
}
