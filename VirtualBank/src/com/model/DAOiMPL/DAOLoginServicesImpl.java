package com.model.DAOiMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.bean.User;
import com.model.daoServices.DAOLoginServices;
import com.model.provider.DBConnection;

public class DAOLoginServicesImpl implements DAOLoginServices {
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

	public User retrieveLoginDetails(String userName) {
		User lo=null;
		try {
			pst=con.prepareStatement("select * from User where userName=?");
			pst.setString(1, userName);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				lo=new User();
				lo.setUserName(userName);
				lo.setPassword(rs.getString(2));
				lo.setSq(rs.getString(3));
			}
			else {
				System.out.println("record is not found");
				lo=null;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lo;
	}

	public int updateLoginInfo(String userName,String password) {
		User lo=retrieveLoginDetails(userName);
		int cnt=0;
		try {
			if(lo!=null) {
				pst=con.prepareStatement("update User set password=? where userName=?");
				pst.setString(1, password);
				pst.setString(2, userName);
				//here it was 1
				cnt=pst.executeUpdate();
					
			}
			else {
				System.out.println("invalid credentials");
				cnt=0;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public int closeAccount(String userName) {
		User lo=retrieveLoginDetails(userName);
		int cnt=0;
		try {
			if(lo!=null) {
				pst=con.prepareStatement("delete from User where userName=?");
				
				pst.setString(1, userName);
				//here it was 1
				cnt=pst.executeUpdate();
					
			}
			else {
				System.out.println("username doesn't match");
				cnt=0;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	
	}
	
	
}



