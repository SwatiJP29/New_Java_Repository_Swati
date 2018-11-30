package com.jp.hr.daos;

import java.util.ArrayList;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public interface DaoProduct {

	public ArrayList<Product> getProductList() throws HrException;
	public Product getProductDetails(int productId) throws HrException;
	
	public boolean insertNewRecord(Product product) throws HrException;
	
	
	
	public boolean deleteRecord(int productId) throws HrException;
	
	boolean updateRecord(Product product) throws HrException;

	

}
