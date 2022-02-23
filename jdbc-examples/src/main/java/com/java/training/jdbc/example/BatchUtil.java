package com.java.training.jdbc.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.java.training.jdbc.example.domain.Employee;

public class BatchUtil {

	public static <T> List<List<T>> makeBatch(Collection<T> collection, int batchSize) {

		List<List<T>> totalArrayList = new ArrayList<>();
		List<T> subLists = new ArrayList<>();

		Iterator<T> it = collection.iterator();

		for (int i = 0; i < collection.size(); i++) {

			subLists.add(it.next());

			if ((i + 1) % batchSize == 0) {

				totalArrayList.add(subLists);
				subLists = new ArrayList<>();

			}

		}

		if (subLists.size() > 0) {
			totalArrayList.add(subLists);
		}

		return totalArrayList;

	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		for (int i = 1; i <= 10; i++) {
			employees.add(new Employee(i, "AAA" + i, "A" + i, i + 2, 100 + i));
		}

		List<List<Employee>> employeeLists = makeBatch(employees, 5);
		
		
		for(List<Employee> emps : employeeLists) {
			
			for(Employee e : emps) {
				System.out.print(e);
			}
			
			System.out.println("Batch Ended");
			
			System.out.println();
		}
		
		
		

	}

}
