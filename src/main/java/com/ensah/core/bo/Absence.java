package com.ensah.core.bo;


import java.util.*;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Absence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAbsence;

	private String dateHeureDebutAbsence;

	private String dateHeureFinAbsence;
 
	
	@OneToOne(mappedBy="absence",cascade = CascadeType.ALL)
      reclamation reclamations;
      
      public void setReclamations(reclamation reclamations)
      {
    	  this.reclamations=reclamations;
      }
      public reclamation getReclamations()
      {
    	  return reclamations;
      }
      
      @ManyToOne
      private Etudiant etudiant;
      
      @OneToOne(cascade = CascadeType.ALL)
      public Matiere matiere;
      
      public void setMatiere(Matiere matiere)
      {
    	  this.matiere=matiere;
      }
      
      public Matiere getMatiere()
      {
    	  return matiere ;
      }
      
      public void setEtudiant(Etudiant e)
      {
    	  this.etudiant=e;
      }
      
      public Etudiant getEtudiant()
      
      {
    	  return etudiant;
      }
      
	public Long getIdAbsence() {
		return idAbsence;
	}

	public void setIdAbsence(Long idAbsence) {
		this.idAbsence = idAbsence;
	}

	public String getDateHeureDebutAbsence() {
		return dateHeureDebutAbsence;
	}

	public void setDateHeureDebutAbsence(String dateHeureDebutAbsence) {
		this.dateHeureDebutAbsence = dateHeureDebutAbsence;
	}

	public String getDateHeureFinAbsence() {
		return dateHeureFinAbsence;
	}

	public void setDateHeureFinAbsence(String dateHeureFinAbsence) {
		this.dateHeureFinAbsence = dateHeureFinAbsence;
	}

	
}