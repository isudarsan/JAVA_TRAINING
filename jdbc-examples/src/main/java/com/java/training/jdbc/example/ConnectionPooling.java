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

		
		// The below one is a runtime property which is used to log every 1 sec for Hikari logging
		
		// -Dcom.zaxxer.hikari.housekeeping.periodMs=1000
		
		
		// Configure below properties in log4j2.properties inorder to get the full logging of Hikari Connection pool
		
		//logging.level.com.zaxxer.hikari.HikariConfig=DEBUG
		//logging.level.com.zaxxer.hikari=TRACE
		
		
		
		/*HikariConfig Debu Logs
		 * 
		 * 2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : allowPoolSuspension................................false
2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : autoCommit................................false
2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : catalog................................none
2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : connectionInitSql................................none
2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : connectionTestQuery................................none
2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : connectionTimeout................................30000
2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : dataSource................................none
2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : dataSourceClassName................................none
2022-02-24 10:21:36.861 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : dataSourceJNDI................................none
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : dataSourceProperties................................{password=<masked>}
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : driverClassName................................"com.mysql.cj.jdbc.Driver"
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : exceptionOverrideClassName................................none
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : healthCheckProperties................................{}
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : healthCheckRegistry................................none
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : idleTimeout................................600000
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : initializationFailTimeout................................1
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : isolateInternalQueries................................false
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : jdbcUrl................................jdbc:mysql://localhost:3306/generic_api_db
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : keepaliveTime................................0
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : leakDetectionThreshold................................0
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : maxLifetime................................2000000
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : maximumPoolSize................................2
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : metricRegistry................................none
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : metricsTrackerFactory................................none
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : minimumIdle................................2
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : password................................<masked>
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : poolName................................"HIKARI_GENERIC_API"
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : readOnly................................false
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : registerMbeans................................false
2022-02-24 10:21:36.862 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : scheduledExecutor................................none
2022-02-24 10:21:36.863 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : schema................................none
2022-02-24 10:21:36.863 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : threadFactory................................internal
2022-02-24 10:21:36.863 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : transactionIsolation................................default
2022-02-24 10:21:36.863 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : username................................"root"
2022-02-24 10:21:36.863 DEBUG 89777 --- [  restartedMain] com.zaxxer.hikari.HikariConfig           : validationTimeout................................5000
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Hikari TRACE Logs
		 *  [API housekeeper] com.zaxxer.hikari.pool.HikariPool        : HIKARI_GENERIC_API - Pool stats (total=2, active=0, idle=2, waiting=0)
		 * 
		 * 
		 * 
		 */
		
		

		
		
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
