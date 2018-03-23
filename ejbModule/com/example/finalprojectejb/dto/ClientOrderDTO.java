package com.example.finalprojectejb.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ClientOrderDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private int orderNumber;
	private Date date;
	
	private ClientB2CDTO clientB2C;
	private List<OrderItemDTO> orderItems;

	public ClientOrderDTO() {
		super();
	}
	

	public List<OrderItemDTO> getOrderItems() {
		return orderItems;
	}


	public ClientOrderDTO setOrderItems(List<OrderItemDTO> orderItems) {
		this.orderItems = orderItems;
		return this;
	}


	public ClientB2CDTO getClientB2C() {
		return clientB2C;
	}


	public ClientOrderDTO setClientB2C(ClientB2CDTO clientB2C) {
		this.clientB2C = clientB2C;
		return this;
	}


	public int getId() {
		return id;
	}

	public ClientOrderDTO setId(int id) {
		this.id = id;
		return this;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public ClientOrderDTO setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
		return this;
	}

	public Date getDate() {
		return date;
	}

	public ClientOrderDTO setDate(Date date) {
		this.date = date;
		return this;
	}
	
	
   
}
