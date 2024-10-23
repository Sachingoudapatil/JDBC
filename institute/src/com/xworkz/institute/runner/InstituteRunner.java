package com.xworkz.institute.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InstituteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/institute";
		String userName="root";
		String password="8748095468";
		
		Connection connection;
		
	try {
		connection=	DriverManager.getConnection(url, userName, password);
		
		if(connection!=null) {
			System.out.println("connection created ");
		}
		else {
			System.out.println("connection not created");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
