package com.jp.cart.services;

import java.util.ArrayList;

import com.jp.cart.entities.Item;
import com.jp.cart.exception.CartException;

public interface ItemService {
	
	public ArrayList <Item> getItemList() throws CartException;
	public Item getItemDetails(int itemId) throws CartException;

}
