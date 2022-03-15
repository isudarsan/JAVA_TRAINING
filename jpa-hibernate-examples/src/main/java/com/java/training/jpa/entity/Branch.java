package com.java.training.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch implements java.io.Serializable {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "branch_name")
	private String branchName;

	@OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
	private List<Customer> customer;

	public Branch() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

}
