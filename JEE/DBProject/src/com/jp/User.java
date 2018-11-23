package com.jp;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class User {
	
	String user;
	String password;
	
	public User(String user, String password){
		this.user=user;
		this.password=password;
	}
	
	public boolean validateUser()  {
		boolean flag=false;
		Connection con = null;
        PreparedStatement st = null;

        try {
        
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
            st = con.prepareStatement("SELECT COUNT(*) from Employees where first_name=? and last_name=?");
            st.setString(1, this.user);
            st.setString(2, this.password);
            ResultSet rs= st.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            if (count==1){
            	flag = true;
            }
            
           

            
                //close everything
            	rs.close();
                st.close();
                con.close();
                System.out.println("Closed everything!");
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println("Error while closing the connection " + ex.getMessage());
            }
                
		
		return flag;
	}

}
