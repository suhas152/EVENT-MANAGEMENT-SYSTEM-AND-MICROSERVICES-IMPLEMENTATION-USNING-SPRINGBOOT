package com.klef.fsd.sdp.bookstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookStore {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column()
	  
	    private int id;

	    @Column(nullable = false, length = 100)
	    private String bookname;

	    @Column(nullable = false, length = 100)
	    private String authorname;

	    @Column(nullable = false)
	    private int price;
	    
	    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
