package org.app.main;

//Builder Pattern
public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private double salary;
	private String email;
	private String mobile;
	private int age;
	

	static class EmployeeBuilder {
		// required
		private int id;
		private String firstName;
		private int age;

		// optional

		private String lastName;
		private String gender;
		private double salary;
		private String email;
		private String mobile;

		public EmployeeBuilder(int id, String firstName, int age) {
			this.id = id;
			this.firstName = firstName;
			this.age = age;
		}

		public EmployeeBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public EmployeeBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeBuilder setEmail(String email) {
			this.email = email;
			return this;

		}

		public EmployeeBuilder setMobile(String mobile) {
			this.mobile = mobile;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

	private Employee(EmployeeBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.gender = builder.gender;
		this.salary = builder.salary;
		this.age = builder.age;
		this.email = builder.email;
		this.mobile = builder.mobile;
	}
	
	private Employee() {}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", salary=" + salary + ", email=" + email + ", mobile=" + mobile + ", age=" + age + "]";
	}
	
	

}
