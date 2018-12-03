package com.jp.cart.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private Connection connect;
	
	public ConnectionFactory() throws ClassNotFoundException, SQLException{
		String driverName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/orcl";
		String userName = "hr";
		String password = "hr";
		
		Class.forName(driverName);
		connect = DriverManager.getConnection(url, userName, password);
	}
	
	public Connection getConnection(){
		return connect;
	}
	
	public void closeConnection() throws SQLException{
		connect.close();
		
	}

}
