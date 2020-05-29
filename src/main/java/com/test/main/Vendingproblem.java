package com.test.main;

import java.util.List;

import com.test.AbstractModels.AbstractSlot;
import com.test.AbstractModels.Products;
import com.test.models.Choclate;
import com.test.models.Drink;
import com.test.models.Slot;
import com.test.models.Snacks;
import com.test.service.IPriceCalulator;
import com.test.service.IProblemDataGenerator;
import com.test.service.ISelectionProcessor;
import com.test.serviceImpl.PriceCalculator;
import com.test.serviceImpl.SelectionProcesor;

public class Vendingproblem {

	public static void main(String[] args) {
		
		ISelectionProcessor sp = new SelectionProcesor();
		IPriceCalulator pc = new PriceCalculator();
		List<AbstractSlot> slotList= IProblemDataGenerator.generateSlots();
		System.out.println("Slot List Size" + slotList.size());
		
		Products p1=new Drink("Coke",25);
		AbstractSlot s1= new Slot(2,2,p1); 
		Products selectedProd= sp.selectSlot(s1);
		System.out.println("Price is"+ pc.calculatePrice(selectedProd));
		
		Products p2=new Snacks("Chips",10);
		AbstractSlot s2= new Slot(2,3,p2); 
		Products selectedProd2= sp.selectSlot(s2);
		System.out.println("Price is"+ pc.calculatePrice(selectedProd2));
		
		Products p3=new Choclate("Nestle",15);
		AbstractSlot s3= new Slot(3,3,p3);
		Products selectedProd3= sp.selectSlot(s3);
		System.out.println("Price is"+ pc.calculatePrice(selectedProd3));
		
	}

}
