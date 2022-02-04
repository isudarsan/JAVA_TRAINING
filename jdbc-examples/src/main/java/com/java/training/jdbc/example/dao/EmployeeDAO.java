/**
 * 
 */
package com.java.training.jdbc.example.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.training.jdbc.example.domain.Employee;

/**
 * @author sudarsanpro
 *
 */
public interface EmployeeDAO {

	int create(final Employee employee) throws SQLException;

	int update(final Employee employee) throws SQLException;

	int delete(final int employeeId) throws SQLException;

	List<Employee> getAll() throws SQLException;

	Employee findBy(final int employeeId) throws SQLException;

}
