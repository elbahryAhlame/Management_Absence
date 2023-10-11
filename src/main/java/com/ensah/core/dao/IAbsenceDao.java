package com.ensah.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensah.core.bo.Absence;

public interface IAbsenceDao extends JpaRepository<Absence, Long> {

}
