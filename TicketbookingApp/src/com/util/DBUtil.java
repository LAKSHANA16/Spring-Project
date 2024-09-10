package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection conn;
	public static Connection getDBConn() {
	 String usernameDb="root";
	 String passwordDb="1607@bk";
	 String urlDb= "jdbc:mysql://localhost:3306/hexfeb";
	 String driverName="com.mysql.cj.jdbc.Driver";
	
	//load the driver


		try {
			Class.forName(driverName);
			System.out.println("Driver loaded successfully");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded successfully");
			e.printStackTrace();
		}
		//establish connection
		try {
			conn=DriverManager.getConnection(urlDb, usernameDb, passwordDb);
			System.out.println("connection established successfully");
		} catch (SQLException e) {
			System.out.println("connection  not established successfully");
			e.printStackTrace();
		}
		return conn;
	}
	public static void dbClose()
	{
		try {
			conn.close();
			System.out.println("connection closed");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
