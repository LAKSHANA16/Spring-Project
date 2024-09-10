package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.RestuarantDto;
import com.model.Restuarant;
import com.util.DBUtil;

public class RestuarantDao {
	DBUtil db=new DBUtil();
	Connection conn;
public List<Restuarant> fetchDetails(){
	conn=db.dbConnect();
	List<Restuarant> list=new ArrayList<>();
	String sql="select * from dishes";
	try {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
		{
			int id=rst.getInt("id");
			String name=rst.getString("name");
            String cuisine=rst.getString("cuisine");
		    int noOfOrdered=rst.getInt("no_of_ordered");
		    double pricePer=rst.getDouble("price_per");
		    String dessert=rst.getString("dessert");
		    double dessertCost=rst.getDouble("dessert_cost");
			Restuarant r=new Restuarant();
		    r.setId(id);
			r.setName(name);
			r.setCuisine(cuisine);
			r.setNoOfOrdered(noOfOrdered);
			r.setPricePer(pricePer);
			r.setDessert(dessert);
			r.setDessertCost(dessertCost);
			list.add(r);
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	db.dbClose();
	return list;
}
public void updateRestuarant(int eid,String edessert)
{conn=db.dbConnect();
String sql="update dishes SET dessert=? where id=?";
try {
	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	pstmt.setString(1, edessert);
	pstmt.setInt(2, eid);
	pstmt.executeUpdate();
}
catch(SQLException e)
{
	e.printStackTrace();
}
db.dbClose();
}
public void deleteRestuarant(String cuisine)
{
	conn=db.dbConnect();
	String sql="delete from dishes where cuisine=?";
	try {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, cuisine);
		pstmt.executeUpdate();
	}
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	db.dbClose();
}

}
