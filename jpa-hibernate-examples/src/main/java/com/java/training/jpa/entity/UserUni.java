//package com.java.training.jpa.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "user_uni")
//public class UserUni {
//
//	@Id
//	@Column(name = "id")
//	private Integer id;
//
//	@Column(name = "user_name")
//	private String userName;
//
//	@Column(name = "password")
//	private String password;
//
//	@Column(name = "first_name")
//	private String firstName;
//
//	@Column(name = "last_name")
//	private String lastName;
//
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_details_uni_id")
//	private UserDetailsUni userDetailsUni;
//
//	public UserUni() {
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
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public UserDetailsUni getUserDetails() {
//		return userDetailsUni;
//	}
//
//	public void setUserDetails(UserDetailsUni userDetailsUni) {
//		this.userDetailsUni = userDetailsUni;
//	}
//
//}
