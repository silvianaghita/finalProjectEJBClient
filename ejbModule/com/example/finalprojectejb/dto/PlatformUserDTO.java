package com.example.finalprojectejb.dto;

import java.io.Serializable;


public class PlatformUserDTO implements Serializable {

	  
	private int id;
	private String username;
	private String address;
	private String email;
	private String password;
	private static final long serialVersionUID = 1L;

	public PlatformUserDTO() {
		super();
	}   
	
	
	public String getPassword() {
		return password;
	}

	public PlatformUserDTO setPassword(String password) {
		this.password = password;
		return this;
	}

	public int getId() {
		return this.id;
	}

	public PlatformUserDTO setId(int id) {
		this.id = id;
		return this;
	}   
	public String getUsername() {
		return this.username;
	}

	public PlatformUserDTO setUsername(String username) {
		this.username = username;
		return this;
	}   
	public String getAddress() {
		return this.address;
	}

	public PlatformUserDTO setAddress(String address) {
		this.address = address;
		return this;
	}   
	public String getEmail() {
		return this.email;
	}

	public PlatformUserDTO setEmail(String email) {
		this.email = email;
		return this;
	}
   
}
