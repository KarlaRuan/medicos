package com.karla.medicos.dao;

import org.springframework.data.repository.CrudRepository;

import com.karla.medicos.domain.Doctor;

public interface DoctorDao extends CrudRepository<Doctor, Integer>{
    
}
