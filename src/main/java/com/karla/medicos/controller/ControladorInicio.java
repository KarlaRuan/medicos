package com.karla.medicos.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.karla.medicos.dao.DoctorDao;


@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private DoctorDao doctorDao;
        
    @GetMapping("/")
    public String index(Model model) {
        log.info("Ejecutando rest");
        //var doctores = doctorDao.findAll();
       // model.addAttribute("doctores", doctores);
        return "index";
    }
    
}
