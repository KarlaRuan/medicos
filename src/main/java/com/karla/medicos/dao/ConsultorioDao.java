package com.karla.medicos.dao;

import org.springframework.data.repository.CrudRepository;

import com.karla.medicos.domain.Consultorio;

public interface ConsultorioDao extends CrudRepository<Consultorio, Integer>{
    
}
