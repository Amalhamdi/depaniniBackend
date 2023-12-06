package com.example.depaniniback.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.depaniniback.entities.FicheDS;
import com.example.depaniniback.services.ficheDsService;




@RestController
@RequestMapping("/api/DS/")
@CrossOrigin("*")
public class FicheDsRestcontroller {
	
	@Autowired
	ficheDsService fichDsService;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<FicheDS> getAllFicheDs() {
	return fichDsService.getAllFicheDs();
	}
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public FicheDS getFicheDsById(@PathVariable("id") Long id) {
	return fichDsService.getFicheDs(id);
	 }
	
	@RequestMapping(value="/addficheDs",method = RequestMethod.POST)
	public FicheDS createFicheDs(@RequestBody FicheDS ficheDS) {
	return fichDsService.saveFicheDs(ficheDS);
	}
	
	@RequestMapping(value="/updateficheDs",method = RequestMethod.PUT)
	public FicheDS updateFicheDs(@RequestBody FicheDS ficheDS) {
	return fichDsService.updateFicheDs(ficheDS);
	}
	
	@RequestMapping(value="/delficheDs/{id}",method = RequestMethod.DELETE)
	public void deleteFicheDs(@PathVariable("id") Long id)
	{
		fichDsService.deleteFicheDsById(id);
	}
	

}
