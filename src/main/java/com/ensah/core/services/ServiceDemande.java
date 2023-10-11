package com.ensah.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensah.core.bo.dmandeAbsence;
import com.ensah.core.dao.IdemandeAbsence;


@Service
@Transactional
public class ServiceDemande implements IServiceDemande
{
@Autowired
private IdemandeAbsence demandeDao;
	@Override
	public void enregestrerDemande(dmandeAbsence demande) {
		demandeDao.save(demande);
		
	}

}
