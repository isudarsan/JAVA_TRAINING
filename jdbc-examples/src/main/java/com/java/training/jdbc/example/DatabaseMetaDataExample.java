package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetaDataExample {

	public static void main(String[] args) {

		Connection connection  = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");

			DatabaseMetaData metaData = connection.getMetaData();

//			System.out.println(metaData.getDriverName());
//			System.out.println(metaData.getDriverVersion());
//			System.out.println(metaData.getUserName());
//			System.out.println(metaData.getDatabaseProductName());
//			System.out.println(metaData.getDatabaseProductVersion());
//			

			// List Databases
			
//			ResultSet rs = metaData.getCatalogs();
//
//			while (rs.next()) {
//				System.out.println("Database Name : " + rs.getString(1));
//			}
	
			
			
			
			// USE java_training;
			// show tables;
			// Get all tables for a specific database.
			ResultSet rs = metaData.getTables("java_training", null, null, new String[] {"TABLE"});
			
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
			
			rs.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(null!=connection) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
