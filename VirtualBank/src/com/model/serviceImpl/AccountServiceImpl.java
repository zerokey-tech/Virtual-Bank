package com.model.serviceImpl;

import com.model.bean.User;

import com.model.daoServices.DAOAccountServices;
import com.model.provider.DAOProvider;
import com.model.services.AccountServices;
import com.model.validation.ValidateInput;

public class AccountServiceImpl implements AccountServices {
	User acc;
	DAOAccountServices dao=DAOProvider.createDAOObject();

	
    public float deposit(int accNo,float amt){
    	
    	float updateBal=0.0f;
    	
    User dbacc=dao.retrieveAccDetails(accNo);
		    	
		    		acc=new User();
		    		acc.setAccBal(dbacc.getAccBal()+amt);
		    		updateBal=acc.getAccBal();
		    		dao.updateAccountBalance(accNo, updateBal);
		    	
		   
		  return updateBal;
    }
       public float withdrawl(int accNo,float amt)  {
    	float updateBal=0.0f;
    
    	        User dbacc=dao.retrieveAccDetails(accNo);
    			acc=new User();
	    		acc.setAccBal(dbacc.getAccBal()-amt);
	    		updateBal=acc.getAccBal();
	    		dao.updateAccountBalance(accNo, updateBal);
	    		
    	return updateBal;
    }

    

    public void transfer(int accNo,int accNo1,float amt) {
		float updateBal=0.0f;
		float updateBal1=0.0f;
		
    			
    		acc=new User();
			User dbacc=dao.retrieveAccDetails(accNo);
			User dbacc1=dao.retrieveAccDetails(accNo1);
			
			acc.setAccBal(dbacc.getAccBal()-amt);
			updateBal=acc.getAccBal();   		
			dao.updateAccountBalance(accNo, updateBal);
			acc.setAccBal(dbacc1.getAccBal()+amt);
			updateBal1=acc.getAccBal();
    		dao.updateAccountBalance(accNo1, updateBal1);
			
		
		
		
    		 
		
		
	}
    public float balEnquiry(int accNo) {
		float bal=0.0f;
		
			User dbacc=dao.retrieveAccDetails(accNo);
			bal=dbacc.getAccBal();
		
		return bal;
	}
   
   


}
