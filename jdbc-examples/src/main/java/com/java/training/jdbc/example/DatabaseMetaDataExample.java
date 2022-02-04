package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetaDataExample {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");
			
			DatabaseMetaData metaData = connection.getMetaData();
			
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getDriverVersion());
			System.out.println(metaData.getUserName());
			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDatabaseProductVersion());
			
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

