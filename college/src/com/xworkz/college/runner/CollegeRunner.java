package com.xworkz.college.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CollegeRunner {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/college";
		String userName = "root";
		String password = "8748095468";
        String insertquery="INSERT INTO college_table VALUES(1, 'Harvard University', 'Cambridge, MA'),(2, 'Stanford University', 'Stanford, CA'),(3, 'Massachusetts Institute of Technology', 'Cambridge, MA'),(4, 'California Institute of Technology', 'Pasadena, CA'),(5, 'University of Oxford', 'Oxford, UK'),(6, 'University of Cambridge', 'Cambridge, UK'),(7, 'Princeton University', 'Princeton, NJ'),(8, 'Columbia University', 'New York, NY'),(9, 'University of Chicago', 'Chicago, IL'),(10, 'Yale University', 'New Haven, CT'),(11, 'University of California, Berkeley', 'Berkeley, CA'),(12, 'University of California, Los Angeles', 'Los Angeles, CA'),(13, 'University of Michigan', 'Ann Arbor, MI'),(14, 'University of California, San Diego', 'San Diego, CA'),(15, 'Cornell University', 'Ithaca, NY'),(16, 'University of Pennsylvania', 'Philadelphia, PA'),(17, 'Duke University', 'Durham, NC'),(18, 'Johns Hopkins University', 'Baltimore, MD'),(19, 'Northwestern University', 'Evanston, IL'),(20, 'University of Toronto', 'Toronto, Canada')";
        String updateQuery1 = "UPDATE college_table SET college_location = 'Cambridge, Massachusetts' WHERE id = 1";
        String updateQuery2 = "UPDATE college_table SET college_location = 'Stanford, California' WHERE id = 2";
        String updateQuery3 = "UPDATE college_table SET college_location = 'Cambridge, Massachusetts' WHERE id = 3";
        String updateQuery4 = "UPDATE college_table SET college_location = 'Pasadena, California' WHERE id = 4";
        String updateQuery5 = "UPDATE college_table SET college_location = 'Oxford, United Kingdom' WHERE id = 5";
        String updateQuery6 = "UPDATE college_table SET college_location = 'Cambridge, United Kingdom' WHERE id = 6";
        String updateQuery7 = "UPDATE college_table SET college_location = 'Princeton, New Jersey' WHERE id = 7";
        String updateQuery8 = "UPDATE college_table SET college_location = 'New York, New York' WHERE id = 8";
        String updateQuery9 = "UPDATE college_table SET college_location = 'Chicago, Illinois' WHERE id = 9";
        String updateQuery10 = "UPDATE college_table SET college_location = 'New Haven, Connecticut' WHERE id = 10";
        String deleteQuery1="delete from college_table where id=11";
        String deleteQuery2="delete from college_table where id=12";
        String deleteQuery3="delete from college_table where id=13";
        String deleteQuery4="delete from college_table where id=14";
        String deleteQuery5="delete from college_table where id=15";
        String deleteQuery6="delete from college_table where id=16";
        String deleteQuery7="delete from college_table where id=17";
        String deleteQuery8="delete from college_table where id=18";
        String deleteQuery9="delete from college_table where id=19";
        String deleteQuery10="delete from college_table where id=20";
        
        Connection connection=null;

		try {
			connection = DriverManager.getConnection(url, userName, password); 
		Statement statement=connection.createStatement();
			int value = statement.executeUpdate(insertquery);
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
