package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public class DaoProductImpl implements DaoProduct{
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		String driverName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/orcl";
		String userName = "hr";
		String password = "hr";
		
		
		
			Class.forName(driverName);
			return DriverManager.getConnection(url,userName, password);
		
	}
	
	private void closeConnection(Connection connect) throws SQLException{
		connect.close();
		
	}

	@Override
	public ArrayList<Product> getProductList() throws HrException {
		ArrayList<Product> productList = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			 connect = getConnection();
			 stmt = connect.createStatement();
			 rs = stmt.executeQuery("select productid,productcategory,productname, productprice from products");
			
			
			while (rs.next()){
				int productId = rs.getInt("productid");
				String productCategory = rs.getString("productcategory");
				String productName = rs.getString("productname");
				float productPrice = rs.getFloat("productprice");
				productList.add(new Product(productId, productCategory, productName, productPrice));
						
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			throw new HrException("Problem in fetching", e);

		} finally {
			try {
				if (rs!=null){
					rs.close();
				}
				if (stmt!=null){
					stmt.close();
				}
				
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
		
		return productList;
	}

	@Override
	public Product getProductDetails(int productId) throws HrException {
		String qry = "select productid, productcategory,productname, productprice from products where productid = ?";
		Connection connect = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			 connect = getConnection();
			 stmt = connect.prepareStatement(qry);
			 stmt.setInt(1, productId);
			 rs = stmt.executeQuery();
			 
			
			
			if (rs.next()){
				
				String productCategory = rs.getString("productcategory");
				String productName = rs.getString("productname");
				float productPrice = rs.getFloat("productprice");
				return new Product(productId, productCategory, productName, productPrice);
			}else {
				return null;
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			throw new HrException("Problem in fetching", e);

		} finally {
			try {
				if (rs!=null){
					rs.close();
				}
				if (stmt!=null){
					stmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean insertNewRecord(Product product) throws HrException {
		String qry = "INSERT INTO Products (productid, productcategory,productname, productprice) values (?,?,?,?)";
		Connection connect = null;
		PreparedStatement stmt = null;
		
		
		try {
			 connect = getConnection();
			 stmt = connect.prepareStatement(qry);
			 stmt.setInt(1, product.getProductId());
			 stmt.setString(2,  product.getProductCategory());
			 stmt.setString(3, product.getProductName());
			 stmt.setFloat(4, product.getProductPrice());
			 
			 int recInserted = stmt.executeUpdate();
			 return recInserted==1? true: false;
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			throw new HrException("Problem in fetching", e);

		} finally {
			try {
				
				if (stmt!=null){
					stmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean updateRecord(Product product) throws HrException {
		String qry = "UPDATE Products SET productcategory=?, productname=?, productprice=? where productid=?";
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try {
			 connect = getConnection();
			 stmt = connect.prepareStatement(qry);
			 stmt.setInt(4, product.getProductId());
			 stmt.setString(1,  product.getProductCategory());
			 stmt.setString(2, product.getProductName());
			 stmt.setFloat(3, product.getProductPrice());
			 
			 int recInserted = stmt.executeUpdate();
			 return recInserted==1? true: false;
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			throw new HrException("Problem in fetching", e);

		} finally {
			try {
				
				if (stmt!=null){
					stmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean deleteRecord(int productId) throws HrException {
		String qry = "delete from products where productid = ?";
		Connection connect = null;
		PreparedStatement stmt = null;
		
		
		try {
			 connect = getConnection();
			 stmt = connect.prepareStatement(qry);
			 stmt.setInt(1, productId);
			 int recDeleted = stmt.executeUpdate();
			 return recDeleted==1? true: false;
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			
			throw new HrException("Problem in fetching", e);

		} finally {
			try {
				
				if (stmt!=null){
					stmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}
	

}
