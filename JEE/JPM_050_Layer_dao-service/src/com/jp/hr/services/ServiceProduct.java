package com.jp.hr.services;

import java.util.ArrayList;


import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public interface ServiceProduct {
public ArrayList<Product> getEmplist() throws HrException;
	
	public Product getProductDetails(int productId) throws HrException;
	
	public boolean addNewProduct(Product product) throws HrException;

	public ArrayList<Product> getProductList() throws HrException;
	
	public boolean updateProduct(Product product)throws HrException;
	
	public boolean deleteProduct(int productId)throws HrException;

}
