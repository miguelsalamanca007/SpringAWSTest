package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BasicController {
    
    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Respuesta de la API";
    }
}
