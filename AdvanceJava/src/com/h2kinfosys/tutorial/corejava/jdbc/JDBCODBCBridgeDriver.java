package com.h2kinfosys.tutorial.corejava.jdbc;

import java.sql.*;

public class JDBCODBCBridgeDriver {
	static Statement stmt = null;
	static Connection con = null;
	static {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Class Loaded...");

			con = DriverManager.getConnection("jdbc:odbc:MSOracleDSN", "HR","HR");
			System.out.println("Connection ok.");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Exception: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		try {
			selectQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectQuery() throws SQLException{
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employees");
		while (rs.next()) {
			System.out.println(rs.getString("EMAIL") + " "
					+ rs.getString(1) + " "
					+ rs.getString("first_name") + " "
					+ rs.getString("last_name"));
		}
		con.close();
	}
}