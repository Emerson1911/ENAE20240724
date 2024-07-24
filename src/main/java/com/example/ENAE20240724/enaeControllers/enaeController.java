package com.example.ENAE20240724.enaeControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")

public class enaeController {
    @GetMapping
    public String index() {
        // Implementación para obtener todos los recursos
        return "home/index";
    }

    @GetMapping("/create")
    public String create() {
        // Implementación para obtener todos los recursos
        return "home/create";
    }
}
