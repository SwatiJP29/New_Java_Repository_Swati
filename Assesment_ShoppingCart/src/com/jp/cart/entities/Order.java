package com.jp.cart.entities;

public class Order {
	
	private String customerId;
	private String orderId;
	private int itemId;
	public Order(String customerId, String orderId, int itemId) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.itemId = itemId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "Order [customerId=" + customerId + ", orderId=" + orderId + ", itemId=" + itemId + "]";
	}
	
	

}
