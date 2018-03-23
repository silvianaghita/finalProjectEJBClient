package com.example.finalprojectejb.dto;

import java.io.Serializable;


public class OrderItemDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private int quantity;
	private int price;
	
	private StockClientB2BDTO stockClientB2B;
	private ClientOrderDTO order;
	

	public OrderItemDTO() {
		super();
	}


	public int getId() {
		return id;
	}


	public OrderItemDTO setId(int id) {
		this.id = id;
		return this;
	}


	public int getQuantity() {
		return quantity;
	}


	public OrderItemDTO setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}


	public int getPrice() {
		return price;
	}


	public OrderItemDTO setPrice(int price) {
		this.price = price;
		return this;
	}


	public StockClientB2BDTO getStockClientB2B() {
		return stockClientB2B;
	}


	public OrderItemDTO setStockClientB2B(StockClientB2BDTO stockClientB2B) {
		this.stockClientB2B = stockClientB2B;
		return this;
	}


	public ClientOrderDTO getOrder() {
		return order;
	}


	public OrderItemDTO setOrder(ClientOrderDTO order) {
		this.order = order;
		return this;
	}
	
   
}