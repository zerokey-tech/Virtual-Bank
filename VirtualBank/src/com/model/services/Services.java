package com.model.services;

public interface Services {
	int signUp(String userName, String password, String sQ,String name,String email,String accType,float amt);
	boolean authenticate(String userName,String Password);
	void forgetPassword(String userName,String sQ);
	void updatePassword(String userName,String password,String newPassword);
	int deleteAccount(String userName,String Password,int accNo);
	

	

	

}
