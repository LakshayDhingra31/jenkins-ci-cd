package com.example.jenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World! Spring Boot is running.";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Welcome to the Jenkins Spring Boot Application!";
    }
}