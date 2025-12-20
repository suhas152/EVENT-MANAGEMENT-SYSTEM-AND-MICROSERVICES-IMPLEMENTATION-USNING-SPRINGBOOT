package com.klef.springboot.service;

import java.util.List;

import com.klef.springboot.dto.CustomerDTO;
import com.klef.springboot.dto.ProductDTO;

public interface DTOService 
{
	// Internal API - Spring Boot Rest API JPA Project
	
   public List<CustomerDTO> viewallcustomers();
   public CustomerDTO viewcustomerbyid(int cid);
   
   // External API - Fake Store API
   
   public List<ProductDTO> viewallproducts();
   public ProductDTO viewproductbyid(int pid);
}
