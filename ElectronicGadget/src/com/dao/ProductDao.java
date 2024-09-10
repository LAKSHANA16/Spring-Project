package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.ProductDto;
import com.exception.ProductIdNotFoundException;
import com.model.ProductModel;

public interface ProductDao {
	public List<ProductModel>fetchAll() throws SQLException;
	public void update(int pproductId,String pname) throws ProductIdNotFoundException, SQLException;
	public List<ProductDto> getStock();
}
