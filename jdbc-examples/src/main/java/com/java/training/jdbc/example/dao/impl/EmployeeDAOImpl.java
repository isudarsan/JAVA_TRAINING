/**
 * 
 */
package com.java.training.jdbc.example.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.training.jdbc.example.constants.QueryConstants;
import com.java.training.jdbc.example.dao.EmployeeDAO;
import com.java.training.jdbc.example.domain.Employee;
import com.java.training.jdbc.example.util.DBUtil;

/**
 * @author sudarsanpro
 *
 */
public class EmployeeDAOImpl implements EmployeeDAO {

	private DBUtil dbUtil;

	public EmployeeDAOImpl() {
		dbUtil = DBUtil.getInstance();
	}

	@Override
	public int create(final Employee employee) throws SQLException {

		Connection connection = null;

		try {
			connection = dbUtil.getConnection();

			PreparedStatement pst = connection.prepareStatement(QueryConstants.INSERT);
			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getFirstName());
			pst.setString(3, employee.getLastName());
			pst.setInt(4, employee.getAge());
			pst.setDouble(5, employee.getSalary());

			int result = pst.executeUpdate();

			pst.close();

			return result;
		} catch (SQLException exception) {
			exception.printStackTrace();
		} finally {
			if (null != connection) {
				connection.close();
			}
		}

		return 0;
	}

	@Override
	public int update(final Employee employee) throws SQLException {

		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			connection = dbUtil.getConnection();

			pstmt = connection.prepareStatement(QueryConstants.UPDATE);
			pstmt.setString(1, employee.getFirstName());
			pstmt.setString(2, employee.getLastName());
			pstmt.setInt(3, employee.getAge());
			pstmt.setDouble(4, employee.getSalary());
			pstmt.setInt(5, employee.getId());

			int result = pstmt.executeUpdate();
			pstmt.close();
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != connection) {
				connection.close();
			}
		}

		return 0;

	}

	@Override
	public int delete(final int employeeId) throws SQLException {

		Connection connection = null;
		PreparedStatement pstmt = null;

		try {
			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(QueryConstants.DELETE);

			pstmt.setInt(1, employeeId);

			int result = pstmt.executeUpdate();
			pstmt.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != connection) {
				connection.close();
			}
		}

		return 0;
	}

	@Override
	public List<Employee> getAll() throws SQLException {

		List<Employee> employees = new ArrayList<Employee>();

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(QueryConstants.ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Employee employee = new Employee(Integer.parseInt(rs.getString("employee_id")),
						rs.getString("first_name"), rs.getString("last_name"), Integer.parseInt(rs.getString("age")),
						Double.parseDouble(rs.getString("salary")));

				employees.add(employee);
			}

			pstmt.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != connection) {
				connection.close();
			}
		}

		return employees;
	}

	@Override
	public Employee findBy(final int employeeId) throws SQLException {

		Employee employee = null;

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(QueryConstants.FIND_BY_ID);
			pstmt.setInt(1, employeeId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				employee = new Employee(Integer.parseInt(rs.getString("employee_id")), rs.getString("first_name"),
						rs.getString("last_name"), Integer.parseInt(rs.getString("age")),
						Double.parseDouble(rs.getString("salary")));
			}

			pstmt.close();
			rs.close();

			return employee;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != connection) {
				connection.close();
			}
		}

		return null;
	}

}
