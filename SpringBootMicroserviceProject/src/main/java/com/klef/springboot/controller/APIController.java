package com.klef.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.springboot.dto.CustomerDTO;
import com.klef.springboot.dto.ProductDTO;
import com.klef.springboot.service.APIService;

@RestController
public class APIController 
{
	@Autowired
	private APIService apiService;
	
     @GetMapping("/")
     public String home()
     {
    	 return "Spring Boot Rest Template Demo";
     }
     
     @GetMapping("/customer/viewall")
     public List<CustomerDTO> viewallcustomers()
     {
    	return apiService.viewallcustomers(); 
     }
     
     @GetMapping("/product/viewall")
     public List<ProductDTO> viewallproducts()
     {
    	return apiService.viewallproducts();
     }
     
     @GetMapping("/customer/display")
     public CustomerDTO viewcustomerbyid(@RequestParam  int cid)
     {
    	 return apiService.viewcustomerbyid(cid);
     }
     
     @GetMapping("/product/display/{pid}")
     public ProductDTO viewproductbyid(@PathVariable int pid)
     {
    	 return apiService.viewproductbyid(pid);
     }
     
}
