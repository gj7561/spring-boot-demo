package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class InstanceController {

    @Value("${application.default.instance}")
    private String appInstance;

    @GetMapping("/instance") // Maps the root URL
    public String hello() {

        return "Hello You are using "+appInstance+" instance"; // This text will appear in the browser
    }
}
