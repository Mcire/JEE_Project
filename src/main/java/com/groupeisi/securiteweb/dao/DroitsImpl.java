package com.groupeisi.securiteweb.dao;

import java.util.ArrayList;
import java.util.List;

import com.groupeisi.securiteweb.dto.DroitsDto;
import com.groupeisi.securiteweb.entities.Comptes;
import com.groupeisi.securiteweb.entities.Droits;

public class DroitsImpl extends RepositoryImpl<Droits> implements IDroits{
	
	//@Override
	public Droits getByName(String name) {
		return (Droits) session.createQuery("FROM Droits droit WHERE droit.name = :droit_name")
				.setParameter("role_nom", name).uniqueResult();
	}
	
	
	public Droits droitsDtoToComptesEntity(DroitsDto droitsDto) {
		
		Droits droits = new Droits();
		droits.setId(droitsDto.getId());
		droits.setName(droitsDto.getName());
		if(droitsDto.getComptes() != null) {
			List<Comptes> comptes = new ArrayList<Comptes>();
			droitsDto.getComptes().forEach(username->{
				Comptes compte = new ComptesImpl().getByUsername(username);
				comptes.add(compte);
			});
		droits.setComptes(comptes);
		}
		return droits;
	}
	
	
	public DroitsDto droitsEntityToDroitsDto (Droits droits) {
		DroitsDto droitsDto = new DroitsDto();
		droitsDto.setId(droits.getId());
		droitsDto.setName(droits.getName());
		if(droits.getComptes() !=null) {
			List<String> usernameComptes = new ArrayList<String>();
			droits.getComptes().forEach(compte->{
				usernameComptes.add(compte.getUsername());
			});
			droitsDto.setComptes(usernameComptes);
		}
		return droitsDto;
	}
}
