package com.Security.spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OutputController {
    @GetMapping("/")
    public String printMessage(){
        return "HELLO WORLD";
    }
}
