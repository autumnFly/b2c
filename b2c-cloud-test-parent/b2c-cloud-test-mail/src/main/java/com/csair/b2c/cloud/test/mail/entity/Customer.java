package com.csair.b2c.cloud.test.mail.entity;

import java.io.Serializable;
import java.util.Calendar;

public class Customer implements Serializable {
	private static final long serialVersionUID = -6266410713250213369L;
	private Integer id;
	private String name;
	private Calendar customerSince;

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

	public Calendar getCustomerSince() {
		return customerSince;
	}

	public void setCustomerSince(Calendar customerSince) {
		this.customerSince = customerSince;
	}

}
