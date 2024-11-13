package com.xworkz.food.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.food.constants.FoodConnection;

public class FoodRunner {

public static void main(String[] args) {
		
		Connection connection=null;
		try {
		connection=	DriverManager.getConnection(FoodConnection.URL.getValue(),FoodConnection.USERNAME.getValue(),FoodConnection.PASSWORD.getValue());
		PreparedStatement preparedStatement=connection.prepareStatement("insert into food_table values(?,?,?)");
		
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "dosa");
		preparedStatement.setInt(3, 50);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "fried rice");
		preparedStatement.setInt(3, 140);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "idli");
		preparedStatement.setInt(3, 40);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "pizza");
		preparedStatement.setInt(3, 170);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "roti");
		preparedStatement.setInt(3, 180);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 6);
		preparedStatement.setString(2, "Burger");
		preparedStatement.setInt(3, 150);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 7);
		preparedStatement.setString(2, "Chicken");
		preparedStatement.setInt(3, 200);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 8);
		preparedStatement.setString(2, "fish");
		preparedStatement.setInt(3, 170);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 9);
		preparedStatement.setString(2, "Tacos");
		preparedStatement.setInt(3,160);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 10);
		preparedStatement.setString(2, "Ramen");
		preparedStatement.setInt(3, 145);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 11);
		preparedStatement.setString(2, "Steak");
		preparedStatement.setInt(3, 120);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 12);
		preparedStatement.setString(2, "Salad");
		preparedStatement.setInt(3, 145);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 13);
		preparedStatement.setString(2, "Burrito");
		preparedStatement.setInt(3, 180);
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1,14);
		preparedStatement.setString(2, "Pasta");
		preparedStatement.setInt(3, 200);
		preparedStatement.addBatch();
		
		
		preparedStatement.setInt(1, 15);
		preparedStatement.setString(2, "Sandwich");
		preparedStatement.setInt(3, 130);
		preparedStatement.addBatch();
		
		int[] rowInserted=preparedStatement.executeBatch();
		System.out.println(rowInserted.length+" added values into food_table ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
