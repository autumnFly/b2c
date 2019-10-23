package com.csair.b2c.cloud.test.mail.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderLine implements Serializable {
	private static final long serialVersionUID = -8355246391632928399L;
	private Integer amount;
	private BigDecimal purchasePrice;
	private Product product;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
