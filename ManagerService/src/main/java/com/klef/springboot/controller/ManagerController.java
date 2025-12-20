package com.klef.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	@GetMapping("/")
	public String managerhome() {
		return "Manager Home";
	}
	
	@GetMapping("/managerlogin")
	public String managerlogin() {
		return "Manager Login";
	}
	

}
