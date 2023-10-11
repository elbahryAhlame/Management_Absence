package com.ensah.core.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class dmandeAbsence
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDemande ;
	@Column(nullable = true)
	private String message;
	@Column(nullable = true)
	private String reponse;
	
	
	@ManyToOne
	private Etudiant etudiant;
	
	public void setEtudiant(Etudiant e)
	{
		this.etudiant=e;
	}
	public Etudiant getEtudiant()
	{
		return etudiant;
	}
	
	public void setIdReclamation(long id)
	{
		this.idDemande=id;
	}
	
	public long getIdReclamation()
	{
		return idDemande;
	}
	public void  setMessage(String msg)
	{
		this.message=msg;
	}
	public String getMessage()
	{
		return message;
	}
	public void setReponse(String rps)
	{
		this.reponse=rps;
	}
	
	public String getReponse()
	{
		return reponse;
	}
	
}
