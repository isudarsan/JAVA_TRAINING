/**
 * 
 */
package com.java.training.jdbc.example.dao;

import java.sql.SQLException;

import com.java.training.jdbc.example.domain.Employee;

/**
 * @author sudarsanpro
 *
 */
public interface EmployeeDAO {

	int create(final Employee employee) throws SQLException;
	
}
