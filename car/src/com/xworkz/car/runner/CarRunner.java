package com.xworkz.car.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CarRunner {
	
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/car";
		String userName = "root";
		String password = "8748095468";
		String insertquery="INSERT INTO car_data VALUES(1, 'Toyota Corolla', '20000'),(2, 'Honda Civic', '22000'),(3, 'Ford Mustang', '35000'),(4, 'Chevrolet Camaro', '37000'),(5, 'BMW 3 Series', '45000'),(6, 'Audi A4', '50000'),(7, 'Mercedes-Benz C-Class', '55000'),(8, 'Nissan Altima', '24000'),(9, 'Hyundai Sonata', '23000'),(10, 'Kia Optima', '22000'),(11, 'Volkswagen Passat', '28000'),(12, 'Tesla Model 3', '50000'),(13, 'Porsche 911', '95000'),(14, 'Lexus IS', '42000'),(15, 'Jaguar XF', '60000'),(16, 'Subaru Impreza', '20000'),(17, 'Mazda 6', '25000'),(18, 'Chrysler 300', '35000'),(19, 'Cadillac CTS', '55000'),(20, 'Infiniti Q50', '47000')";
		String updateQuery1=" UPDATE car.car_data SET car_price = '21000' WHERE id = 1";  
		String updateQuery2="UPDATE car.car_data SET car_price = '23000' WHERE id = 2";  
		String updateQuery3="UPDATE car.car_data SET car_price = '36000' WHERE id = 3";  
		String updateQuery4="UPDATE car.car_data SET car_price = '38000' WHERE id = 4";  
		String updateQuery5="UPDATE car.car_data SET car_price = '46000' WHERE id = 5";  
		String updateQuery6="UPDATE car.car_data SET car_price = '51000' WHERE id = 6";  
		String updateQuery7="UPDATE car.car_data SET car_price = '56000' WHERE id = 7";  
		String updateQuery8="UPDATE car.car_data SET car_price = '25000' WHERE id = 8";  
		String updateQuery9="UPDATE car.car_data SET car_price = '24000' WHERE id = 9";  
		String updateQuery10="UPDATE car.car_data SET car_price = '23000' WHERE id = 10";
		String deleteQuery1="delete from car_data where id=11";
        String deleteQuery2="delete from car_data where id=12";
        String deleteQuery3="delete from car_data where id=13";
        String deleteQuery4="delete from car_data where id=14";
        String deleteQuery5="delete from car_data where id=15";
        String deleteQuery6="delete from car_data where id=16";
        String deleteQuery7="delete from car_data where id=17";
        String deleteQuery8="delete from car_data where id=18";
        String deleteQuery9="delete from car_data where id=19";
        String deleteQuery10="delete from car_data where id=20";

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


