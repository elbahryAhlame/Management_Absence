package com.ensah.core.bo;


import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * Represente un Etudiant.
 * 
 * Un enseignant est un cas spéciale de l'Etudiant
 * 
 * @author T. BOUDAA
 *
 */

@Entity
@PrimaryKeyJoinColumn(name = "idEtudiant")
public class Etudiant extends Utilisateur {

	private String cne;

	private String dateNaissance;
    @OneToMany(mappedBy="etudiant", cascade = CascadeType.ALL)
    private List<dmandeAbsence> demandes ;
    
    @OneToMany(mappedBy="etudiant", cascade = CascadeType.ALL)
    private List<Absence> absences ;
     
     
    public void setAbsences(List<Absence> abs)
    {
    	this.absences=abs;
    }
    
    public List<Absence> getAbsence()
    {
    	return absences;
    }
    
	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public List<dmandeAbsence> getDemandes()
	{
		return demandes;
	}
	public void setDemandes( List<dmandeAbsence> dms)
	{
		this.demandes=dms;
	}
	

}