package com.chordncode.react_01.application.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/api/home")
    public String home(){
        return "Welcome!";
    }

}
