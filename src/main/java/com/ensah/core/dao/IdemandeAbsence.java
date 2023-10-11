package com.ensah.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensah.core.bo.Etudiant;
import com.ensah.core.bo.dmandeAbsence;

public interface IdemandeAbsence extends JpaRepository<dmandeAbsence, Long> {

}
