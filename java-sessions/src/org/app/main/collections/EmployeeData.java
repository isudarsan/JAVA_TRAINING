package org.app.main.collections;


public class EmployeeData {

	private String jobTitle;
	private String firstName;
	private String lastName;
	private double salary;
	private int age;

	public EmployeeData(String jobTitle, String firstName, String lastName, double salary, int age) {
		this.jobTitle = jobTitle;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeData [jobTitle=" + jobTitle + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", age=" + age + "]";
	}
	
	

}
