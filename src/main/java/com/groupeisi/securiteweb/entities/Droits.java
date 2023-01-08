package com.groupeisi.securiteweb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Droits implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 200)
	private String name;
	
	@ManyToMany(fetch = FetchType.EAGER)
	List<Comptes> comptes = new ArrayList<Comptes>();

	public Droits() {
		super();
	}

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

	public List<Comptes> getComptes() {
		return comptes;
	}

	public void setComptes(List<Comptes> comptes) {
		this.comptes = comptes;
	}
	
}
