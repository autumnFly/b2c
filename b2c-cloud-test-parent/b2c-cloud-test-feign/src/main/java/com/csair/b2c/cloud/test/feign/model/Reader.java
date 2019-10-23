package com.csair.b2c.cloud.test.feign.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reader {
	@Id
	private String username;
	private String fullname;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
