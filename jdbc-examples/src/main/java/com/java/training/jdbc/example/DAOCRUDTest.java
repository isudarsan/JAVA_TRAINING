/**
 * 
 */
package com.java.training.jdbc.example;

import java.sql.SQLException;
import java.util.List;

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

			// Insert Employee

//			int result = dao.create(new Employee(888, "Sample Eight", "Eight", 45, 987.00));
//
//			if (result > 0) {
//				System.out.println("Record Inserted");
//			} else {
//				System.out.println("Record not inserted");
//			}

			// Update Employee
//			int result = dao.update(new Employee(444, "Jhon", "Wick", 56, 8760.45));
//
//			if (result > 0) {
//				System.out.println("Record Updated");
//			} else {
//				System.out.println("Record Not found !");
//			}

			// Delete Employee

//			int result = dao.delete(111);
//
//			if (result > 0) {
//				System.out.println("Record Deleted");
//			} else {
//				System.out.println("Record doesnt exists!");
//			}

			
			// List All Employees
			
//			List<Employee> employees = dao.getAll();
//
//			for (Employee employee : employees) {
//				System.out.println(employee);
//			}
			
			
			
			// Find Employee by ID
			Employee employee = dao.findBy(444);
			
			if(null!=employee) {
				System.out.println("Record Found");
				System.out.println(employee);
			}else {
				System.out.println("Record doesnt exists!");
			}
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
