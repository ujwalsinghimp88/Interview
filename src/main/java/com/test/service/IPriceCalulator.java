package com.test.service;

import com.test.AbstractModels.AbstractSlot;
import com.test.AbstractModels.Products;

public interface IPriceCalulator {

	public int calculatePrice(Products product);
}
