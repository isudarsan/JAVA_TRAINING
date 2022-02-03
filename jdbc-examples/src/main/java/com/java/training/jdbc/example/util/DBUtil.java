/**
 * 
 */
package com.java.training.jdbc.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sudarsanpro
 *
 */
public class DBUtil {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/java_training";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "iAmProForMyDb@123";

	private static DBUtil INSTANCE = new DBUtil();

	private DBUtil() {

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}

	}

	public static DBUtil getInstance() {
		return INSTANCE;
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER_NAME, PASSWORD);

	}
}
