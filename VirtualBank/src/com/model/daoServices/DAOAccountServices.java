package com.model.daoServices;

import com.model.bean.User;

public interface DAOAccountServices {
	
	User retrieveAccDetails(int accNo);
	int updateAccountBalance(int accNo,float amount);
	
	
	



}
