/**
 * 
 */
package org.app.main.collections;

/**
 * @author sudarsanpro
 *
 */


// Comparable interface provides natural ordering on elements that a collection use
public class Customer implements Comparable<Customer> {

	private String firstName;
	private String lastName;
	private int age;

	public Customer(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Customer anotherCustomer) {

		/*
		 * if(this.getAge() > anotherCustomer.getAge()) { return 1; }else { return -1; }
		 */

		if (this.getLastName().compareTo(anotherCustomer.getLastName()) > 0) {
			return 1;
		} else {
			return -1;
		}

	}

}
