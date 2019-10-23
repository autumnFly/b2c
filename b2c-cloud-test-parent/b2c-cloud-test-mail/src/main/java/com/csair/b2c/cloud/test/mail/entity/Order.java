package com.csair.b2c.cloud.test.mail.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

public class Order implements Serializable {
	private static final long serialVersionUID = 202140821992685201L;
	private Integer id;
	private Calendar date;
	private Customer customer;
	private Set<OrderLine> orderLines;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Set<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(Set<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}



}
