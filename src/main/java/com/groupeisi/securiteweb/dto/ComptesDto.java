package com.groupeisi.securiteweb.dto;

import java.util.ArrayList;
import java.util.List;

import com.groupeisi.securiteweb.entities.Droits;

public class ComptesDto {
	
	private int id;
	private String username;
	private String password;
	List<String> droits = new ArrayList<String>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getDroits() {
		return droits;
	}
	public void setDroits(List<String> droits) {
		this.droits = droits;
	}
}
