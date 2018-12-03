package com.jp.cart.daos;

import java.util.ArrayList;


import com.jp.cart.entities.Order;
import com.jp.cart.exception.CartException;

public interface DaoOrder {
	
public ArrayList<Order> getOrderlist() throws CartException;
	
	public Order getOrderDetails(int orderId) throws CartException;

}
