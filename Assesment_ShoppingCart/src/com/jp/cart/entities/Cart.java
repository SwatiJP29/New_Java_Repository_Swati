package com.jp.cart.entities;

import java.util.ArrayList;

public class Cart {
	
	private ArrayList<Item> cart;

	public Cart(ArrayList<Item> cart) {
		super();
		this.cart = cart;
	}

	public ArrayList<Item> getCart() {
		return cart;
	}

	public void setCart(ArrayList<Item> cart) {
		this.cart = cart;
	}
	
	

}
