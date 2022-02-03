package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionTest {

	public static void main(String[] args) {

		
		
		
		try {
			// Driver Class -> com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Pass Connection URL along with Database name & Database credentials
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");
			
			System.out.println("Connected");		
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

}
