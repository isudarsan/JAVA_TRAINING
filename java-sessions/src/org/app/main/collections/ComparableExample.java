package org.app.main.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(new Customer("Africa", "Zulu", 34));
		customers.add(new Customer("America", "Jhon", 14));
		customers.add(new Customer("Pakistan", "Abdul", 54));

		System.out.println("Before Sort\n");

		for (Customer customer : customers) {
			System.out.println(customer);
		}

		Collections.sort(customers);

		System.out.println("\n\nAfter Sort\n");

		for (Customer customer : customers) {
			System.out.println(customer);
		}

	}
}
