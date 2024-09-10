package com.demo.dao;

import java.sql.SQLException;
import java.util.List;

import com.demo.model.DemoModel;



public interface DemoDao {
	List<DemoModel> showEmployDao() throws ClassNotFoundException, SQLException;

}
