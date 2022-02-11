package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchExampleTwo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");

			connection.setAutoCommit(false);

			PreparedStatement preparedStatement = connection.prepareStatement(
					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (?,?,?,?,?)");

			while (true) {
				System.out.println("EID : ");
				int eId = scanner.nextInt();
				System.out.println("First Name : ");
				String fName = scanner.next();
				System.out.println("Age : ");
				int age = scanner.nextInt();
				System.out.println("Last Name : ");
				String lName = scanner.next();
				System.out.println("Salar : ");
				double salary = scanner.nextDouble();

				preparedStatement.setInt(1, eId);
				preparedStatement.setString(2, fName);
				preparedStatement.setString(3, lName);
				preparedStatement.setInt(4, age);
				preparedStatement.setDouble(5, salary);


				// addBatch method is used to add dynamic/static SQL statements to a batch.
				preparedStatement.addBatch();

				System.out.println("Do you want to Continue ? (Y/N");
				String flag = scanner.next();

				if ("N".equalsIgnoreCase(flag)) {
					break;
				}

			}

			// To Execute batch we must use executeBatch method
			preparedStatement.executeBatch();

			connection.commit();

			System.out.println("Batch Completed");

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
