package com.jp.cart.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jp.cart.entities.Item;
import com.jp.cart.exception.CartException;
import com.jp.cart.utilities.ConnectionFactory;



public class DaoItemImpl implements DaoItem{
	private ConnectionFactory factory;
	
	public DaoItemImpl() throws CartException{
		try {
			factory = new ConnectionFactory();
		} catch (Exception e) {
			throw new CartException("Problem in connecting to database", e);
		} 
	}

	@Override
	public ArrayList<Item> getItemlist() throws CartException {
		ArrayList <Item> itemList = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			 connect = factory.getConnection();
			 stmt = connect.createStatement();
			 rs = stmt.executeQuery("select itemId,name,category, price, iteminstock from itemmaster");
			
			
			while (rs.next()){
				int itemId = rs.getInt("itemId");
				String itemName = rs.getString("name");
				String itemCategory = rs.getString("category");
				float itemPrice = rs.getFloat("price");
				int itemInStock = rs.getInt("iteminstock");
				itemList.add(new Item(itemId,itemName, itemCategory, itemPrice, itemInStock));
			}
		} catch ( SQLException e) {
			
			throw new CartException("Problem in fetching", e);

		} finally {
			try {
				if (rs!=null){
					rs.close();
				}
				if (stmt!=null){
					stmt.close();
				}
				
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new CartException("Problem in closing resources.", e);
			}
		}
		
		return itemList;
		
	}

	@Override
	public Item getItemDetails(int itemId) throws CartException {
		String qry = "select itemId,name,category, price, iteminstock from itemmaster where itemId = ?";
		Connection connect = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			 connect = factory.getConnection();
			 stmt = connect.prepareStatement(qry);
			 stmt.setInt(1, itemId);
			 rs = stmt.executeQuery();
			 
			
			
			if (rs.next()){
				
				String itemName = rs.getString("name");
				String itemCategory = rs.getString("category");
				float itemPrice = rs.getFloat("price");
				int itemInStock = rs.getInt("iteminstock");
				return new Item(itemId,itemName, itemCategory, itemPrice, itemInStock);
			}else {
				return null;
			}
		} catch ( SQLException e) {
			
			throw new CartException("Problem in fetching", e);

		} finally {
			try {
				if (rs!=null){
					rs.close();
				}
				if (stmt!=null){
					stmt.close();
				}
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new CartException("Problem in closing resources.", e);
			}
		}
	}

	

}
