package com.test.service;

import com.test.AbstractModels.AbstractSlot;
import com.test.AbstractModels.Products;

public interface ISelectionProcessor {

	public Products selectSlot(AbstractSlot slot);
}
