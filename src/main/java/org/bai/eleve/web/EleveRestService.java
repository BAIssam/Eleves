package org.bai.eleve.web;

import java.util.List;
import java.util.Optional;

import org.bai.eleve.dao.EleveRepository;
import org.bai.eleve.entities.Eleve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EleveRestService {
	
	@Autowired
	public EleveRepository eleveRepository;
	
	@RequestMapping(value="/eleves", method=RequestMethod.GET)
	public List<Eleve> getEleve(){
		return eleveRepository.findAll();
	}
	
	@RequestMapping(value="/eleve/{id}", method=RequestMethod.GET)
	public Optional<Eleve> getEleve(@PathVariable Long id) {
		return eleveRepository.findById(id);
	}
	
	@RequestMapping(value="/chercherEleve", method=RequestMethod.GET)
	public Page<Eleve> chercherEleve(
			@RequestParam(name="nom", defaultValue="") String nom,
			@RequestParam(name="prenom", defaultValue="") String prenom,
			@RequestParam(name="annee", defaultValue="") String annee,
			@RequestParam(name="page", defaultValue="0") int page, 
			@RequestParam(name="size", defaultValue="5") int size
			) {
		return eleveRepository.chercher("%"+nom+"%",
										"%"+prenom+"%",
										"%"+annee+"%",
										new PageRequest(page, size));
	}
	
	@RequestMapping(value="/eleve", method=RequestMethod.POST)
	public Eleve saveEleve(@RequestBody Eleve e) {		
		return eleveRepository.save(e);
	}
	
	@RequestMapping(value="/eleve/{id}", method=RequestMethod.PUT)
	public Eleve updateEleve(@PathVariable Long id, @RequestBody Eleve e) {		
		e.setId(id);
		return eleveRepository.save(e);
	}
	
	@RequestMapping(value="/eleve/{id}", method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id) {
		eleveRepository.deleteById(id);
		return true;
	}


}
