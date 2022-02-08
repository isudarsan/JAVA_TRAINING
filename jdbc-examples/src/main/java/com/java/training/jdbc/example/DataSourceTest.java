package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceTest {

	public static void main(String[] args) {
		Connection connection = null;
		
		
	
		MysqlDataSource mysqlDataSource = new MysqlDataSource();
		
		mysqlDataSource.setUser("root");
		mysqlDataSource.setServerName("localhost");
		mysqlDataSource.setDatabaseName("java_training");
		mysqlDataSource.setPassword("iAmProForMyDb@123");
		mysqlDataSource.setPort(3306);

		
		// DataSource is an interface which is alternative to DriverManager class.
		// By the help of DataSource we can implement connection pooling.
		DataSource ds = mysqlDataSource;

		try {
			connection = ds.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROm employee");

			while (rs.next()) {
				System.out.println(rs.getString("employee_id") + "\t" + rs.getString("first_name"));
			}

			rs.close();
			statement.close();
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
