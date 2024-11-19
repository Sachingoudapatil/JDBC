package com.xworkz.scholarshipform.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.scholarshipform.constants.ScholarshipConnection;
import com.xworkz.scholarshipform.dto.ScholarshipDto;

public class ScholarshipRepositoryImp implements ScholarshipRepository {

	@Override
	public boolean save(ScholarshipDto scholarshipDto) {

		boolean saved = true;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ScholarshipConnection.URL.getValue(),
					ScholarshipConnection.USERNAME.getValue(), ScholarshipConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection.prepareStatement("insert into scholarship_table values(?,?,?,?,?,?)");
			preparedStatement.setString(1, scholarshipDto.getFirstName());
			preparedStatement.setString(2, scholarshipDto.getLastName());
			preparedStatement.setString(3, scholarshipDto.getEmail());
			preparedStatement.setLong(4, scholarshipDto.getPhoneNo());
			preparedStatement.setInt(5, scholarshipDto.getAge());
			preparedStatement.setString(6, scholarshipDto.getAddress());

			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				System.out.println("saved into db");
			} else {
				saved = false;
				System.err.println("not saved into db");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return(saved);
	}
	}

		
