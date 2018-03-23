package com.example.finalprojectejb.dto;

import java.io.Serializable;
import java.util.List;

import com.example.finalprojectejb.util.WineType;

public class WineDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private int year;
	private String name;
	private String description;
	private String variety;
	private WineType type; 
	

	private List<StockSupplierDTO> supplierStocks;

	public WineDTO() {
		super();
	}
	

	public List<StockSupplierDTO> getSupplierStocks() {
		return supplierStocks;
	}


	public WineDTO setSupplierStocks(List<StockSupplierDTO> supplierStocks) {
		this.supplierStocks = supplierStocks;
		return this;
	}


	public int getId() {
		return id;
	}

	public WineDTO setId(int id) {
		this.id = id;
		return this;
	}

	public int getYear() {
		return year;
	}

	public WineDTO setYear(int year) {
		this.year = year;
		return this;
	}

	public String getName() {
		return name;
	}

	public WineDTO setName(String name) {
		this.name = name;
		return this;
		
	}

	public String getDescription() {
		return description;
	}

	public WineDTO setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getVariety() {
		return variety;
	}

	public WineDTO setVariety(String variety) {
		this.variety = variety;
		return this;
	}

	public WineType getType() {
		return type;
	}

	public WineDTO setType(WineType type) {
		this.type = type;
		return this;
	}
	
	
   
}