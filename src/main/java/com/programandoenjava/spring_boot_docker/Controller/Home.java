package com.programandoenjava.spring_boot_docker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    
    @GetMapping("/") // <--- Este es el ÚNICO que debe tener esta anotación
    public String index() {
        // Asume que index.html está en src/main/resources/templates/
        // O lo sirve directamente si está en src/main/resources/static/
        return "index"; 
    }
}