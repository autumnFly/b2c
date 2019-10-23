package com.csair.b2c.test.mybatis.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
	@Id
	@Column(name = "order_num",unique = true)
	private Integer orderNum;
	@Column(name = "order_date")
	private Date orderDate;
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="order_num")
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
