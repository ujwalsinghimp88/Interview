package com.test.serviceImpl;

import com.test.AbstractModels.Products;
import com.test.service.IPriceCalulator;

public class PriceCalculator implements IPriceCalulator {

	
	public int calculatePrice(Products product) {
		return product.getPrice();
	}

}
