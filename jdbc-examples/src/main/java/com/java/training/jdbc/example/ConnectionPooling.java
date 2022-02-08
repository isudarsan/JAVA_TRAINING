package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPooling {

	public static void main(String[] args) {

		HikariConfig config = new HikariConfig();
		
		config.setUsername("root");
		config.setPassword("iAmProForMyDb@123");
		config.setJdbcUrl("jdbc:mysql://localhost:3306/java_training");
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");

		// Pool configuration
		
		config.setPoolName("JAVA_TRINING_POOL_NAME");
		config.setMaximumPoolSize(5);
		config.setConnectionTimeout(25000);
		config.setIdleTimeout(10000);
		
		//show processlist; is used to list the number of active connections in MySQL
		
		HikariDataSource hikariDataSource = new HikariDataSource(config);
		DataSource ds = hikariDataSource;
		Connection connection = null;

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
		} catch (InterruptedException e) {
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
