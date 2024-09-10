package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.EventRevenuedto;
import com.dto.EventTicketsBookeddto;

public interface EventDao {
public List<EventRevenuedto> getRevenueByEvent()throws SQLException;
public List<EventTicketsBookeddto>getTotalTicketsBookedByEvent() throws SQLException;
}
