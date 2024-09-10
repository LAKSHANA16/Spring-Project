package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.OrderDetailDaoImpl;
import com.dto.DiscountDto;
import com.dto.OrderDetailDto;

import com.model.OrderDetailModel;

public class OrderDetailService {
OrderDetailDaoImpl orderDetailDao=new OrderDetailDaoImpl();
public List<OrderDetailModel> fetch()
{
	return orderDetailDao.fetch();
}
public void update(int quantity1,int ordersDetailId1)throws SQLException
{
	orderDetailDao.update(quantity1, ordersDetailId1);
}
public List<OrderDetailDto> sub()
{
	return orderDetailDao.sub();
}
public List<DiscountDto> dis()throws SQLException
{
	return orderDetailDao.dis();
}
}
