package org.app.main.collections;

// Immutable class
final public class ImmutableStudent {

	 private final int id;
	 private final String name;
	 private final int age;

	public ImmutableStudent(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}



