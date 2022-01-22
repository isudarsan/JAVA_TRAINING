package org.app.main.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SalaryComparator implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}

	}
}

class AgeComparator implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {

		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class FirstNameComparator implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {

		if (o1.getFirstName().compareTo(o2.getFirstName()) > 0) {
			return 1;
		} else {
			return -1;
		}

	}

}

class JobComparator implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		if (o1.getJobTitle().compareTo(o2.getJobTitle()) > 0) {
			return 1;
		} else {
			return -1;
		}
	}

}

class MultipleSortingComparator implements Comparator<EmployeeData> {

	List<Comparator<EmployeeData>> comparatorList;

	public MultipleSortingComparator(List<Comparator<EmployeeData>> comparator) {
		this.comparatorList = comparator;
	}

	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {

		for (Comparator<EmployeeData> comparator : comparatorList) {
			int value = comparator.compare(o1, o2);

			if (value != 0) {
				return value;
			}
		}

		return 0;
	}

}

public class ComparatorExample {

	public static void main(String[] args) {

		EmployeeData employeeData = new EmployeeData("Engineer", "Ravi", "A", 4500.00, 13);
		EmployeeData employeeData2 = new EmployeeData("Doctor", "Kiran", "H", 500.00, 3);
		EmployeeData employeeData3 = new EmployeeData("Clerk", "Anand", "K", 1500.00, 31);
		EmployeeData employeeData4 = new EmployeeData("Lawyer", "Pavan", "M", 200.00, 15);
		EmployeeData employeeData5 = new EmployeeData("Plumber", "Balu", "Z", 5500.00, 23);
		EmployeeData employeeData6 = new EmployeeData("Teacher", "Raj", "L", 14500.00, 34);
		EmployeeData employeeData7 = new EmployeeData("Engineer", "Jhon", "A", 41500.00, 12);
		EmployeeData employeeData8 = new EmployeeData("Engineer", "Lakshman", "H", 5700.00, 73);
		EmployeeData employeeData9 = new EmployeeData("Clerk", "Suresh", "K", 50.00, 11);
		EmployeeData employeeData10 = new EmployeeData("Doctor", "Rajesh", "M", 2010.00, 16);
		EmployeeData employeeData11 = new EmployeeData("Plumber", "Zulu", "Z", 85500.00, 22);
		EmployeeData employeeData12 = new EmployeeData("Teacher", "Chintu", "L", 100.00, 44);

		List<EmployeeData> list = new ArrayList<EmployeeData>();
		list.add(employeeData);
		list.add(employeeData2);
		list.add(employeeData3);
		list.add(employeeData4);
		list.add(employeeData5);
		list.add(employeeData6);
		list.add(employeeData7);
		list.add(employeeData8);
		list.add(employeeData9);
		list.add(employeeData10);
		list.add(employeeData11);
		list.add(employeeData12);

		// Comparator Demo
//		System.out.println("Before Sort \n");
//		for (EmployeeData data : list) {
//			System.out.println(data);
//		}

		// SalaryComparator salaryComparator = new SalaryComparator();

		// AgeComparator ageComparator = new AgeComparator();

		// Comparator interface provides a way when natural ordering is not possible
		// using Comparable interface
//		FirstNameComparator firstNameComparator = new FirstNameComparator();
//
//		Collections.sort(list, firstNameComparator);
//
//		System.out.println("\nAfter Sort\n");
//
//		for (EmployeeData data : list) {
//			System.out.println(data);
//		}

		// Multiple Comparator Demo

		JobComparator jobComparator = new JobComparator();
		SalaryComparator salaryComparator = new SalaryComparator();
		AgeComparator ageComparator = new AgeComparator();

		List<Comparator<EmployeeData>> comparators = new ArrayList<Comparator<EmployeeData>>();

		comparators.add(jobComparator);
		comparators.add(salaryComparator);
		comparators.add(ageComparator);

		

		System.out.println("Before Sort \n");
		for (EmployeeData data : list) {
			System.out.println(data);
		}

		
		Collections.sort(list, new MultipleSortingComparator(comparators));
		
		
		System.out.println("\nAfter Sort\n");

		for (EmployeeData data : list) {
			System.out.println(data);
		}

	}

}
