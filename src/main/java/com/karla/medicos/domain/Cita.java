package com.karla.medicos.domain;

import lombok.Data;

@Data
public class Cita {
    
    private Integer id;
    private Integer idConsultorio;
    private Doctor doctor;
    private String horarioConsulta;
    private String nombrePaciente;
    
}
