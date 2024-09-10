package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.model.Student1;
import com.util.DBUtil;

public class Student1Dao {
DBUtil db=new DBUtil();
Connection conn;
public List<Student1> fetchAll()
{
	conn=db.dbConnect();
	List<Student1>list=new ArrayList<>();
	String sql="select * from student";
	try {
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	while(rst.next())
	{
		int studentId=rst.getInt("student_id");
		String firstName=rst.getString("first_name");
		String lastName=rst.getString("last_name");
		Date dob=rst.getDate("dob");
		String email=rst.getString("email");
		String phoneNumber=rst.getString("phone_number");
		Student1 s=new Student1();
		s.setStudentId(studentId);
		s.setFirstName(firstName);
		s.setLastName(lastName);
		s.setDob(dob);
		s.setEmail(email);
		s.setPhoneNumber(phoneNumber);
		list.add(s);
		
	}
}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	db.dbClose();
	return list;
}
}