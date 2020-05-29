package com.test.serviceImpl;

import com.test.AbstractModels.AbstractSlot;
import com.test.AbstractModels.Products;
import com.test.service.ISelectionProcessor;

public class SelectionProcesor implements ISelectionProcessor {

	
	public Products selectSlot(AbstractSlot slot) {
		return slot.getProduct();
	}

}
