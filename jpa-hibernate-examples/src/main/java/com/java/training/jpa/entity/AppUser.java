package com.java.training.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "app_user")
public class AppUser implements java.io.Serializable {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "gender")
	private String gender;

	// Mapped By attribute must match with the instance variable name in other side
	// of mapping
	// if mappedBy = "appUser" defined in this class then other side it should be
	// define like -> "AppUser appUser"

	@OneToOne(mappedBy = "appUser")
	private AppUserLogin appUserLogin;

	public AppUser() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public AppUserLogin getAppUserLogin() {
		return appUserLogin;
	}

	public void setAppUserLogin(AppUserLogin appUserLogin) {
		this.appUserLogin = appUserLogin;
	}

}
