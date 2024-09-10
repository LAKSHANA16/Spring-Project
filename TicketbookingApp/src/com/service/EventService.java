package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.EventDaoImpl;
import com.dto.EventRevenuedto;
import com.dto.EventTicketsBookeddto;

public class EventService {
EventDaoImpl eventDaoImpl=new EventDaoImpl();
public List<EventRevenuedto> getRevenueByEvent()throws SQLException{
	return  eventDaoImpl.getRevenueByEvent();
}
public double getGrossTotalRevenue(List<EventRevenuedto>list) {
	double totalRevenue=0;
	for(EventRevenuedto dto:list) {
		totalRevenue=totalRevenue+dto.getTotalRevenue();
	}
	return totalRevenue;
}
public List<EventTicketsBookeddto>getTotalTicketsBookedByEvent() throws SQLException{
	return eventDaoImpl.getTotalTicketsBookedByEvent();
}
}
