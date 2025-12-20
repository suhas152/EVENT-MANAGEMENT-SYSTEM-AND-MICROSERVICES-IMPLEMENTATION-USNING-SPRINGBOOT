package com.klef.fsd.sdp.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsd.sdp.bookstore.model.BookStore;

@Repository
public interface StoreRepository extends JpaRepository<BookStore, Integer> {
	

}
