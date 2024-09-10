package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.CustomerDto;
import com.exception.CustomerNotFoundException;
import com.model.CustomerModel;

public interface CustomerDao {
	public List<CustomerModel> fetchAll()throws CustomerNotFoundException, SQLException;
	public void update(int ccustomerId,String cfirstName)throws CustomerNotFoundException, SQLException;
	public List<CustomerDto> totalOrders() ;
}
