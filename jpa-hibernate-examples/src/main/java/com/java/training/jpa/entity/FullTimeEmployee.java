package com.java.training.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;





@Entity
@Table(name = "mapped_fulltime")
public class FullTimeEmployee extends EmployeeParent implements java.io.Serializable {

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


// Use below class for Joined Strategy


//@Entity
//@DiscriminatorValue("FULL")
//@Table(name = "tbl_child_fulltime")
//public class FullTimeEmployee extends EmployeeParent implements java.io.Serializable {
//
//	private Integer fullTimeSalary;
//
//	public FullTimeEmployee() {
//	}
//
//	public Integer getFullTimeSalary() {
//		return fullTimeSalary;
//	}
//
//	public void setFullTimeSalary(Integer fullTimeSalary) {
//		this.fullTimeSalary = fullTimeSalary;
//	}
//
//}




// Use below class for TablePer class strategy

//@Entity
//@Table(name = "inh_tpc_full_employee")
//public class FullTimeEmployee extends EmployeeParent implements java.io.Serializable {
//
//	private Integer fullTimeSalary;
//
//	public FullTimeEmployee() {
//	}
//
//	public Integer getFullTimeSalary() {
//		return fullTimeSalary;
//	}
//
//	public void setFullTimeSalary(Integer fullTimeSalary) {
//		this.fullTimeSalary = fullTimeSalary;
//	}
//
//}

// Single Table Strategy, use below class with Discriminator

//@Entity
//@DiscriminatorValue("FullTime")
//public class FullTimeEmployee extends EmployeeParent implements java.io.Serializable{
//
//	private Integer fullTimeSalary;
//
//	public FullTimeEmployee() {
//	}
//
//	public Integer getFullTimeSalary() {
//		return fullTimeSalary;
//	}
//
//	public void setFullTimeSalary(Integer fullTimeSalary) {
//		this.fullTimeSalary = fullTimeSalary;
//	}
//
//}
