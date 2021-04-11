package com.myApp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker";
		String user ="root";
		String password ="";
				
		try {
			System.out.println("Connecting to MySQl :"+jdbcUrl);
			Connection con = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("Connected .....");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
