package com.groupeisi.securiteweb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Comptes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 200)
	private String username;
	@Column(nullable = false, length = 150)
	private String password;
	
	@ManyToMany(mappedBy = "comptes")
	List<Droits> droits = new ArrayList<Droits>();
	
	public Comptes() {
		super();
	}

	
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


	public List<Droits> getDroits() {
		return droits;
	}


	public void setDroits(List<Droits> droits) {
		this.droits = droits;
	}


	@Override
	public String toString() {
		return username;
	}
}
