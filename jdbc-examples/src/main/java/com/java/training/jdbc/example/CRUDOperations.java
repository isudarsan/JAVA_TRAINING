package com.java.training.jdbc.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sudarsanpro This is a DBConnection class which is used to establish
 *         DBConnection
 */
class DBConnection {
	private Connection connection;
	private ResultSet resultSet;
	private Statement statement;

	/**
	 * This method is used to create connection
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_training", "root",
				"iAmProForMyDb@123");

		return connection;
	}

	/**
	 * This method is used to close the connection
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void close() throws SQLException, ClassNotFoundException {

		if (null != statement) {
			statement.close();
		}

		if (null != resultSet) {
			resultSet.close();
		}

		if (null != connection) {
			connection.close();
		}
	}

}

/**
 * @author sudarsanpro
 *
 */
class EmployeeService {

	private DBConnection dbConnection = new DBConnection();

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	/**
	 * @return All the employees from the databse
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Employee> getAll() throws ClassNotFoundException, SQLException {
		List<Employee> employees = new ArrayList<Employee>();
		connection = dbConnection.createConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery("SELECT * FROM employee");
		while (resultSet.next()) {
			Employee employee = new Employee(Integer.parseInt(resultSet.getString("employee_id")),
					resultSet.getString("first_name"), resultSet.getString("last_name"),
					Integer.parseInt(resultSet.getString("age")), Double.parseDouble(resultSet.getString("salary")));

			employees.add(employee);

		}
		dbConnection.close();
		return employees;

	}

	/**
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void createEmployee() throws ClassNotFoundException, SQLException {
		connection = dbConnection.createConnection();
		statement = connection.createStatement();

		// In order to perform INSERT, UPDATE & DELETE we need to use executeUpdate
		// method of Statement interface
		statement.executeUpdate(
				"INSERT INTO EMPLOYEE(employee_id,first_name,last_name,age,salary) VALUES(555,\"EEE\",\"E\",25,1678.87)");
		dbConnection.close();
	}

	/**
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * This method deletes Employee
	 */
	public void deleteEmployee() throws ClassNotFoundException, SQLException {
		connection = dbConnection.createConnection();
		statement = connection.createStatement();
		statement.executeUpdate("DELETE FROM employee WHERE employee_id = 555");
		dbConnection.close();
	}

	/**
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * This method updates Employee
	 */
	public void updateEmployee() throws ClassNotFoundException, SQLException {
		connection = dbConnection.createConnection();
		statement = connection.createStatement();
		statement.executeUpdate("UPDATE employee SET salary=1000 WHERE employee_id=222");
		dbConnection.close();

	}
}

/**
 * @author sudarsanpro
 *
 */
public class CRUDOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		

		try {

			// employeeService.createEmployee();

			// employeeService.deleteEmployee();

			employeeService.updateEmployee();

			for (Employee employee : employeeService.getAll()) {
				System.out.println(employee);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
}