package com.klef.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/")
	public String customerhome() {
		return "Customer Home";
	}
	
	@GetMapping("/customerlogin")
	public String customerlogin() {
		return "Customer Login";
	}
	
}
