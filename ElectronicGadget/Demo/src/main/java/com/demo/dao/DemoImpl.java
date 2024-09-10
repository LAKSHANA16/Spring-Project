package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.DemoModel;
import com.demo.util.DBUtil;


public class DemoImpl implements DemoDao{
	Connection connection;
	PreparedStatement preparedStatement;

	@Override
	public List<DemoModel> showEmployDao() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		connection = DBUtil.getConnection();
		String cmd = "select * from Employ";
		preparedStatement = connection.prepareStatement(cmd);
		ResultSet rs = preparedStatement.executeQuery();
		List<DemoModel> employList = new ArrayList<DemoModel>();
		DemoModel employ = null;
		while(rs.next()) {
			employ = new DemoModel();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
		
	}

}
