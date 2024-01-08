package com.karla.medicos.domain;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="consultorio")
public class Consultorio implements Serializable {

    private static final long serialVersionUID = 1L;
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numConsultorio;
    private String piso;

    public Consultorio(Integer numConsultorio, String piso){
        this.numConsultorio=numConsultorio;
        this.piso=piso;
    }

}
