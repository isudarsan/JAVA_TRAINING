package com.java.training.jdbc.example;

/**
 * @author sudarsanpro
 * This is class represents Employee Object which can hold employee Data.
 *
 */
public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param salary
	 */
	public Employee(int id, String firstName, String lastName, int age, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	
	

}
