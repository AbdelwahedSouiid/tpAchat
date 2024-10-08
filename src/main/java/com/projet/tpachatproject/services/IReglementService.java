package com.projet.tpachatproject.services;


import com.projet.tpachatproject.entities.Reglement;

import java.util.Date;
import java.util.List;

public interface IReglementService {

	List<Reglement> retrieveAllReglements();
	Reglement addReglement(Reglement r);
	Reglement retrieveReglement(Long id);
	List<Reglement> retrieveReglementByFacture(Long idFacture);
	float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate); 

}
