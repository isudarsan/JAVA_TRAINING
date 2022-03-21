package com.java.training.jpa.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Mobile {

	private String primaryMobile;

	private String alternateMobile;

	public Mobile() {

	}

	public String getPrimaryMobile() {
		return primaryMobile;
	}

	public void setPrimaryMobile(String primaryMobile) {
		this.primaryMobile = primaryMobile;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

}
