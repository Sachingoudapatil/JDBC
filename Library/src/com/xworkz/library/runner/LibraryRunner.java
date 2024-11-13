package com.xworkz.library.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.library.constants.LibraryConnection;

public class LibraryRunner {

public static void main(String[] args) {
		
		Connection connection=null;
		try {
		connection=	DriverManager.getConnection(LibraryConnection.URL.getValue(),LibraryConnection.USERNAME.getValue(),LibraryConnection.PASSWORD.getValue());
		PreparedStatement preparedStatement=connection.prepareStatement("insert into new_table values(?,?,?)");
		
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "City Library");
		preparedStatement.setInt(3, 500);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "Local Library");
		preparedStatement.setInt(3, 1470);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "Central Library");
		preparedStatement.setInt(3, 1450);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "Community Library");
		preparedStatement.setInt(3, 1700);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "University Library");
		preparedStatement.setInt(3, 1800);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 6);
		preparedStatement.setString(2, "Public Library");
		preparedStatement.setInt(3, 1500);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 7);
		preparedStatement.setString(2, "Research Library");
		preparedStatement.setInt(3, 2000);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 8);
		preparedStatement.setString(2, "Regional Library");
		preparedStatement.setInt(3, 1700);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 9);
		preparedStatement.setString(2, "School Library");
		preparedStatement.setInt(3,1600);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 10);
		preparedStatement.setString(2, "Digital Library");
		preparedStatement.setInt(3, 1450);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 11);
		preparedStatement.setString(2, "Children Library");
		preparedStatement.setInt(3, 1200);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 12);
		preparedStatement.setString(2, "Historical Library");
		preparedStatement.setInt(3, 1450);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 13);
		preparedStatement.setString(2, "Technical Library");
		preparedStatement.setInt(3, 1800);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1,14);
		preparedStatement.setString(2, "Medical Library");
		preparedStatement.setInt(3, 2000);
		preparedStatement.addBatch();
		
		
		preparedStatement.setInt(1, 15);
		preparedStatement.setString(2, "Law Library");
		preparedStatement.setInt(3, 1300);
		preparedStatement.addBatch();
		
		int[] rowInserted=preparedStatement.executeBatch();
		System.out.println(rowInserted.length+" added values into new_table ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
