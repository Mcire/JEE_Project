package com.groupeisi.securiteweb.dto;

import java.util.ArrayList;
import java.util.List;

import com.groupeisi.securiteweb.entities.Comptes;

public class DroitsDto {
	

	private int id;
	private String name;
	
	List<String> comptes = new ArrayList<String>();

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getComptes() {
		return comptes;
	}

	public void setComptes(List<String> comptes) {
		this.comptes = comptes;
	}
	
}
