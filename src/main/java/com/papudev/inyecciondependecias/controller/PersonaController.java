package com.papudev.inyecciondependecias.controller;

import com.papudev.inyecciondependecias.repository.PersonaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private PersonaRepositoryImpl repo;

    @GetMapping
    public void saludar(){
        repo.saludar();
    }
}
