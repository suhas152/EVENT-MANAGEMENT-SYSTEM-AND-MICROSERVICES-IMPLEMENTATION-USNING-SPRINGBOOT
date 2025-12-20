package com.klef.fsd.sdp.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsd.sdp.bookstore.model.BookStore;
import com.klef.fsd.sdp.bookstore.repository.StoreRepository;

@Service
public class StoreserviceImpl implements StoreService {

	@Autowired
	private StoreRepository repository;
	
	
	@Override
	public List<BookStore> viewbookslist() {
		return repository.findAll();
	}

	@Override
	public BookStore viewbookbyid(int bid) {
		return repository.findById(bid).get();
	}

	@Override
	public String updatebook(BookStore b) {
		Optional<BookStore> object=repository.findById(b.getId());
		String msg=null;
		if(object.isPresent()) {
			BookStore bs=object.get();
			bs.setAuthorname(b.getAuthorname());
			bs.setBookname(b.getBookname());
			bs.setPrice(b.getPrice());
			repository.save(bs);
			msg="book updated successfully";
		
		}else {
			msg=" ID not found";
		}
		return msg;
	}

	@Override
	public String deletebook(int bid) {
		Optional<BookStore> object=repository.findById(bid);
		if(object.isPresent()) {
			BookStore bs=object.get();
			repository.delete(bs);
			return "deleted succesfully";
		}else {
			return "Book ID not found";
		}
	}

	@Override
	public String addbook(BookStore b) {
		repository.save(b);
		return "Book added succesfully";
	}

}

