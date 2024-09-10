package com.demo.controller;

import java.sql.SQLException;
import java.util.List;
import com.demo.dao.DemoDao;
import com.demo.dao.DemoImpl;
import com.demo.model.DemoModel;


public class DemoInsert {
public static void main(String[] args) {
	DemoDao dao=new DemoImpl();
	
	try {
		List<DemoModel> employList = dao.showEmployDao();
		employList.forEach(x -> {
			System.out.println(x);
		});
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
