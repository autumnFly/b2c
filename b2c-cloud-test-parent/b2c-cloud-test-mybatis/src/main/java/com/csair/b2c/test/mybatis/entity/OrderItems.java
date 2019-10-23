package com.csair.b2c.test.mybatis.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderItems implements Serializable{

	@Id
	@Column(name = "order_num")
	private Integer orderNum;
	@Id
	@Column(name = "order_item")
	private String orderItem;
	@Column(name = "item_price")
	private String itemPrice;
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="prod_id")
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
