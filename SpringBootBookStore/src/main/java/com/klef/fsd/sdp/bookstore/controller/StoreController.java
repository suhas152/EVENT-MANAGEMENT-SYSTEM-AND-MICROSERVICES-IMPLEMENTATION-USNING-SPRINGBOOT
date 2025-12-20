package com.klef.fsd.sdp.bookstore.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.fsd.sdp.bookstore.model.BookStore;
import com.klef.fsd.sdp.bookstore.service.StoreService;

@RestController
public class StoreController {
	@Autowired
	private StoreService service;
	

	@GetMapping("/")
	public List<BookStore> viewbookslist() {
		return service.viewbookslist();
	}

	@GetMapping("/display/{bid}")
	public BookStore viewbookbyid(@PathVariable int bid) {
	return service.viewbookbyid(bid);
	}

	@PutMapping("/update")
	public String updatebook(@RequestBody BookStore b) {
		return service.updatebook(b);
		
	}

	@DeleteMapping("/delete/{bid}")
	public String deletebook(@PathVariable  int bid) {
		return service.deletebook(bid);
	}

	@PostMapping("/add")
	public String addbook( @RequestBody BookStore b) {
		return service.addbook(b);
	}

   
}
