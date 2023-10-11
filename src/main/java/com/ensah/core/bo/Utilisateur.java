package com.ensah.core.bo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private long idUtilisateur;

	private String nom;

	private String prenom;

	@Column(unique = true, nullable = true)
	private String cin;

	@Column(unique = true, nullable = true)
	private String email;

	@Column(nullable = true)
	private String telephone;

	@Column(nullable = true)
	private String nomArabe;

	@Column(nullable = true)
	private String prenomArabe;
	@OneToOne( cascade = CascadeType.ALL)
	private Compte comptes;

	public long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getNomArabe() {
		return nomArabe;
	}

	public void setNomArabe(String nomArabe) {
		this.nomArabe = nomArabe;
	}

	public String getPrenomArabe() {
		return prenomArabe;
	}

	public void setPrenomArabe(String prenomArabe) {
		this.prenomArabe = prenomArabe;
	}


	public Compte getComptes() {
		return comptes;
	}

	public void setComptes(Compte comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin
				+ ", email=" + email + ", telephone=" + telephone + ", nomArabe=" + nomArabe + ", prenomArabe="
				+ prenomArabe +  "]";
	}

}