package com.springmvc.beans;

import java.io.Serializable;

public class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public UserInfo() {
	}
	public UserInfo(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
	
}
