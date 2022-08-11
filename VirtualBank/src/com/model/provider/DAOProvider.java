package com.model.provider;




import com.model.daoServices.DAOAccountServices;

public class DAOProvider {
	public static DAOAccountServices createDAOObject() {
		DAOAccountServices dobj=null;
		//AccountServices boObject=null;
		try {
			
			String BussinessClassName="com.model.DAOiMPL.AccountDaoImpl";
			dobj=(DAOAccountServices) Class.forName(BussinessClassName).newInstance();
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return dobj;

	}

}
