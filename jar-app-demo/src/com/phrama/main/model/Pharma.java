package com.phrama.main.model;

import java.util.Date;

public class Pharma {

	private String medicineName;
	private int price;
	private Date expiryDate;

	public Pharma(String medicineName, int price, Date expiryDate) {
		super();
		this.medicineName = medicineName;
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
