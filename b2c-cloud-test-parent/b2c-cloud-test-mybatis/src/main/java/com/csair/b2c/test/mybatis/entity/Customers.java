package com.csair.b2c.test.mybatis.entity;


import javax.persistence.*;
import java.util.List;
@Entity
public class Customers {
	@Id
	@Column(name = "cust_id")
	private String custId;
	@Column(name = "cust_name")
	private String custName;
	@Column(name = "cust_state")
	private String custState;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_id")
	private List<Orders> orders;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustState() {
		return custState;
	}

	public void setCustState(String custState) {
		this.custState = custState;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

}
