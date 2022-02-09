package com.java.training.jdbc.example;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatememtExample {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");
			

			// CallableStatment is used to call a stored procedure available on the database.
			// Calling stored procedure with NO Params
//			CallableStatement cstmt = connection.prepareCall("{call GetAll()}");
//
//			ResultSet rs = cstmt.executeQuery();
//
//			while (rs.next()) {
//				System.out.println(rs.getString("employee_id") + "\t" + rs.getString("first_name") + "\t"
//						+ rs.getString("last_name") + "\t" + rs.getString("age") + "\t" + rs.getString("salary"));
//
//			}
//
//			rs.close();
//			cstmt.close();
			
			
			// Calling Stored procedure with 1 IN param
			
//			CallableStatement cstmt = connection.prepareCall("{call GetByEmployeeId(?)}");
//			cstmt.setInt(1, 333);
//
//			ResultSet rs = cstmt.executeQuery();
//
//			while (rs.next()) {
//				System.out.println(rs.getString("employee_id") + "\t" + rs.getString("first_name") + "\t"
//						+ rs.getString("last_name") + "\t" + rs.getString("age") + "\t" + rs.getString("salary"));
//
//			}
//
//			rs.close();
//			cstmt.close();
			
			
			// Calling Stored Procedure with IN and OUT params.
			
			CallableStatement cstmt = connection.prepareCall("{call GetTotalCount(?, ?)}");
			cstmt.setInt(1, 25);
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);

			
			cstmt.executeUpdate();
			//ResultSet rs = cstmt.executeQuery();
			
			
			//if(rs.next()) {
				System.out.println(cstmt.getInt(2));
			//}
			
			
			/*ResultSet rs = cstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("employee_id") + "\t" + rs.getString("first_name") + "\t"
						+ rs.getString("last_name") + "\t" + rs.getString("age") + "\t" + rs.getString("salary"));

			}*/

			//rs.close();
			cstmt.close();
			
			


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
