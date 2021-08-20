package com.instance.two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class EntryPointController {

    @GetMapping("/welcome")
    public String entryPoint(){
        return "Welcome to the Instance 2";
    }

    @GetMapping("/instance")
    public String entryPoint2(){
        return "Welcome to the Instance 2 in entry point2";
    }
}
