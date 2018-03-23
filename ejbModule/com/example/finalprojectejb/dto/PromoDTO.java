package com.example.finalprojectejb.dto;

import java.io.Serializable;
import java.util.Date;


public class PromoDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private Date startDate;
	private Date endDate;
	private int discount;
	
	private StockSupplierDTO stockSupplier;
	

	public PromoDTO() {
		super();
	}


	public int getId() {
		return id;
	}


	public PromoDTO setId(int id) {
		this.id = id;
		return this;
	}


	public Date getStartDate() {
		return startDate;
	}


	public PromoDTO setStartDate(Date startDate) {
		this.startDate = startDate;
		return this;
	}


	public Date getEndDate() {
		return endDate;
	}


	public PromoDTO setEndDate(Date endDate) {
		this.endDate = endDate;
		return this;
	}


	public int getDiscount() {
		return discount;
	}


	public PromoDTO setDiscount(int discount) {
		this.discount = discount;
		return this;
	}


	public StockSupplierDTO getStockSupplier() {
		return stockSupplier;
	}


	public PromoDTO setStockSupplier(StockSupplierDTO stockSupplier) {
		this.stockSupplier = stockSupplier;
		return this;
	}
	
	
   
}
