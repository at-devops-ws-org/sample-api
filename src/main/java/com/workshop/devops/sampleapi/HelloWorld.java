package com.workshop.devops.sampleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello() {
        return "Hello hello";
    }

    @GetMapping("/world")
    public String world() {
        return "Hello world";
    }
    
}
