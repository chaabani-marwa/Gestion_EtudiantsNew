package com.iset.gestionEtud.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iset.gestionEtud.Entities.Etudiant;

public interface EtudiantRepository  extends JpaRepository<Etudiant,Integer>{
	
	

}
