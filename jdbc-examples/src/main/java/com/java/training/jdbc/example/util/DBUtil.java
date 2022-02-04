/**
 * 
 */
package com.java.training.jdbc.example.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Singleton ThreadSafe DB Connection
 * @author sudarsanpro
 *
 */
public class DBUtil {

	private String driver;
	private String url;
	private String userName;
	private String password;

	private static volatile DBUtil INSTANCE = null;

	/**
	 * 
	 */
	private DBUtil() {

		try {

			Properties properties = new Properties();
			properties.load(new FileInputStream(new File("db.properties")));

			String driver = properties.getProperty("driverName");
			String url = properties.getProperty("url");
			String userName = properties.getProperty("userName");
			String password = properties.getProperty("password");

			this.driver = driver;
			this.url = url;
			this.userName = userName;
			this.password = password;

			Class.forName(this.driver);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return
	 */
	public static DBUtil getInstance() {

		if (null == INSTANCE) {
			synchronized (DBUtil.class) {
				INSTANCE = new DBUtil();
			}
		}

		return INSTANCE;
	}

	/**
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.url, this.userName, this.password);

	}
}
