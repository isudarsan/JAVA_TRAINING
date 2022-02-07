package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataExample {

	public static void main(String[] args) {

		Connection connection = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");

			PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM employee");
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();

			System.out.println("Total Columns in Employee Table : " + metaData.getColumnCount());

			for (int i = 1; i <= metaData.getColumnCount(); i++) {
				System.out.println(metaData.getColumnName(i));

			}

			pstmt.close();
			rs.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != connection) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
