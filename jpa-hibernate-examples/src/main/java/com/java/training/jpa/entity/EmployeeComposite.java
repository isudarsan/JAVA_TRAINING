package com.java.training.jpa.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee_composite")

public class EmployeeComposite implements java.io.Serializable {

	// EmbededId is used to specify composite primary key

	// @IdClass is also used to create composite primary key

	@EmbeddedId
	private EmployeeCompositeKey employeeCompositeKey;

	@Column(name = "employee_name")
	private String employeeName;

	public EmployeeComposite() {

	}

	public EmployeeComposite(EmployeeCompositeKey employeeCompositeKey, String employeeName) {
		this.employeeCompositeKey = employeeCompositeKey;
		this.employeeName = employeeName;
	}

	public EmployeeCompositeKey getEmployeeCompositeKey() {
		return employeeCompositeKey;
	}

	public void setEmployeeCompositeKey(EmployeeCompositeKey employeeCompositeKey) {
		this.employeeCompositeKey = employeeCompositeKey;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
