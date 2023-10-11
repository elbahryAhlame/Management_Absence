package com.ensah.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensah.core.bo.Absence;
import com.ensah.core.bo.Etudiant;
import com.ensah.core.dao.IAbsenceDao;
@Service
@Transactional
public class ServiceAbsenceImpl implements IServiceAbsence {
@Autowired
private IAbsenceDao absenceDao;
	@Override
	public  Absence getAbsence(long id) {
		
		return absenceDao.findById(id).get();
	}
	@Override
	public void enregestrerAbsence(Absence abs) {
		absenceDao.save(abs);
		
	}

}
