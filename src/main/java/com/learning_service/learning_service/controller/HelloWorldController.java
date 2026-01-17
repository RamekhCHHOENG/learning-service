package com.learning_service.learning_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
    
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Learning Service API! Visit /api/hello for a greeting.";
    }
}
