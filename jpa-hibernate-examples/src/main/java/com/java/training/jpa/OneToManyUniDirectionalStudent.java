package com.java.training.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.Department;
import com.java.training.jpa.entity.Student;
import com.java.training.jpa.util.JPAUtil;

public class OneToManyUniDirectionalStudent {

	public static void main(String[] args) {

		// createStudentsInDepartment();

		//System.out.println(getStudentsByDepartmenetId(10));

	}

	
	//TODO Fix this as part of LAZY, EGER explanation
	private static List<Student> getStudentsByDepartmenetId(int departmentId) {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		Department department = em.find(Department.class, departmentId);

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
