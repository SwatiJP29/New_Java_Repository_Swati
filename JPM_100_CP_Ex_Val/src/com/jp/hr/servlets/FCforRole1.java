package com.jp.hr.servlets;

import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.Role1;
import com.jp.hr.services.ServiceEmployeeImpl;

public class FCforRole1 {
	public static void main(String[] args){
		try {
			Role1 role = new ServiceEmployeeImpl();
		
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
