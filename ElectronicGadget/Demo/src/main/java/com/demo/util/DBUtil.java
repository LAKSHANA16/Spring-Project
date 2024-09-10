package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
public class DBUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

	try {
        ResourceBundle rb = ResourceBundle.getBundle("db");
        String driver = rb.getString("driver");
        String url = rb.getString("url");
        String user = rb.getString("user");
        String pwd = rb.getString("password");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, pwd);
        return connection;
    } catch (MissingResourceException e) {
        System.err.println("Resource bundle not found or missing properties: " + e.getMessage());
        throw e;
    }
}
}
