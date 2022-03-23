package com.java.training.jpa.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;


@MappedSuperclass
@Table(name = "mapped_employee")
public class EmployeeParent implements java.io.Serializable {

	@Id
	private Integer id;

	private String name;

	public EmployeeParent() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

// Use below class for Joined Strategy

//@Inheritance(strategy = InheritanceType.JOINED)
//@Entity
//@DiscriminatorColumn(name = "TYPE")
//@Table(name = "tbl_parent_joined_employee")
//public class EmployeeParent implements java.io.Serializable {
//
//	@Id
//	private Integer id;
//
//	private String name;
//
//	public EmployeeParent() {
//
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//}

// Use below class for TablePer class strategy

//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Table(name = "inh_tpc_employee")
//public class EmployeeParent implements java.io.Serializable {
//
//	@Id
//	private Integer id;
//
//	private String name;
//
//	public EmployeeParent() {
//
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//}

// Use below class for Single Table Strategy

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Entity
//@DiscriminatorColumn(name = "TYPE")
//public class EmployeeParent implements java.io.Serializable {
//
//	@Id
//	private Integer id;
//
//	private String name;
//
//	public EmployeeParent() {
//
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//}
