package org.app.main.collections;

public class Employee {

	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	// Overriding hashCode in order to make each employee object hashCode as 32 or any other integer value.
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		
		// Casting -> Convertion of super class to its subclass
		Employee emp = (Employee) obj;
		
		if(this.id == emp.getId() && this.name.equals(emp.getName()) && this.age == emp.getAge()) {
			return true;
		}else {
			return false;
		}
		
	}

}
