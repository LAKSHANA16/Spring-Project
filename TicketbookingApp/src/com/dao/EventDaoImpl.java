package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.EventRevenuedto;
import com.dto.EventTicketsBookeddto;
import com.util.DBUtil;

public class EventDaoImpl implements EventDao {
	public List<EventRevenuedto> getRevenueByEvent() throws SQLException {
		Connection conn = DBUtil.getDBConn();
		List<EventRevenuedto> list = new ArrayList<>();
		String sql = " select event_name,SUM(((total_seats-available_seats)*ticket_price)) as total_revenue"
				+" from event"
				+" group by event_name";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		while (rst.next()) {
			String eventName = rst.getString("event_name");
			double totalRevenue = rst.getDouble("Total_revenue");
			EventRevenuedto dto = new EventRevenuedto(eventName, totalRevenue);
			list.add(dto);
		}
		DBUtil.dbClose();
		return list;
	}
	public List<EventTicketsBookeddto>getTotalTicketsBookedByEvent() throws SQLException{
		Connection conn=DBUtil.getDBConn();
		List<EventTicketsBookeddto> list = new ArrayList<>();
		//Query
		String sql = " select event_name,SUM(total_seats-available_seats) as total_tickets_booked"
				+" from event"
				+" group by event_name";
		//Prepare stmt
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
		{
			String eventName=rst.getString("event_name");
			double totalTicketsBooked=rst.getDouble("total_tickets_booked");
			EventTicketsBookeddto bdto=new EventTicketsBookeddto(eventName,totalTicketsBooked);
			list.add(bdto);
		}
		DBUtil.dbClose();
		return list;
		
	}
}
