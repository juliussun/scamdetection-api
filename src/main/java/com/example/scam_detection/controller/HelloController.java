package com.example.scam_detection.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/msg")
    public String helloMessage(){
        return "Hello";
    }
}
