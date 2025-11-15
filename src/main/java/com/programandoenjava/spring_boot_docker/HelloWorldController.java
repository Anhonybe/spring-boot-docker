package com.programandoenjava.spring_boot_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String inicio() {
        return "Bienvenido, estás autenticado!";
    }

    @GetMapping("/publico")
    public String publico() {
        return "Ruta pública sin login";
    }
}
