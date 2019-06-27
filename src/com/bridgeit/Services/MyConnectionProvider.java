package com.bridgeit.Services;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider  {

	public  static Connection con = null;

	public MyConnectionProvider() {
		// TODO Auto-generated constructor stub
	}

	static {
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://mysql:3306/mydb", "myuser", "mypassword");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public static Connection getCon() {
		return con;
	}
}
