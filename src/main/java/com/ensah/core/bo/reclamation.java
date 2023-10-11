package com.ensah.core.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class reclamation
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReclamation ;
	@Column(nullable = true)
	private String message;
	@Column(nullable = true)
	private String reponse;
	
	@ManyToOne
	private Absence absence;
	
	public void setAbsence(Absence abs)
	{
		this.absence=abs;
	}
	public Absence getAbsence()
	{
		return absence;
	}
	public void setIdReclamation(long id)
	{
		this.idReclamation=id;
	}
	
	public long getIdReclamation()
	{
		return idReclamation;
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
