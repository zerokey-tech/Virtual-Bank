package com.model.validation;

public class ValidateInput {
	public static boolean validateAccNo(int accNo) {
		if(accNo>0) 
			return true;
		else 
			return false;
	}
	public static boolean validateAmount(float amt) {
		if(amt>0)
			return true;
		else
			return false;
		
	}

}
