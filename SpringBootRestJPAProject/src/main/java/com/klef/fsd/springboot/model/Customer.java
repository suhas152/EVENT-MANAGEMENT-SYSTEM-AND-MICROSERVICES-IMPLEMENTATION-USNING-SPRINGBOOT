package com.klef.fsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer {
 @Id//primary key=unique + not null
 @Column(name = "cid")
	private int id;
 
 @Column(name="cname",length = 50,nullable=false)
	private String name;
 
 @Column(name="cgender",length = 10,nullable=false)
	private String gender;
 
 @Column(name="cage",nullable=false)
	private double age;
 
 @Column(name="cmobile",length = 20,nullable=false,unique=true)
	private String contact;
 
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", contact=" + contact
				+ "]";
	}
}
