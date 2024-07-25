package org.example.springbootwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    public String greeting() {
        return "Welcome to Spring Boot War Deployment on External Tomcat Server!";
    }
}
