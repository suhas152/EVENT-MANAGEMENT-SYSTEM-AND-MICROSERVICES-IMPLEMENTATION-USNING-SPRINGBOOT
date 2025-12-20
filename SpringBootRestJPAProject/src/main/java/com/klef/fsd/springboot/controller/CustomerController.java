package com.klef.fsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.fsd.springboot.model.Customer;
import com.klef.fsd.springboot.service.CustomerService;

@RestController
@RequestMapping("api/customer")
public class CustomerController 
{
	@Autowired
    private CustomerService service;
	
	@GetMapping("/")
	public String home()
	{
		return "Rest API with JPA Demo";
	}
	
	@GetMapping("/viewall")
	public List<Customer> viewallcustomers()
	{
		return service.viewallcustomers();
	}
	
	@PostMapping("/add")
	public String addcustomer(@RequestBody Customer c)
	{
		return service.addcustomer(c);
	}
	
	@PutMapping("/update")
	public String updatecustomer(@RequestBody Customer c)
	{
		return service.updatecustomer(c);
	}
	
	@GetMapping("/display")
	public ResponseEntity<?> displaycustomerbyid(@RequestParam int cid)
	{
		
		Customer c = service.viewcustomerbyid(cid);
		
		if(c!=null)
		{
			return ResponseEntity.ok(c);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer ID Not Found");
		}
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deletecustomerbyid(@PathVariable int cid)
	{
		return service.deletecustomer(cid);
	}
	
}
