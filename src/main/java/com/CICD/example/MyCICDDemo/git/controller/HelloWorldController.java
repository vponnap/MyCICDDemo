package com.CICD.example.MyCICDDemo.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/welcome")
    public String getMessage() {
        return "HelloWorld welcome to Kanha";

    }
}
