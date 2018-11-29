package com.jp.hr.exceptions;

public class HrException extends Exception {

	public HrException(String message, Throwable cause) {
		super(message, cause);	
	}

	public HrException(String message) {
		super(message);	
	}
	
}
