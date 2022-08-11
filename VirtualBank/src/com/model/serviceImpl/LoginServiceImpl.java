package com.model.serviceImpl;

import com.model.DAOiMPL.*;

import com.model.bean.User;
import com.model.services.Services;

    public class LoginServiceImpl implements Services{
	User u;
	DAOLoginServicesImpl dao=new DAOLoginServicesImpl();
	public int signUp(String userName, String password, String sQ,String name,String email,String accType,float amt) {
		int accNo=0;
		if(amt==0) {
		u=new User(userName,password,sQ,name,email,accType,amt);
		dao.insertLoginData(u);	
		accNo=u.getAccNo();
		}
		else {
			//System.out.println("amount not valid");
			accNo=0;
		}
		return accNo;
		
	}

	public boolean authenticate(String userName,String Password) {
	
		User db=dao.retrieveLoginDetails(userName);
		
		if (  db.getUserName().equals(userName) && db.getPassword().equals(Password)) { 
			return true;
		}
		else {
			return false;
		}
		
	}
	public void forgetPassword(String userName,String sQ) {
		User dbacc=dao.retrieveLoginDetails(userName);
		u=new User();
		if (dbacc.getUserName().equals(userName) ) {
			if( dbacc.getSq().equals(sQ)) {
		u.setPassword("hello");
		String password=u.getPassword();
		dao.updateLoginInfo(userName,password);
			}
		}
		
		
			

	}
	public void updatePassword(String userName,String password,String newPassword){
		User dbacc=dao.retrieveLoginDetails(userName);
		u=new User();
		if (dbacc.getUserName().equals(userName)) {
			if(dbacc.getPassword().equals(password)) {
		u.setPassword(newPassword);
		String password1=u.getPassword();
		dao.updateLoginInfo(userName,password1);
		
		}
		}
		}
	public int deleteAccount(String userName,String Password,int accNo) {
    	u=new User();
		int dbacc=dao.closeAccount(userName);
		return dbacc;
    	
    }
}
