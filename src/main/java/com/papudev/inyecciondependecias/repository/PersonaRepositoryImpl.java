package com.papudev.inyecciondependecias.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepositoryImpl implements IPersonaRepository{
    @Override
    public void saludar() {
        System.out.println("Bienvenidos Papus");
    }
}
