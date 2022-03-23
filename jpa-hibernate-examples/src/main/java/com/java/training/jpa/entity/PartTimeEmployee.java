package com.java.training.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name = "mapped_parttime")
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

// Use below class for Joined Strategy

//@Entity
//@DiscriminatorValue("PART")
//@Table(name = "tbl_child_parttime")
//public class PartTimeEmployee extends EmployeeParent implements java.io.Serializable {
//
//	private Integer hourlySalary;
//
//	public PartTimeEmployee() {
//	}
//
//	public Integer getHourlySalary() {
//		return hourlySalary;
//	}
//
//	public void setHourlySalary(Integer hourlySalary) {
//		this.hourlySalary = hourlySalary;
//	}
//
//}

//Use below table for TablePer Class strategy

//@Entity
//@Table(name = "inh_tpc_part_time_employee")
//public class PartTimeEmployee extends EmployeeParent implements java.io.Serializable {
//
//	private Integer hourlySalary;
//
//	public PartTimeEmployee() {
//	}
//
//	public Integer getHourlySalary() {
//		return hourlySalary;
//	}
//
//	public void setHourlySalary(Integer hourlySalary) {
//		this.hourlySalary = hourlySalary;
//	}
//
//}

//Single Table Strategy, use below class with Discriminator

//@Entity
//@DiscriminatorValue("PartTime")
//public class PartTimeEmployee extends EmployeeParent implements java.io.Serializable {
//
//	private Integer hourlySalary;
//
//	public PartTimeEmployee() {
//	}
//
//	public Integer getHourlySalary() {
//		return hourlySalary;
//	}
//
//	public void setHourlySalary(Integer hourlySalary) {
//		this.hourlySalary = hourlySalary;
//	}
//	
//	
//	
//}
