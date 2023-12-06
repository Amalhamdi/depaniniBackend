package com.example.depaniniback.restcontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.depaniniback.entities.FicheDE;
import com.example.depaniniback.services.FicheDeService;


@RestController
@RequestMapping("/api/DE/")
@CrossOrigin("*")
public class FicheDeRestcontroller {
	
	@Autowired
	FicheDeService fichDeService;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<FicheDE> getAllFicheDe() {
	return fichDeService.getAllFicheDe();
	}
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public FicheDE getFicheDeById(@PathVariable("id") Long id) {
	return fichDeService.getFicheDe(id);
	 }
	
	@RequestMapping(value="/addficheDe",method = RequestMethod.POST)
	public FicheDE createFicheDe(@RequestBody FicheDE ficheDE) {
	return fichDeService.saveFicheDe(ficheDE);
	}
	
	@RequestMapping(value="/updateficheDe",method = RequestMethod.PUT)
	public FicheDE updateFicheDe(@RequestBody FicheDE ficheDE) {
	return fichDeService.updateFicheDe(ficheDE);
	}
	
	@RequestMapping(value="/delficheDE/{id}",method = RequestMethod.DELETE)
	public void deleteFicheDe(@PathVariable("id") Long id)
	{
		fichDeService.deleteFicheDeById(id);
	}
	

}
