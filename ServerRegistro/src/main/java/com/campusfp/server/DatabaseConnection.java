package com.campusfp.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection initializeDatabase() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "personas";
		String user = "root";
		String pwd = "alvaredocampus1";
		Connection con = DriverManager.getConnection(url+dbName, user, pwd);
		return con;
	}
}