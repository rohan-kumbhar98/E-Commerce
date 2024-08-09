package com.ecom.spring_ecomm_jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LandingPageController {

    @GetMapping
    public String LandingPage() {
        return "Welcome to the Spring E-Commerce Application!";
    }
}
