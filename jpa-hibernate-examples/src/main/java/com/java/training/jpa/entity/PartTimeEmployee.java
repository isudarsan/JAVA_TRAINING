package com.java.training.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PartTime")
public class PartTimeEmployee extends EmployeeParent implements java.io.Serializable {

	private Integer hourlySalary;

	public PartTimeEmployee() {
	}

	public Integer getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(Integer hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	
	
	
}
