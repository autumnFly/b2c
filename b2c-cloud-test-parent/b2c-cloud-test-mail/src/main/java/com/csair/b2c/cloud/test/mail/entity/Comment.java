package com.csair.b2c.cloud.test.mail.entity;

import java.io.Serializable;

public class Comment implements Serializable {
	private static final long serialVersionUID = -5548541727184311986L;
	private Integer id;
	private String text;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
