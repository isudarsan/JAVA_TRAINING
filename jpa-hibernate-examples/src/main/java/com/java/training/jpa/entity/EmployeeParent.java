package com.java.training.jpa.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(name = "TYPE")
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
