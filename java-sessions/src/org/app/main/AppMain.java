package org.app.main;

import org.app.model.Employee;
import org.app.service.EmployeeService;
import org.appl.util.ServiceUtil;

public class AppMain {

	public static void main(String[] args) {

		
		EmployeeService employeeService = ServiceUtil.getEmployeeService();
		
		
		// Create 5 employees like this.
		Employee employee = new Employee(111, "Name1", 200);
		
		employeeService.create(employee);
		
		Employee[] employees = employeeService.getAll();
		
		Employee empolyee = employeeService.findBy(111);
		
		employee = employeeService.findBy("AAAA");
		
		System.out.println("Hello Spring");
	}

}
