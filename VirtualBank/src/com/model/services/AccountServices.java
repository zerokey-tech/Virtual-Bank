package com.model.services;



public interface AccountServices {
	
	float deposit(int accNo,float amt);
	float withdrawl(int accNo,float amt) ;
	void transfer(int accNo,int accNo1,float amt) ;
	float balEnquiry(int accNo) ;
	


}
