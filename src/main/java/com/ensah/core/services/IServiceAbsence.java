package com.ensah.core.services;

import com.ensah.core.bo.Absence;

public interface IServiceAbsence 
{
public Absence getAbsence(long id);
public void enregestrerAbsence(Absence abs);
}
