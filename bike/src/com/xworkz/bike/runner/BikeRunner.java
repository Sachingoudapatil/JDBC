package com.xworkz.bike.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class BikeRunner {
	
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/bike";
		String userName = "root";
		String password = "8748095468";
		String insertQuery = "insert into bike_data values(1,'BMW','s1k'),(2,'BMW','gsa'),(3,'BMW','GS310'),(4,'Kawasaki','ZX3r'),(5,'Kawasaki','zx4r'),(6,'Kawasaki','zx6r'),(7,'Kawasaki','z800'),(8,'Kawasaki','z900'),(9,'Kawasaki','z1000'),(10,'Kawasaki','zx10r'),(11,'Kawasaki','zx14r'),(12,'ducati','panigalev4'),(13,'ducati','panigalev4r'),(14,'RE','classic350'),(15,'RE','classic500'),(16,'RE','bullet350'),(17,'RE','Hunter'),(18,'RE','Himalayan410'),(19,'RE','Himalayan450'),(20,'RE','GT650')";
        String updateQuery1="update bike_data set bike_name = 'bmw' WHERE id = 1";
        String updateQuery2="update bike_data set bike_name = 'bmw' WHERE id = 2";
        String updateQuery3="update bike_data set bike_name = 'bmw' WHERE id = 3";
        String updateQuery4="update bike_data set bike_name = 'kawa' WHERE id = 4";
        String updateQuery5="update bike_data set bike_name = 'kawa' WHERE id = 5";
        String updateQuery6="update bike_data set bike_name = 'kawa' WHERE id = 6";
        String updateQuery7="update bike_data set bike_name = 'kawa' WHERE id = 7";
        String updateQuery8="update bike_data set bike_name = 'kawa' WHERE id = 8";
        String updateQuery9="update bike_data set bike_name = 'kawa' WHERE id = 9";
        String updateQuery10="update bike_data set bike_name = 'kawa' WHERE id = 10";
        String deleteQuery1="delete from bike_data where id=11";
        String deleteQuery2="delete from bike_data where id=12";
        String deleteQuery3="delete from bike_data where id=13";
        String deleteQuery4="delete from bike_data where id=14";
        String deleteQuery5="delete from bike_data where id=15";
        String deleteQuery6="delete from bike_data where id=16";
        String deleteQuery7="delete from bike_data where id=17";
        String deleteQuery8="delete from bike_data where id=18";
        String deleteQuery9="delete from bike_data where id=19";
        String deleteQuery10="delete from bike_data where id=20";

        Connection connection=null;

		try {
			connection = DriverManager.getConnection(url, userName, password); 
		Statement statement=connection.createStatement();
			int value = statement.executeUpdate(deleteQuery10);
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
	


