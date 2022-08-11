package com.model.provider;

import java.sql.Connection;
import java.sql.DriverManager;


	public class DBConnection {
		public static Connection createDBConnection() {
			Connection con = null;
			try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/neeldb?autoReconnect=true&useSSL=false","root","thisisme");
			
		    }
			catch(Exception e) {
				e.printStackTrace();
			}
			return con;

	}

			}

