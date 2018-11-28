package com.jp.hr.entities;

public class Employee {
	private int empID;
	private String firstName;
	private String lastName;
	
	public Employee(int empID, String firstName, String lastName) {
		
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		super();
	}

	public int getEmpID() { //Property name: empID
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getFirstName() { //Property name: firstName
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {   //Property name: lastName
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
