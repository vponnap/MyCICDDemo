package com.CICD.example.MyCICDDemo.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/hello")
    public String getMessage(){
        return "hello Docker";
    }

    @GetMapping("/docker")
    public String getDocker(){
        return "hello Docker 04";
    }

    @GetMapping("/docker")
    public String getDockerImages(){
        return "hello Docker Images are Jenkins,wordpress";
    }
}
