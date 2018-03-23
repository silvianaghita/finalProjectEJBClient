package com.example.finalprojectejb.dto;

import java.io.Serializable;
import java.util.List;

public class SupplierDTO extends PlatformUserDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private boolean visibility;
	private boolean wineCellarName;
	private int age;
	
	private List<StockSupplierDTO> stocks;

	public SupplierDTO() {
		super();
	}

	
	public List<StockSupplierDTO> getStocks() {
		return stocks;
	}


	public SupplierDTO setStocks(List<StockSupplierDTO> stocks) {
		this.stocks = stocks;
		return this;
	}


	public boolean isVisibility() {
		return visibility;
	}

	public SupplierDTO setVisibility(boolean visibility) {
		this.visibility = visibility;
		return this;
	}

	public boolean isWineCellarName() {
		return wineCellarName;
	}

	public SupplierDTO setWineCellarName(boolean wineCellarName) {
		this.wineCellarName = wineCellarName;
		return this;
	}

	public int getAge() {
		return age;
	}

	public SupplierDTO setAge(int age) {
		this.age = age;
		return this;
	}
	
	
   
}