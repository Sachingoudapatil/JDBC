package com.xworkz.colour.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.colour.constants.ColourConnection;

public class ColourRunner {

public static void main(String[] args) {
		
		Connection connection=null;
		try {
		connection=	DriverManager.getConnection(ColourConnection.URL.getValue(),ColourConnection.USERNAME.getValue(),ColourConnection.PASSWORD.getValue());
		PreparedStatement preparedStatement=connection.prepareStatement("insert into colour_table values(?,?,?)");
		
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "white");
		preparedStatement.setInt(3, 500);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "black");
		preparedStatement.setInt(3, 140);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "orange");
		preparedStatement.setInt(3, 400);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "grey");
		preparedStatement.setInt(3, 170);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "brown");
		preparedStatement.setInt(3, 180);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 6);
		preparedStatement.setString(2, "red");
		preparedStatement.setInt(3, 150);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 7);
		preparedStatement.setString(2, "green");
		preparedStatement.setInt(3, 200);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 8);
		preparedStatement.setString(2, "yellow");
		preparedStatement.setInt(3, 170);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 9);
		preparedStatement.setString(2, "blue");
		preparedStatement.setInt(3,160);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 10);
		preparedStatement.setString(2, "purple");
		preparedStatement.setInt(3, 145);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 11);
		preparedStatement.setString(2, "violet");
		preparedStatement.setInt(3, 120);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 12);
		preparedStatement.setString(2, "Pink");
		preparedStatement.setInt(3, 145);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 13);
		preparedStatement.setString(2, "Teal");
		preparedStatement.setInt(3, 180);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1,14);
		preparedStatement.setString(2, "Navy");
		preparedStatement.setInt(3, 200);
		preparedStatement.addBatch();
		
		
		preparedStatement.setInt(1, 15);
		preparedStatement.setString(2, "Cyan");
		preparedStatement.setInt(3, 130);
		preparedStatement.addBatch();
		
		int[] rowInserted=preparedStatement.executeBatch();
		System.out.println(rowInserted.length+" added values into colour_table ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
