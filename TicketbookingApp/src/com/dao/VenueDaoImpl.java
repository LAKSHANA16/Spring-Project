package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Venue;
import com.util.DBUtil;

public class VenueDaoImpl implements VenueDao{
	public List<Venue> getAllVenues() throws SQLException{
		List <Venue>list=new ArrayList<>();
		Connection conn=DBUtil.getDBConn();
		String sql="select * from venue";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
		{
			int id=rst.getInt("id");
			String venueName=rst.getString("venue_name");
			String address=rst.getString("address");
			//save to obj
			Venue venue=new Venue(id,venueName,address);
			list.add(venue);
		}
		DBUtil.dbClose();
		return list;
	}

	public Venue getVenueById(int id) throws SQLException {
		Connection conn=DBUtil.getDBConn();
		String sql="select * from venue where id=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rst=pstmt.executeQuery();
		if(rst.next())
		{
			int vid=rst.getInt("id");
			String venueName=rst.getString("venue_name");
			String address=rst.getString("address");
			//save to obj
			Venue venue=new Venue(id,venueName,address);
			return venue;
		}
		DBUtil.dbClose();
		 throw new NullPointerException("Invalid Id given");
	
	}

	

}
