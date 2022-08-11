package com.model.provider;



import com.model.services.Services;


public class LoginProvider {

	public static Services createBussinessObject() {
	Services boObject=null;
	try {
		//FileInputStream fis=new FileInputStream("resources//config.properties");
		//Properties p=new Properties();
		//p.load(fis);
		String BussinessClassName="com.model.serviceImpl.LoginServiceImpl";
		boObject=(Services) Class.forName(BussinessClassName).newInstance();
		
		
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	return boObject;

}


	

}
