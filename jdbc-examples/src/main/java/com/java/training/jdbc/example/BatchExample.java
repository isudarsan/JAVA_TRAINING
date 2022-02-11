package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExample {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");

			// Inorder to execute a batch, we must disable auto commit
			connection.setAutoCommit(false);

			Statement stmt = connection.createStatement();

			stmt.addBatch(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (105,\"HHH1\",\"H\",134,167.00)");

			stmt.addBatch(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (106,\"HHH1\",\"H\",134,167.00)");
			stmt.addBatch(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (107,\"HHH1\",\"H\",134,167.00)");
			stmt.addBatch(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (108,\"HHH1\",\"H\",134,167.00)");

			int[] array = stmt.executeBatch();

			for (int x : array) {
				System.out.println(x);
			}

			System.out.println("Batch Completed");

			connection.commit();

			stmt.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e1) {
			e1.printStackTrace();
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
