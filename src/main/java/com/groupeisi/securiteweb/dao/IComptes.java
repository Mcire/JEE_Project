package com.groupeisi.securiteweb.dao;

import com.groupeisi.securiteweb.entities.Comptes;

public interface IComptes extends Repository<Comptes> {
	public Comptes getByUsername(String username);
}
