package com.example.finalprojectejb.dto;

import java.io.Serializable;
import java.util.List;

public class ClientB2BDTO extends PlatformUserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean visibility;
	private String businessName;
	private String cui;
	private boolean subscribed;
	
	
	private List<StockClientB2BDTO> stocks;

	public ClientB2BDTO() {
		super();
	}
	
	
	public ClientB2BDTO(boolean visibility, String businessName, String cui, boolean subscribed,
			List<StockClientB2BDTO> stocks) {
		super();
		this.visibility = visibility;
		this.businessName = businessName;
		this.cui = cui;
		this.subscribed = subscribed;
		this.stocks = stocks;
	}

	public List<StockClientB2BDTO> getStocks() {
		return stocks;
	}


	public ClientB2BDTO setStocks(List<StockClientB2BDTO> stocks) {
		this.stocks = stocks;
		return this;
	}


	public boolean isVisibility() {
		return visibility;
	}

	public ClientB2BDTO setVisibility(boolean visibility) {
		this.visibility = visibility;
		return this;
	}

	public String getBusinessName() {
		return businessName;
	}

	public ClientB2BDTO setBusinessName(String businessName) {
		this.businessName = businessName;
		return this;
	}

	public String getCui() {
		return cui;
	}

	public ClientB2BDTO setCui(String cui) {
		this.cui = cui;
		return this;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public ClientB2BDTO setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
		return this;
	}
	
	
   
}