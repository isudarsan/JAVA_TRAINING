package com.java.training.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FullTime")
public class FullTimeEmployee extends EmployeeParent implements java.io.Serializable{

	private Integer fullTimeSalary;

	public FullTimeEmployee() {
	}

	public Integer getFullTimeSalary() {
		return fullTimeSalary;
	}

	public void setFullTimeSalary(Integer fullTimeSalary) {
		this.fullTimeSalary = fullTimeSalary;
	}

}
