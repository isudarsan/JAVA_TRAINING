package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");

			// The below SQL query is parameterized and it also called as PreparedStatement
			// INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES
			// (?,?,?,?,?)

			// Below piece of code for Insert

//			pstmt = connection.prepareStatement(
//					"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (?,?,?,?,?)");
//			pstmt.setInt(1, 666);
//			pstmt.setString(2, "Sample");
//			pstmt.setString(3, "Sample Test");
//			pstmt.setInt(4, 15);
//			pstmt.setDouble(5, 1560.76);
//
//			int result = pstmt.executeUpdate();
//			
//			System.out.println("The Result is : "+result);
//			
//			System.out.println("Record Inserted");

			// =================== Delete =================

//			String deleteByIdQuery = "DELETE FROM employee WHERE employee_id = ?";
//			String deleteByFirstNameQuery = "DELETE FROM employee WHERE first_name = ?";
//
//			pstmt = connection.prepareStatement(deleteByFirstNameQuery);
//			//pstmt.setInt(1, 222);
//			
//			pstmt.setString(1, "AAA");
//
//			int result = pstmt.executeUpdate();
//
//			System.out.println("The Result is : " + result);
//
//			if (result > 0) {
//				System.out.println("Record Deleted");
//			} else {
//				System.out.println("Record doesnt exists!");
//			}

			// ================ Update =====================
//			pstmt = connection.prepareStatement(
//					"UPDATE employee SET first_name = ?, last_name = ?, age = ?, salary = ? WHERE employee_id = ?");
//			
//
//			pstmt.setString(1, "Updated First Name");
//			pstmt.setString(2, "Update Last Name");
//			pstmt.setInt(3, 67);
//			pstmt.setDouble(4, 560.55);
//			pstmt.setInt(5, 333);
//
//			int result = pstmt.executeUpdate();
//
//			System.out.println("The Result is : " + result);
//
//			if (result > 0) {
//				System.out.println("Record Updated");
//			} else {
//				System.out.println("Record doesnt exists!");
//			}

			// =========== Selection ===================

			pstmt = connection.prepareStatement("SELECT * FROM employee WHERE employee_id = ?");
			pstmt.setInt(1, 111);
			ResultSet rs = pstmt.executeQuery();
			
			

			while (rs.next()) {
				System.out.println(rs.getString("employee_id") + "\t" + rs.getString("first_name") + "\t"
						+ rs.getString("last_name") + "\t" + rs.getString("age") + "\t" + rs.getString("salary"));
			}

			rs.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {

			if (null != pstmt) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

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
