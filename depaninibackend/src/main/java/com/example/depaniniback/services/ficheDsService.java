package com.example.depaniniback.services;

import java.util.List;

import com.example.depaniniback.entities.FicheDE;
import com.example.depaniniback.entities.FicheDS;

public interface ficheDsService {

	FicheDS saveFicheDs(FicheDS ds);
	FicheDS updateFicheDs(FicheDS ds);
	void deleteFicheDs(FicheDS ds);
	void deleteFicheDsById(Long id);
	FicheDS getFicheDs(Long id);
	List<FicheDS> getAllFicheDs();

}
