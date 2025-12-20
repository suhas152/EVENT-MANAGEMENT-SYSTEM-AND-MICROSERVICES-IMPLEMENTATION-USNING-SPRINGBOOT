package com.klef.fsd.sdp.battalshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shop {
	@Id
	@Column
	public int id;
	@Column(nullable=false,length=100)
	public String shopname;
	@Column(nullable=false,length=100)
	public String sellername;
	@Column(nullable=false,length=100)
	public String productname;
	@Column(nullable=false,length=100)
	public float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
