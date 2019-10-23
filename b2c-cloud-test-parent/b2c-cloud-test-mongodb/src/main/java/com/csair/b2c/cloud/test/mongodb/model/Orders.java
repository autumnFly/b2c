package com.csair.b2c.cloud.test.mongodb.model;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Orders implements Serializable {
	private static final long serialVersionUID = -1284489681856971099L;
	private Integer orderNum;
	private Date orderDate;
	private List<OrderItems> orderItems;

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

}
