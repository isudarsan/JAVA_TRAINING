package org.app.main.collections;

import java.util.HashSet;
import java.util.Set;

public class GenericSetExample {

	public static void main(String[] args) {

//		// Boxing
//		double x = 10.25;
//		
//		System.out.println(x);
//		
//		int y = (int) x;
//		
//		System.out.println(y);
//		
//		
//		
//		// Unboxing
//		int a = 10;
//		
//		System.out.println(a);
//
//		
//		double b = (double) a;
//		
//		System.out.println(b);
//		

//		Set<String> set = new HashSet<String>();
//		
//		set.add("AAA");
//		set.add("BBB");
//		set.add("CCC");
//		set.add("DDD");
//		set.add("AAA");
//		
//		
//		for(String st : set) {
//			System.out.println(st);
//		}
//		
//		System.out.println("Size of the Set : "+set.size());
//		

		// Override equals and hasCode in order to store unique custom objects in to the
		// set, else the Set treats them as individual objects since each object hash
		// code is unique in memory
		Set<Employee> employeeSet = new HashSet<Employee>();

		employeeSet.add(new Employee(111, "AAA", 200));
		employeeSet.add(new Employee(222, "BBB", 300));
		employeeSet.add(new Employee(333, "CCC", 300));
		employeeSet.add(new Employee(444, "DDD", 400));
		employeeSet.add(new Employee(111, "AAA", 200));

		for (Employee emp : employeeSet) {
			System.out.println(emp);
		}

	}
}
