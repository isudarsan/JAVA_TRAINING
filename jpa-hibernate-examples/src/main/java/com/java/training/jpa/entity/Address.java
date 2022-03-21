package com.java.training.jpa.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;

	private String zip;

	
	public Address() {
		
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
