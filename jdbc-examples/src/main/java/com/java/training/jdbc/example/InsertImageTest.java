package com.java.training.jdbc.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertImageTest {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
					"iAmProForMyDb@123");

			// Store or Insert Image
			// inputStream = writeImage(connection);

			pstmt = connection.prepareStatement("SELECT * FROM employee WHERE employee_id = ?");
			pstmt.setInt(1, 999);

			ResultSet rs = pstmt.executeQuery();
			Blob imageBlob  = null;
			if (rs.next()) {
				//inputStream = rs.getBinaryStream(6);
				imageBlob = rs.getBlob(6);
			}

			//

		//	byte[] imageBytes = new byte[inputStream.available()];
		//	inputStream.read(imageBytes);

			rs.close();
			pstmt.close();

			byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
			outputStream = new FileOutputStream(new File("TechEmployee1.jpeg"));
			outputStream.write(imageBytes);
			outputStream.close();
			
			System.out.println("Image Retrived");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} finally {
			if (null != connection) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (null != inputStream) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private static InputStream writeImage(Connection connection) throws FileNotFoundException, SQLException {
		PreparedStatement pstmt;
		InputStream inputStream;
		inputStream = new FileInputStream(new File("/Users/sudarsanpro/Documents/Images/emp1.jpeg"));

		pstmt = connection.prepareStatement(
				"INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary,employee_image) VALUES (?,?,?,?,?,?)");
		pstmt.setInt(1, 999);
		pstmt.setString(2, "EmployeeWithImage");
		pstmt.setString(3, "EImage");
		pstmt.setInt(4, 25);
		pstmt.setDouble(5, 560.76);
		pstmt.setBlob(6, inputStream);

		int result = pstmt.executeUpdate();
//			
		pstmt.close();

		System.out.println("Record Inserted");
		return inputStream;
	}

}
