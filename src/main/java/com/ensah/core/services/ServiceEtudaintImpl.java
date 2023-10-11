package com.ensah.core.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ensah.core.bo.Etudiant;
import com.ensah.core.dao.IEtudiantDao;

@Service
@Transactional
public class ServiceEtudaintImpl implements IServiceEtudiant
{
@Autowired
private IEtudiantDao etudiantDao;
	@Override
	public void enregestrer(Etudiant e)
	{
		etudiantDao.save(e);
		
	}
	@Override
	public Etudiant getEtudiant(long id) {
		return etudiantDao.findById(id).get();
	}

}
