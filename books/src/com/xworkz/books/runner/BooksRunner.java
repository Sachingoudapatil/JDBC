package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BooksRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/books";
		String userName = "root";
		String password = "8748095468";
		String insertQuery="INSERT INTO books_table VALUES(1, 'The Great Gatsby', '15.99'),(2, '1984', '12.99'),(3, 'To Kill a Mockingbird', '14.99'),(4, 'The Catcher in the Rye', '13.49'),(5, 'Moby Dick', '18.99'),(6, 'War and Peace', '22.49'),(7, 'Pride and Prejudice', '10.99'),(8, 'The Odyssey', '16.49'),(9, 'The Hobbit', '11.99'),(10, 'Brave New World', '17.49'),(11, 'Crime and Punishment', '19.99'),(12, 'Wuthering Heights', '13.79'),(13, 'Jane Eyre', '14.59'),(14, 'The Brothers Karamazov', '21.99'),(15, 'Frankenstein', '8.99'),(16, 'Dracula', '12.49'),(17, 'The Picture of Dorian Gray', '10.49'),(18, 'Don Quixote','20.99'),(19, 'Ulysses', '23.99'),(20, 'The Divine Comedy', '25.49')";
		String updateQuery1 = "UPDATE books_table SET books_pricel = '18.99' WHERE id = 1";
		String updateQuery2 = "UPDATE books_table SET books_pricel = '14.99' WHERE id = 2";
		String updateQuery3 = "UPDATE books_table SET books_pricel = '16.99' WHERE id = 3";
		String updateQuery4 = "UPDATE books_table SET books_pricel = '15.49' WHERE id = 4";
		String updateQuery5 = "UPDATE books_table SET books_pricel = '20.99' WHERE id = 5";
		String updateQuery6 = "UPDATE books_table SET books_pricel = '25.49' WHERE id = 6";
		String updateQuery7 = "UPDATE books_table SET books_pricel = '13.49' WHERE id = 7";
		String updateQuery8 = "UPDATE books_table SET books_pricel = '18.99' WHERE id = 8";
		String updateQuery9 = "UPDATE books_table SET books_pricel = '13.49' WHERE id = 9";
		String updateQuery10 = "UPDATE books_table SET books_pricel = '19.99' WHERE id = 10";
		String deleteQuery1="delete from books_table where id=11";
        String deleteQuery2="delete from books_table where id=12";
        String deleteQuery3="delete from books_table where id=13";
        String deleteQuery4="delete from books_table where id=14";
        String deleteQuery5="delete from books_table where id=15";
        String deleteQuery6="delete from books_table where id=16";
        String deleteQuery7="delete from books_table where id=17";
        String deleteQuery8="delete from books_table where id=18";
        String deleteQuery9="delete from books_table where id=19";
        String deleteQuery10="delete from books_table where id=20";

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
