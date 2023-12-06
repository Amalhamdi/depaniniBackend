package com.example.depaniniback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.depaniniback.entities.FicheDS;
import com.example.depaniniback.repository.FicheDsRepository;

@Service
public class FicheDsServiceImpl implements ficheDsService {
	
	@Autowired
	FicheDsRepository ficheDsRepository;
	

	@Override
	public FicheDS saveFicheDs(FicheDS ds) {
		return ficheDsRepository.save(ds);
	}


	@Override
	public FicheDS updateFicheDs(FicheDS ds) {
		// TODO Auto-generated method stub
		return  ficheDsRepository.save(ds);
	}

	@Override
	public void deleteFicheDs(FicheDS ds) {
		ficheDsRepository.delete(ds);
		
	}

	@Override
	public void deleteFicheDsById(Long id) {
		ficheDsRepository.deleteById(id);
		
	}

	@Override
	public List<FicheDS> getAllFicheDs() {
		
		return ficheDsRepository.findAll();
	}


	@Override
	public FicheDS getFicheDs(Long id) {
		return ficheDsRepository.findById(id).get();
	}

}
