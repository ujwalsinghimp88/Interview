package com.test.AbstractModels;

public abstract class AbstractSlot {

	public int rowNo;
	public int columnNo;
	public boolean isAvailable;
	public Products product;
	
	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public AbstractSlot(int rowNo, int columnNo,Products p) {
		this.rowNo=rowNo;
		this.columnNo=columnNo;
		this.product=p;
	}

	public int getRowNo() {
		return rowNo;
	}

	public void setRowNo(int rowNo) {
		this.rowNo = rowNo;
	}

	public int getColumnNo() {
		return columnNo;
	}

	public void setColumnNo(int columnNo) {
		this.columnNo = columnNo;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	

	
}
