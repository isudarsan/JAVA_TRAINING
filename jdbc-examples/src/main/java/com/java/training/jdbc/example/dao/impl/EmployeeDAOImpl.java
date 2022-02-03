/**
 * 
 */
package com.java.training.jdbc.example.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
