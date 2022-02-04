package com.java.training.jdbc.example.constants;

public interface QueryConstants {

	public final static String UPDATE = "UPDATE employee SET first_name = ?, last_name = ?, age = ?, salary = ? WHERE employee_id = ?";

	public static final String DELETE = "DELETE FROM employee WHERE employee_id = ?";
	
	public static final String ALL = "SELECT * FROM employee";
	
	public static final String FIND_BY_ID = "SELECT * FROM employee WHERE employee_id = ?";
	
	public final static String INSERT = "INSERT INTO EMPLOYEE (employee_id,first_name,last_name,age,salary) VALUES (?,?,?,?,?)";
}
