package com.example.backendfundamentals.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/api/Hello")
    public String returnHello(){
        return "Hello world";
    }
}
