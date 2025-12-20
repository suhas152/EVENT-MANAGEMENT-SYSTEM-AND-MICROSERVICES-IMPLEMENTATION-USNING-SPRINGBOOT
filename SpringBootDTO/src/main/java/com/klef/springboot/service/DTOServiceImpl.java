package com.klef.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klef.springboot.dto.CustomerDTO;
import com.klef.springboot.dto.ProductDTO;

@Service
public class DTOServiceImpl implements DTOService
{
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<CustomerDTO> viewallcustomers() 
	{
       CustomerDTO[] customers=  restTemplate.getForObject("http://localhost:2027/api/customer/viewall",CustomerDTO[].class);
       return Arrays.asList(customers);
	}

	@Override
	public CustomerDTO viewcustomerbyid(int cid) 
	{
	     return restTemplate.getForObject("http://localhost:2027/api/customer/display?cid="+cid,CustomerDTO.class);
	}

	@Override
	public List<ProductDTO> viewallproducts() 
	{
	   ProductDTO[] products = restTemplate.getForObject("https://fakestoreapi.com/products/",ProductDTO[].class);
	   return Arrays.asList(products);
	}

	@Override
	public ProductDTO viewproductbyid(int pid) 
	{
		return restTemplate.getForObject("https://fakestoreapi.com/products/"+pid,ProductDTO.class);
	}

}
