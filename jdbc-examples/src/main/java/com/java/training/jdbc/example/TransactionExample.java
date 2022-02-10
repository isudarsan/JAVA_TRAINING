package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionExample {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");
			Statement pstmt = null;

			// When we use false for AutoCommit, we need to call the method commit to persist the transaction.
			// By default setAutoCommit is true.
			
			connection.setAutoCommit(false);

			pstmt = connection.createStatement();
			pstmt.executeUpdate(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (11,\"HHH1\",\"H\",134,167.00)");
			pstmt.executeUpdate(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (22,\"HHH2\",\"H\",234,267.00)");
			pstmt.executeUpdate(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (32,\"HHH3\",\"H\",334,367.00)");
			pstmt.executeUpdate(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (44,\"HHH4\",\"H\",434,467.00)");

			pstmt.close();

			connection.commit();
			System.out.println("Insertions Done");

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
