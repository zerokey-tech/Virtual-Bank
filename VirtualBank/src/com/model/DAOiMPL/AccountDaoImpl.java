package com.model.DAOiMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.bean.User;
import com.model.daoServices.DAOAccountServices;
import com.model.provider.DBConnection;

public class AccountDaoImpl implements DAOAccountServices {
	Connection con=DBConnection.createDBConnection();
	PreparedStatement pst;

	public int insertLoginData(User lo) {
		int cnt=0;
		try {
			pst=con.prepareStatement("insert into User values(?,?,?,?,?,?,?,?)");
			pst.setString(1, lo.getUserName());
			pst.setString(2, lo.getPassword());
			pst.setString(3, lo.getSq());
			pst.setString(4, lo.getname());
			pst.setString(5, lo.getemail());
			pst.setString(6, lo.getaccType());
			pst.setInt(7, lo.getAccNo());
			pst.setFloat(8, lo.getAccBal());
			cnt=pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	public User retrieveAccDetails(int accNo) {
		User acc=null;
		try {
			pst=con.prepareStatement("select * from User where accNo=?");
			pst.setInt(1, accNo);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				acc=new User();
				acc.setAccNo(accNo);
				acc.setAccBal(rs.getFloat(8));
			}
			else {
				System.out.println("record is not found");
				acc=null;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return acc;
	}

	public int updateAccountBalance(int accNo, float amount) {
		User acc=retrieveAccDetails(accNo);
		int cnt=0;
		try {
			if(acc!=null) {
				pst=con.prepareStatement("update User set accBal=? where accNo=?");
				pst.setFloat(1, amount);
				pst.setInt(2, accNo);
				//here it was 1
				cnt=pst.executeUpdate();
					
			}
			else {
				System.out.println("accno doesn't match");
				cnt=0;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	


}
