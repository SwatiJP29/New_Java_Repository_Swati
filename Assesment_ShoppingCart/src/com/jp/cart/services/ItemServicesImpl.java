package com.jp.cart.services;

import java.util.ArrayList;

import com.jp.cart.daos.DaoItem;
import com.jp.cart.daos.DaoItemImpl;
import com.jp.cart.entities.Item;
import com.jp.cart.exception.CartException;

public class ItemServicesImpl implements ItemService {
	private DaoItem daoitem;
	
	public ItemServicesImpl() throws CartException{
		daoitem = new DaoItemImpl();
	}

	@Override
	public ArrayList<Item> getItemList() throws CartException {
		return daoitem.getItemlist();
	}

	@Override
	public Item getItemDetails(int itemId) throws CartException {
		return daoitem.getItemDetails(itemId);
	}

}
