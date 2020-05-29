package com.test.models;

import com.test.AbstractModels.AbstractSlot;
import com.test.AbstractModels.Products;

public class Slot extends AbstractSlot {

	public Slot(int rowNo, int columnNo, Products p) {
		super(rowNo, columnNo, p);
		this.isAvailable=true;
	}

}
