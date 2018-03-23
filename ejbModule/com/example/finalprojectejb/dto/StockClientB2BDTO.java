package com.example.finalprojectejb.dto;

import java.io.Serializable;
import java.util.List;


public class StockClientB2BDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private int price;
	private int quantity;
	private boolean active;
	private int limitQuantity;
	
	private ClientB2BDTO clientB2B;
	private List<StockSupplierDTO> supplierStocks;
	private List<OrderItemDTO> orderItems;
	
	

	public StockClientB2BDTO() {
		super();
	}
	


	public boolean isActive() {
		return active;
	}


	public StockClientB2BDTO setActive(boolean active) {
		this.active = active;
		return this;
	}


	public int getLimitQuantity() {
		return limitQuantity;
	}



	public StockClientB2BDTO setLimitQuantity(int limitQuantity) {
		this.limitQuantity = limitQuantity;
		return this;
	}



	public List<OrderItemDTO> getOrderItems() {
		return orderItems;
	}


	public StockClientB2BDTO setOrderItems(List<OrderItemDTO> orderItems) {
		this.orderItems = orderItems;
		return this;
	}



	public List<StockSupplierDTO> getSupplierStocks() {
		return supplierStocks;
	}


	public StockClientB2BDTO setSupplierStocks(List<StockSupplierDTO> supplierStocks) {
		this.supplierStocks = supplierStocks;
		return this;
	}


	public ClientB2BDTO getClientB2B() {
		return clientB2B;
	}



	public StockClientB2BDTO setClientB2B(ClientB2BDTO clientB2B) {
		this.clientB2B = clientB2B;
		return this;
	}


	
	public int getId() {
		return id;
	}

	public StockClientB2BDTO setId(int id) {
		this.id = id;
		return this;
	}

	public int getPrice() {
		return price;
	}

	public StockClientB2BDTO setPrice(int price) {
		this.price = price;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public StockClientB2BDTO setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
	
	
   
}