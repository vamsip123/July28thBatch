package com.h2kinfosys.tutorial.corejava.jdbc;
import java.sql.*;

public class JDBCODBCBridgeDriver {
	
	public static void main(String[] args) {
		Connection con = null;
	    try {
	      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver") ;
	      System.out.println("Class Loaded...");
	      
	      con = DriverManager.getConnection("jdbc:odbc:OracleUserDSN","HR","HR");
	      System.out.println("Connection ok.");
	      con.close();

	    } catch (Exception e) {
	    	e.printStackTrace();
	      System.err.println("Exception: "+e.getMessage());
	    }
	  }
}