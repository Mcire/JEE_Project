package com.groupeisi.securiteweb.dao;

import java.util.ArrayList;
import java.util.List;

import com.groupeisi.securiteweb.dto.ComptesDto;
import com.groupeisi.securiteweb.dto.DroitsDto;
import com.groupeisi.securiteweb.entities.Comptes;
import com.groupeisi.securiteweb.entities.Droits;


public class ComptesImpl extends RepositoryImpl<Comptes> implements IComptes{

	//@Override
	public Comptes getByUsername(String username) {
		
		return (Comptes) session.createQuery("FROM Comptes compte WHERE compte.username = :compte_username")
				.setParameter("compte_username", username).uniqueResult();
	}
	
	
	public Comptes CompteDtoToComptesEntity (ComptesDto comptesDto) {
		Comptes comptes = new Comptes();
		comptes.setId(comptesDto.getId());
		comptes.setUsername(comptesDto.getUsername());
		if (comptesDto.getDroits() != null) {
			List<Droits> droits= new ArrayList<Droits>();
			comptesDto.getDroits().forEach(name->{
				Droits droit = new DroitsImpl().getByName(name);
				droits.add(droit);
			});
			comptes.setDroits(droits);
		}
		
		return comptes;
	}
	
	public ComptesDto ComptesdtoEntityToComptesDto (Comptes comptes) {
		ComptesDto comptesDto = new ComptesDto();
		comptesDto.setId(comptes.getId());
		comptesDto.setUsername(comptes.getUsername());
		if(comptes.getDroits() != null) {
			List<String> droits = new ArrayList<String>();
			comptes.getDroits().forEach(droit->{
				droits.add(droit.getName());
			});
			comptesDto.setDroits(droits);
		}
		return comptesDto;
	}
}
