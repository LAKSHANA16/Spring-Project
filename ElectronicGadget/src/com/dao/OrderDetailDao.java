package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.DiscountDto;
import com.dto.OrderDetailDto;

import com.model.OrderDetailModel;

public interface OrderDetailDao {
	public List<OrderDetailModel> fetch();
	public void update(int quantity1,int ordersDetailId1)throws SQLException;
	public List<OrderDetailDto> sub();
	public List<DiscountDto> dis()throws SQLException;
}
