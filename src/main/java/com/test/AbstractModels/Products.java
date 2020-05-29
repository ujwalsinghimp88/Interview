package com.test.AbstractModels;

public abstract class Products {
	public String name;
	public int price;
	
	
	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public Products(String name, int price) {
		this.name=name;
		this.price=price;
	}

}
