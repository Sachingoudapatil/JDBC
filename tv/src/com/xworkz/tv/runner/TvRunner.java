package com.xworkz.tv.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TvRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/tv";
		String userName = "root";
		String password = "8748095468";
		String insertQuery="INSERT INTO tv_table VALUES(1, 'Breaking Bad', '100'),(2, 'Game of Thrones', '150'),(3, 'Stranger Things', '120'),(4, 'The Office', '80'),(5, 'Friends', '90'),(6, 'The Mandalorian', '200'),(7, 'The Witcher', '140'),(8, 'Black Mirror', '130'),(9, 'Westworld', '170'),(10, 'Chernobyl', '110'),(11, 'Narcos', '115'),(12, 'Peaky Blinders', '135'),(13, 'The Crown', '160'),(14, 'Money Heist', '125'),(15, 'The Boys', '145'),(16, 'Fargo', '105'),(17, 'Rick and Morty', '95'),(18, 'Dark', '155'),(19, 'Ozark', '180'),(20, 'Better Call Saul', '165')";
		String updateQuery1 = "UPDATE tv_table SET tv_price = '120' WHERE id = 1";
		String updateQuery2 = "UPDATE tv_table SET tv_price = '160' WHERE id = 2";
		String updateQuery3 = "UPDATE tv_table SET tv_price = '130' WHERE id = 3";
		String updateQuery4 = "UPDATE tv_table SET tv_price = '100' WHERE id = 4";
		String updateQuery5 = "UPDATE tv_table SET tv_price = '110' WHERE id = 5";
		String updateQuery6 = "UPDATE tv_table SET tv_price = '210' WHERE id = 6";
		String updateQuery7 = "UPDATE tv_table SET tv_price = '150' WHERE id = 7";
		String updateQuery8 = "UPDATE tv_table SET tv_price = '140' WHERE id = 8";
		String updateQuery9 = "UPDATE tv_table SET tv_price = '180' WHERE id = 9";
		String updateQuery10 = "UPDATE tv_table SET tv_price = '120' WHERE id = 10";
		String deleteQuery1 = "delete from tv_table where id=11";
		String deleteQuery2 = "delete from tv_table where id=12";
		String deleteQuery3 = "delete from tv_table where id=13";
		String deleteQuery4 = "delete from tv_table where id=14";
		String deleteQuery5 = "delete from tv_table where id=15";
		String deleteQuery6 = "delete from tv_table where id=16";
		String deleteQuery7 = "delete from tv_table where id=17";
		String deleteQuery8 = "delete from tv_table where id=18";
		String deleteQuery9 = "delete from tv_table where id=19";
		String deleteQuery11 = "delete from tv_table where id=20";
		
		 Connection connection=null;

			try {
				connection = DriverManager.getConnection(url, userName, password); 
			Statement statement=connection.createStatement();
				int value = statement.executeUpdate(deleteQuery11);
				if (value > 0) {
					System.out.println("this is saved");
				} else {
					System.out.println("this is not saved");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			
		}

	}

}
