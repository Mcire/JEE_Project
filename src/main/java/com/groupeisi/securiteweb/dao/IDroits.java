package com.groupeisi.securiteweb.dao;

import com.groupeisi.securiteweb.entities.Droits;

public interface IDroits extends Repository<Droits>  {
	
	public Droits getByName(String name);

}
