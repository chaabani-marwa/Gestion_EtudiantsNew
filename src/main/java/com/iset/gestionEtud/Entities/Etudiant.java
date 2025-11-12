package com.iset.gestionEtud.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
public class Etudiant implements Serializable {

	@Id
	private int cin;
	private String nom;
	private String prenom;
	private String mail;
	private String password;
	private String classe;


	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// constructor default
	public Etudiant() {

	}

	@Override
	public String toString() {
		return "Etudiant [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", password="
				+ password + "]";
	}

	

	

}
