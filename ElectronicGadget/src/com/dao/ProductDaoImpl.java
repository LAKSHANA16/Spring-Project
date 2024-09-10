package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.ProductDto;
import com.exception.ProductIdNotFoundException;
import com.model.ProductModel;
import com.util.DBUtil;


public class ProductDaoImpl implements ProductDao{
	DBUtil db=new DBUtil();
	Connection conn;
public List<ProductModel>fetchAll() throws SQLException{
	
		
		conn=db.dbConnect();
		List<ProductModel> list=new ArrayList();
		String sql="select * from product";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
			{
			  int productId=rst.getInt("product_id");
			  String name=rst.getString("name");
			  String description=rst.getString("description");
			  double price=rst.getDouble("price");
			  ProductModel p=new ProductModel();
			  p.setProductId(productId);
			  p.setName(name);
			  p.setDescription(description);
			  p.setPrice(price);
			  
			  list.add(p);
			}
	
		db.dbClose();
		return list;
	
	}

	public void update(int pproductId,String pname)throws ProductIdNotFoundException, SQLException
	{
		conn=db.dbConnect();
		String sql="update product set name=? where product_id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,pname);
			pstmt.setInt(2, pproductId);
			pstmt.executeUpdate();
		
		
		db.dbClose();
		throw new ProductIdNotFoundException("Id not found");
	}
	public List<ProductDto> getStock()
	{
		List<ProductDto>list1=new ArrayList<>();
		conn=db.dbConnect();
		String sql="select * from product p,inventory i "
				+ "where p.product_id=i.product_product_id "
				+ "and quantity_in_stock>0";
		try {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		while(rst.next())
		{
			int productId=rst.getInt("product_id");
			String name=rst.getString("name");
			int quantityInStock=rst.getInt("quantity_in_stock");
			//save to obj
			ProductDto pd=new ProductDto();
			pd.setProductId(productId);
			pd.setName(name);
			pd.setQuantityInStock(quantityInStock);
			list1.add(pd);

		}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		db.dbClose();
		return list1;
	}

}
