package com.java.training.jpa.entity;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeCompositeKey implements java.io.Serializable {

	private Integer employeeId;

	private Integer departmentId;

	public EmployeeCompositeKey() {

	}

	public EmployeeCompositeKey(Integer employeeId, Integer departmentId) {
		this.employeeId = employeeId;
		this.departmentId = departmentId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

}
