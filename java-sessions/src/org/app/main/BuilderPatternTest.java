package org.app.main;

public class BuilderPatternTest {

	public static void main(String[] args) {

		Employee employee = new Employee.EmployeeBuilder(111, "AAAA", 25).build();

		System.out.println(employee);

		Employee employee1 = new Employee.EmployeeBuilder(111, "AAA", 32).setEmail("myemail@gmail.com").build();
		System.out.println(employee1);

		Employee employee2 = new Employee.EmployeeBuilder(222, "BBB", 34).setLastName("LastName").setGender("Male")
				.setMobile("9591543252").build();
		System.out.println(employee2);

		Employee employee3 = new Employee.EmployeeBuilder(333, "CCC", 100).setLastName("ccccc")
				.setGender("Female")
				.setSalary(100)
				.setMobile("SomeMobile")
				.setEmail("email")
				.build();
		
		System.out.println(employee3);
		
		
		
		
		
		

	}

}
