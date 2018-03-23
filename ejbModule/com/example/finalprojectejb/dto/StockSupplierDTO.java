package com.example.finalprojectejb.dto;

import java.io.Serializable;
import java.util.List;


public class StockSupplierDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private int price;
	private int quantity;
	

	private SupplierDTO supplier;
	private List<PromoDTO> promotions;
	private StockClientB2BDTO stockClientB2B;
	private WineDTO wine;

	public StockSupplierDTO() {
		super();
	}
	
	
	public WineDTO getWine() {
		return wine;
	}
	

	public StockSupplierDTO setWine(WineDTO wine) {
		this.wine = wine;
		return this;
	}



	public StockClientB2BDTO getStockClientB2B() {
		return stockClientB2B;
	}


	public StockSupplierDTO setStockClientB2B(StockClientB2BDTO stockClientB2B) {
		this.stockClientB2B = stockClientB2B;
		return this;
	}

	public List<PromoDTO> getPromotions() {
		return promotions;
	}


	public StockSupplierDTO setPromotions(List<PromoDTO> promotions) {
		this.promotions = promotions;
		return this;
	}



	public SupplierDTO getSupplier() {
		return supplier;
	}


	public StockSupplierDTO setSupplier(SupplierDTO supplier) {
		this.supplier = supplier;
		return this;
	}


	public int getId() {
		return id;
	}

	public StockSupplierDTO setId(int id) {
		this.id = id;
		return this;
	}

	public int getPrice() {
		return price;
	}

	public StockSupplierDTO setPrice(int price) {
		this.price = price;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public StockSupplierDTO setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
	
	
   
}
