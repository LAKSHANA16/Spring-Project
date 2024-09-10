package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.CustomerDto;
import com.exception.CustomerNotFoundException;
import com.model.CustomerModel;
import com.util.DBUtil;

public class CustomerDaoImpl implements CustomerDao{
	DBUtil db=new DBUtil();
	Connection conn;
public List<CustomerModel> fetchAll() throws SQLException
{
	conn=db.dbConnect();
	List<CustomerModel> list=new ArrayList();
	String sql="select * from customer";
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
		{
		  int customerId=rst.getInt("customer_id");
		  String firstName=rst.getString("first_name");
		  String lastName=rst.getString("last_name");
		  String email=rst.getString("email");
		  String phoneNumber=rst.getString("phone_number");
		  String address=rst.getString("address");
		  CustomerModel m=new CustomerModel();
		  m.setCustomerId(customerId);
		  m.setFirstName(firstName);
		  m.setLastName(lastName);
		  m.setEmail(email);
		  m.setPhoneNumber(phoneNumber);
		  m.setAddress(address);
		  list.add(m);
		}

	db.dbClose();
	return list;
}


public void update(int ccustomerId,String cfirstName)throws CustomerNotFoundException, SQLException
{
	conn=db.dbConnect();
	String sql="update customer set first_name=? where customer_id=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,cfirstName);
		pstmt.setInt(2, ccustomerId);
		pstmt.executeUpdate();
	
	db.dbClose();
	throw new CustomerNotFoundException("customer not available");
}
public List<CustomerDto> totalOrders() 
{
	conn=db.dbConnect();
	List <CustomerDto> list1=new ArrayList<>();
	String sql="select c.customer_id,c.first_name,c.last_name,count(orders_id) as total "
			+ "from customer c join orders o "
			+ "on c.customer_id=o.customer_customer_id "
			+"group by c.customer_id";
	PreparedStatement pstmt;
	try {
		pstmt = conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
	{
		int customerId=rst.getInt("customer_id");
		String firstName=rst.getString("first_name");
		String lastName=rst.getString("last_name");
		int total=rst.getInt("total");
		CustomerDto d=new CustomerDto(customerId,firstName,lastName,total);
		list1.add(d);
	}
	}
	catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	db.dbClose();
	return list1;

}
	
}


