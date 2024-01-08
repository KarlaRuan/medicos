package com.karla.medicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.karla.medicos.domain.Consultorio;
import com.karla.medicos.domain.Doctor;

@SpringBootApplication
public class MedicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicosApplication.class, args);
		Doctor doctor1 = new Doctor(1, "Juan", "Martinez", "Ortiz", "Médico general");
		Doctor doctor2 = new Doctor(2, "Alejandra", "Jimenez", "Juarez", "Psicóloga");
		Doctor doctor3 = new Doctor(3, "Ramiro", "Padilla", "Aranda", "Pediatra");

		Consultorio consultorio1 = new Consultorio(1, "12A");
		Consultorio consultorio2 = new Consultorio(2, "4B");
		Consultorio consultorio3 = new Consultorio(3, "1C");
		
		//System.out.println(doctor1);
	}

}
