package com.dio.testedio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String HelloController(){
        return "Hello Spring Boot, só pra dizer que catuaba é top!";
    }
}
