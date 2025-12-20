package com.klef.fsd.springboot.service;

import java.util.List;

import com.klef.fsd.springboot.model.Customer;

public interface CustomerService 
{
	public String addcustomer(Customer c);
	public String updatecustomer(Customer c);
	public String deletecustomer(int cid);
	public List<Customer> viewallcustomers();
		public Customer viewcustomerbyid(int id);
	
}
