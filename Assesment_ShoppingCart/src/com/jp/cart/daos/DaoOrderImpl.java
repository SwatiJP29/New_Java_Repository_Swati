package com.jp.cart.daos;

import java.util.ArrayList;

import com.jp.cart.entities.Order;
import com.jp.cart.exception.CartException;
import com.jp.cart.utilities.ConnectionFactory;

public class DaoOrderImpl implements DaoOrder{
	private ConnectionFactory factory;
	
	public DaoOrderImpl() throws CartException{
		try {
			factory = new ConnectionFactory();
		} catch (Exception e) {
			throw new CartException("Problem in connecting to database", e);
		}
	}

	@Override
	public ArrayList<Order> getOrderlist() throws CartException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderDetails(int orderId) throws CartException {
		// TODO Auto-generated method stub
		return null;
	}

}
