package com.groupeisi.securiteweb.main;

import com.groupeisi.securiteweb.dao.ComptesImpl;
import com.groupeisi.securiteweb.dao.IComptes;
import com.groupeisi.securiteweb.entities.Comptes;

public class Test {

	public static void main(String[] args) {
		
		Comptes comptes = new Comptes();
		comptes.setUsername("che");
		comptes.setPassword("rosario");
		IComptes iComptesdao = new ComptesImpl();
		int result = iComptesdao.add(comptes);
	
		System.out.println(result);
	}

}
