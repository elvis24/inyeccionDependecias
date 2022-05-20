package com.papudev.inyecciondependecias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InyeccionDependeciasApplication {

    public static void main(String[] args) {
        SpringApplication.run(InyeccionDependeciasApplication.class, args);
    }

    public void saludar(){
        System.out.println("Bienvenido Dev");
    }

}
