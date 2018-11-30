package com.jp.hr.entities;

public class User {
	private String userID;
	private String password;
	private String fullName;
	private String role;
	public User(String userID, String password, String fullName, String role) {
		super();
		this.userID = userID;
		this.password = password;
		this.fullName = fullName;
		this.role = role;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", password=" + password + ", fullName=" + fullName + ", role=" + role + "]";
	}
	
	

}
