package com.klef.fsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsd.springboot.model.Customer;
import com.klef.fsd.springboot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired //communication between two managed objects
	private CustomerRepository repository;

	@Override
	public String addcustomer(Customer c) {
		repository.save(c);
		
		return "Customer added Successfully";
	}

	@Override
	public String updatecustomer(Customer c) {
		Optional<Customer> object=  repository.findById(c.getId());
		String msg=null;
		
		
		if(object.isPresent()) {
			Customer c1=object.get();
			c1.setAge(c.getAge());
			c1.setContact(c.getContact());
			c1.setGender(c.getGender());
			c1.setName(c.getName());
			
			repository.save(c1);
			msg="Customer updated successfully";
		
		}else {
			msg="Customer ID not found";
		}
		return msg;
	}

	@Override
	public String deletecustomer(int cid) {
		
		Optional<Customer> object=  repository.findById(cid);
		String msg=null;
		
		
		if(object.isPresent()) {
			Customer c=object.get();
			repository.delete(c);
			msg="Customer deleted successsfully";
		}else {
			msg="Customer ID not found";
		}
		return msg;
	}

	@Override
	public List<Customer> viewallcustomers() {
		
		return repository.findAll();
		
		
	}

	@Override
	public Customer viewcustomerbyid(int cid) {
		
		return repository.findById(cid).orElse(null);
		
	}
//Optionalclass :-check wheather  the object is present or not
}
