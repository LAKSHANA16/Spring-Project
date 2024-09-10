package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ProductDaoImpl;
import com.dto.ProductDto;
import com.exception.ProductIdNotFoundException;
import com.model.ProductModel;


public class ProductService {
	ProductDaoImpl productDao=new ProductDaoImpl();
	public List<ProductModel> fetchAll() throws SQLException
	{
		return productDao.fetchAll();
	}
	public void update(int pproductId,String pname) throws ProductIdNotFoundException, SQLException
	{
		productDao.update(pproductId,pname);
	}
	public List<ProductDto> getStock()
	{
		return productDao.getStock();
	}
}
