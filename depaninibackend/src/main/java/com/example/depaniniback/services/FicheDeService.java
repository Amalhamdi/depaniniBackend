package com.example.depaniniback.services;

import java.util.List;

import com.example.depaniniback.entities.FicheDE;

public interface FicheDeService {
	
	FicheDE saveFicheDe(FicheDE l);
	FicheDE updateFicheDe(FicheDE l);
	void deleteFicheDe(FicheDE l);
	void deleteFicheDeById(Long id);
	FicheDE getFicheDe(Long id);
	List<FicheDE> getAllFicheDe();

}
