package com.service;


import java.sql.SQLException;
import java.util.List;

import com.dao.CustomerDaoImpl;
import com.dto.CustomerDto;
import com.exception.CustomerNotFoundException;
import com.model.CustomerModel;


public class CustomerService {
CustomerDaoImpl customerDao=new CustomerDaoImpl();
public List<CustomerModel> fetchAll() throws SQLException,CustomerNotFoundException
{
	return customerDao.fetchAll();
}
public void update(int ccustomerId,String cfirstName)throws CustomerNotFoundException, SQLException
{
	customerDao.update(ccustomerId,cfirstName);
}
public List<CustomerDto> totalOrders()
{
	return customerDao.totalOrders();
}

}
