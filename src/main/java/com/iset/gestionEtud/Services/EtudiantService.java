package com.iset.gestionEtud.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iset.gestionEtud.Entities.Etudiant;
import com.iset.gestionEtud.Repositories.EtudiantRepository;

@Service
public class EtudiantService {
	
	
	@Autowired
	private EtudiantRepository repository;
	
	
	public Etudiant addEtudiant(Etudiant etudiant)
	{
		return repository.save(etudiant);
		
	}
	
	public Etudiant updateEtudiant(Etudiant etudiant)
	{
		Etudiant etudexiste=repository.findById(etudiant.getCin()).orElse(null);
		if(etudexiste!=null)
		{
			
			etudexiste.setMail(etudiant.getMail());
			etudexiste.setNom(etudiant.getNom());
			etudexiste.setPrenom(etudiant.getPrenom());			
			etudexiste.setPassword(etudiant.getPassword());
			
		}
		return repository.save(etudiant);
	}
	
	
	 public Etudiant findEtudiantByCin(int cin)
	 {
		 return repository.findById(cin).orElse(null);
	 }
	 
	 
	 public String deleteEtudiant(int cin)
	 {	Etudiant e=repository.findById(cin).orElse(null);
		 repository.delete(e);
		 return "Etudiant que sa CIN numero "+e.getCin()+"est supprime";
	 }
	 
	 public List<Etudiant> findAllEtudiant()
	 {
		return repository.findAll(); 
		
	 }

}
