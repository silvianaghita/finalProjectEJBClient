package com.example.finalprojectejb.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ClientB2CDTO extends PlatformUserDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String lastName;
	private String firstName;
	private Date registerDate;
	private String cnp;
	
	private List<ClientOrderDTO> orders;
	

	public ClientB2CDTO() {
		super();
	}
   

	public List<ClientOrderDTO> getOrders() {
		return orders;
	}


	public ClientB2CDTO setOrders(List<ClientOrderDTO> orders) {
		this.orders = orders;
		return this;
	}

	public String getLastName() {
		return lastName;
	}


	public ClientB2CDTO setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}


	public String getFirstName() {
		return firstName;
	}


	public ClientB2CDTO setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}


	public Date getRegisterDate() {
		return registerDate;
	}


	public ClientB2CDTO setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
		return this;
	}


	public String getCnp() {
		return cnp;
	}


	public ClientB2CDTO setCnp(String cnp) {
		this.cnp = cnp;
		return this;
	}

}