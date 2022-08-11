package com.model.provider;


import com.model.services.AccountServices;

public class BussinessProvider {
	public static AccountServices createBussinessObject() {
		AccountServices boObject=null;
		try {
			
			String BussinessClassName="com.model.serviceImpl.AccountServiceImpl";
			boObject=(AccountServices) Class.forName(BussinessClassName).newInstance();
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return boObject;

	}

}
