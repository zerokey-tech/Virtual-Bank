package com.model.daoServices;

import com.model.bean.User;

public interface DAOLoginServices {
	int insertLoginData(User lo);
	User retrieveLoginDetails(String userName);
	int updateLoginInfo(String userName,String password);
	int closeAccount(String userName);


}
