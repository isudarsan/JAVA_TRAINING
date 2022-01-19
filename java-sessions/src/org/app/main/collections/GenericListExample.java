/**
 * 
 */
package org.app.main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author AS00616854
 *
 */
public class GenericListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		// list.add(10); // Not possible since the list can hold only Strings
		list.add("AAAA");

		List<Integer> ints = new ArrayList<Integer>();
		ints.add(10);
		// ints.add("AAAA"); // Not possible since the list can hold only Integers

	//	List<Employee> employees = new ArrayList<Employee>();

//		
//
//		employees.add(new Employee(111, "AAA", 23));
//		employees.add(new Employee(222, "BBB", 34));
//		employees.add(new Employee(333, "CCC", 45));

//		Iterator<Employee> it = employees.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

//		for(int i =0 ; i < employees.size(); i++) {
//			System.out.println(employees.get(i));
//		}

//		
//		for(Employee e : employees) {
//			System.out.println(e);
//		}

		EmployeeService service = new EmployeeServiceImpl();

		service.create(new Employee(111, "AAA", 23));
		service.create(new Employee(222, "BBB", 34));
		service.create(new Employee(333, "CCC", 45));

		System.out.println(service.getAll());
		
		System.out.println(service.findBy(222));
		
		service.delete(222);
		
		System.out.println(service.getAll());

	}
}
