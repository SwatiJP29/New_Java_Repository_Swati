package com.jp.hr.services;

import java.util.ArrayList;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

public interface Role1 {
	public ArrayList<Employee> getEmpList() throws HrException;
	public Employee getEmpDetails(int empID) throws HrException;

}
