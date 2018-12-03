package com.jp.cart.exception;

public class CartException extends Exception{

	public CartException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CartException(Throwable message) {
		super(message);
		
	}
	

}
