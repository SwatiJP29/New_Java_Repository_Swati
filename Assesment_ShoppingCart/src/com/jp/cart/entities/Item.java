package com.jp.cart.entities;

public class Item {
	private int itemId;
	private String name;
	private String category="Electronics";
	private float price;
	private int itemStockNumber;
	public Item(int itemId, String name, String category, float price, int itemStockNumber) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.category = category;
		this.price = price;
		this.itemStockNumber = itemStockNumber;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getItemStockNumber() {
		return itemStockNumber;
	}
	public void setItemStockNumber(int itemStockNumber) {
		this.itemStockNumber = itemStockNumber;
	}
	@Override
	public String toString() {
		return "ItemDetails [itemId=" + itemId + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", itemStockNumber=" + itemStockNumber + "]";
	}
	
	

}
