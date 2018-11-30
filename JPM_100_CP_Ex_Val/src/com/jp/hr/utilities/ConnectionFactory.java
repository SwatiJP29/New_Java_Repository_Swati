package com.jp.hr.utilities;


import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

/*Step 1. Self referential static private field.
 * Step 2: Constructor private
 * Step 3: public static method to create restricted number of instances.
 * 
 */

public class ConnectionFactory {//This is a Factory pattern class
	private static ConnectionFactory factory;
	private OracleDataSource dataSource;
	
	public ConnectionFactory() throws SQLException{
		dataSource = new OracleDataSource();
		
		dataSource.setDriverType("thin");
		dataSource.setPortNumber(1521);
		dataSource.setUser("hr");
		dataSource.setPassword("hr");
		dataSource.setServerName("localhost");
		dataSource.setServiceName("orcl");
		
	}
	
	public static ConnectionFactory getConnectionFactory() throws SQLException, ClassNotFoundException{
		if (factory==null){
			factory = new ConnectionFactory();
		}
		
		return factory;
	}
	
	public OracleDataSource getDataSource(){
		return dataSource;
	}
	
	
}
