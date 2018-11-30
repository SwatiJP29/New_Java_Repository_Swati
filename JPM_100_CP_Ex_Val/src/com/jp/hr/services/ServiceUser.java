package com.jp.hr.services;

import com.jp.hr.entities.User;
import com.jp.hr.exceptions.HrException;

public interface ServiceUser {
	public User getUserDetails(String userID) throws HrException;
}
