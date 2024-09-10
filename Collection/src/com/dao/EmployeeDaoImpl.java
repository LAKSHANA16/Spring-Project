package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.model.Employee;

public class EmployeeDaoImpl {
	DBConnector db=new DBConnector();
	Connection conn;
public List<Employee> fetchEmployees(){
	conn=db.dbConnect();
	List<Employee> list=new ArrayList<>();
	String sql="select * from product";
	try {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
		{
		
			String name=rst.getString("name");
            String description=rst.getString("description");
		    double price=rst.getDouble("price");
			Employee e=new Employee();
		
			e.setName(name);
			e.setDescription(description);
			e.setPrice(price);
			list.add(e);
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	db.dbClose();
	return list;
}
public void deleteEmployee(String name)
{
	conn=db.dbConnect();
	String sql="delete from product where name=?";
	try {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,name);
		pstmt.executeUpdate();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	db.dbClose();
}
public void updateEmployee(String ename,String edesc,double eprice) {
	conn=db.dbConnect();
	String sql="update product SET description=?,price=? where name=?";
	try {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, edesc);
		pstmt.setDouble(2, eprice);
		pstmt.setString(3, ename);
		pstmt.executeUpdate();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	db.dbClose();
	
	
	
	
}
}
