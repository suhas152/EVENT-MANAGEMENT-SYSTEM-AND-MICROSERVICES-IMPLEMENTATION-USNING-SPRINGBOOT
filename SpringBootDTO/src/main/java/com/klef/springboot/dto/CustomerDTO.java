package com.klef.springboot.dto;

public class CustomerDTO {
public int id;
public String  name;
public double age;
public String contact;
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
}
