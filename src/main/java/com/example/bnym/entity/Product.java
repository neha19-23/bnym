package com.example.bnym.entity;

import lombok.Getter;

public class Product {

	String category;
	String item;
	Integer price;
	
	public Product(String category,String item,Integer price)
	{
		this.category=category;
		this.item=item;
		this.price=price;
	}

	public String getCategory() {
		return category;
	}

	public String getItem() {
		return item;
	}

	public Integer getPrice() {
		return price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
