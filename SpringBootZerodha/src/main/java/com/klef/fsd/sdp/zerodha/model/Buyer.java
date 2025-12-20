package com.klef.fsd.sdp.zerodha.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Buyer {

	@Id
	@Column
	private int id;
	@Column(nullable=false,length=100)
	private String name;
	@Column(nullable=false,length=100)
	private String password;
	@Column(nullable=false,length=100)
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
