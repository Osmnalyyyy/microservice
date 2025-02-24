package com.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class HelloController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Service A Hello" + LocalDateTime.now();
    }
}
