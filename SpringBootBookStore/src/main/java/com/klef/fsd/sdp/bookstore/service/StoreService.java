package com.klef.fsd.sdp.bookstore.service;

import java.util.List;

import com.klef.fsd.sdp.bookstore.model.BookStore;

public interface StoreService {
	public List<BookStore> viewbookslist();
	public BookStore viewbookbyid(int bid);
	public String updatebook(BookStore b);
	public String deletebook(int bid);
	public String addbook(BookStore b);
	

}
