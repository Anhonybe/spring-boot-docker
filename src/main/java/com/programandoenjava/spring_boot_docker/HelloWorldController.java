package com.programandoenjava.spring_boot_docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        // Devuelve el nombre del archivo HTML sin la extensión
        return "index";
    }
}
