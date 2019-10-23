package com.csair.b2c.cloud.test.mongodb.model;

import java.io.Serializable;

public class OrderItems implements Serializable{

	private static final long serialVersionUID = 8988361505825243260L;
	private Integer orderNum;
	private String orderItem;
	private String itemPrice;
	private Products products;

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

}
