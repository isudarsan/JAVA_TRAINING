package org.appl.util;

import org.app.service.EmployeeService;
import org.app.service.impl.EmployeeServiceImpl;

public class ServiceUtil {

	
	public static EmployeeService getEmployeeService() {
		return EmployeeServiceImpl.getInstance();
	}
}
