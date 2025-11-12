package com.iset.gestionEtud.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iset.gestionEtud.Entities.Etudiant;
import com.iset.gestionEtud.Services.EtudiantService;

@RestController 
@RequestMapping("/api")
public class EtudiantController {

	
	@Autowired
	private EtudiantService service;
	
	@PostMapping("/addEtudiant")
	public Etudiant addEtudiant(@RequestBody Etudiant e)
	{
		return service.addEtudiant(e);
	}
	@PutMapping("/update")
	public void UpdateEtud(@RequestBody Etudiant e)
	{
		 service.updateEtudiant(e);
	}
	
	
	@GetMapping("/etudiants")
	public List<Etudiant> findAll()
	{
	return service.findAllEtudiant();	
	}
	
	
	
	@GetMapping("/etudiant/{cin}")
	public Etudiant getEtudById(@PathVariable int cin)
	{
		return service.findEtudiantByCin(cin);
	}
	
	@DeleteMapping("/delete/{cin}")
	public String deleteEtudiant(@PathVariable int cin)
    {	
		 return service.deleteEtudiant(cin);
    }
}
