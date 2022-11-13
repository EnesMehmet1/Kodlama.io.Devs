package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.languageService;
import Kodlama.io.Devs.entities.concretes.Language;

@RequestMapping("/api/languages")
@RestController
public class languageController {
	private languageService languageServices;

	@Autowired
	public languageController(languageService languageServices) {
		super();
		this.languageServices = languageServices;
	}
	
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageServices.getAll();
	}
	@GetMapping("/update")
	public List<Language> setUpdate() throws Exception {
	  languageServices.setUpdate(2,"Bilemem kardeş");
	  return languageServices.getAll();
	}
	@GetMapping("/delete")
	public List<Language> delete(){
		languageServices.delete(2);
	    return languageServices.getAll();
	}
	
	@GetMapping("/id")
	public Language getId(){
		//languageServices.delete(language);
	    return languageServices.getId(2);
	}
	
	@GetMapping("/add")
	public List<Language> add() throws Exception{
		//languageServices.delete(language);
	    return languageServices.add(new Language(6,"phyton"));
	}
}
