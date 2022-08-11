package com.model.bean;

public class User {
	private String userName,password,sQ,name,email,accType;
	private int accNo;
	private float accBal;
	private static int series=1001;
	private static String ifscCode;
	static {
		ifscCode="NBGU007";
	}
	public User() {
		
	}
	public User(String userName,String password,String sQ,String name,String email,String accType,float accBal) {
		this.userName=userName;
		this.password=password;
		this.sQ=sQ;
		this.name=name;
		this.email=email;
		this.accType=accType;
		this.accNo=series;
		series++;
		this.accBal=accBal;
	}
	
	//setter
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setSq(String sQ) {
		this.sQ=sQ;
	}
	
	public void setAccNo(int no) {
		accNo=no;
	}
	public void setAccBal(float bal) {
		accBal=bal;
	}
	//getter

	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getSq() {
		return sQ;
	}
	public int getAccNo() {
		return accNo;
	}
	public float getAccBal() {
		return accBal;
	}
	
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getemail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getaccType() {
		// TODO Auto-generated method stub
		return accType;
	}
	



}
