/**
 * 
 */
package com.java.training.jdbc.example;

import java.sql.SQLException;

import com.java.training.jdbc.example.dao.EmployeeDAO;
import com.java.training.jdbc.example.dao.impl.EmployeeDAOImpl;
import com.java.training.jdbc.example.domain.Employee;

/**
 * @author sudarsanpro
 *
 */
public class DAOCRUDTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAOImpl();

		try {
			int result = dao.create(new Employee(888, "Sample Eight", "Eight", 45, 987.00));

			if (result > 0) {
				System.out.println("Record Inserted");
			} else {
				System.out.println("Record not inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
