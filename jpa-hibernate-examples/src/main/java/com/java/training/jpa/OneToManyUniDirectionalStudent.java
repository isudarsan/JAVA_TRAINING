package com.java.training.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.java.training.jpa.entity.Department;
import com.java.training.jpa.entity.Student;
import com.java.training.jpa.util.JPAUtil;

public class OneToManyUniDirectionalStudent {

	public static void main(String[] args) {

		// createStudentsInDepartment();

		List<Student> students = getStudentsByDepartmenetId(10);

		for (Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName());
		}

	}

	// TODO Explain fetch Join to resolve LAZY exception

	// To solve Lazy initilization issue, we can use FetchType as EGER, however it
	// leads to performance issues.

	// When we use EGER fetch type, all the associated entities will be loaded as
	// part of initilization into the parent entity.however this is not desirable
	// when we are dealing with large amount of data.

	private static List<Student> getStudentsByDepartmenetId(int departmentId) {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		Department department = em.find(Department.class, departmentId);

		System.out.println(department.getId() + " " + department.getDepartmentName());

		List<Student> students = null;
		if (null != department) {
			students = department.getStudents();

		}

		em.close();

		JPAUtil.close();

		return students;

	}

	private static void createStudentsInDepartment() {

//		Department department = new Department();
//		department.setId(10);
//		department.setDepartmentName("CSE");
//		

		Department department1 = new Department();
		department1.setId(20);
		department1.setDepartmentName("EEE");

//		Student student = new Student();
//		student.setId(1);
//		student.setFirstName("AAA");
//		student.setLastName("A");
//
//		Student student1 = new Student();
//		student1.setId(2);
//		student1.setFirstName("BBB");
//		student1.setLastName("B");
//
//		Student student2 = new Student();
//		student2.setId(3);
//		student2.setFirstName("CCC");
//		student2.setLastName("C");

		Student student = new Student();
		student.setId(4);
		student.setFirstName("DDD");
		student.setLastName("D");

		Student student1 = new Student();
		student1.setId(5);
		student1.setFirstName("EEE");
		student1.setLastName("E");

		List<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student1);

		department1.setStudents(students);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(department1);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

}
