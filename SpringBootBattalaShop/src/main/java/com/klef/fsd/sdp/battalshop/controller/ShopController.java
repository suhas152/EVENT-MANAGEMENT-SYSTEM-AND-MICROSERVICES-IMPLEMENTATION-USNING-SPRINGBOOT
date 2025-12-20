package com.klef.fsd.sdp.battalshop.controller;

import org.springframework.web.bind.annotation.RestController;

import com.klef.fsd.sdp.battalshop.model.Shop;
import com.klef.fsd.sdp.battalshop.service.ShopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ShopController {
	@Autowired
	private ShopService service;
	
	
	@GetMapping("/display/{sid}")
	public Shop display(@PathVariable int sid) {
		return service.viewshop(sid);
	}
	
	@PutMapping("update")
	public String update(@RequestBody Shop s) {
		return service.updateShop(s);
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Shop s) {
		return service.addShop(s);
	}
	
	@DeleteMapping("/delete/{sid}")
	public String deleteshop(@PathVariable int sid) {
		return service.deleteShop(sid);
	}
	
	

}
