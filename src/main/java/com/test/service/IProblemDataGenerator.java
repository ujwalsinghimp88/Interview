package com.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.AbstractModels.AbstractSlot;
import com.test.models.Slot;

public interface IProblemDataGenerator {

	
	public static List<AbstractSlot> generateSlots(){
		List<Integer> rowList= Stream.iterate(1,i->i+1).limit(5).map(n->n).collect(Collectors.toList());
		List<Integer> colList= Stream.iterate(1,i->i+1).limit(5).map(n->n).collect(Collectors.toList());
		
		List<AbstractSlot> slotList= new ArrayList<AbstractSlot>();
		rowList.forEach(r->colList.forEach(c->slotList.add(new Slot(r,c,null))));
		
		return slotList;
		
	}
}
