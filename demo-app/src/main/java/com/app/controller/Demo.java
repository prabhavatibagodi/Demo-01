package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Demo {

    @RequestMapping("/hello")
    public String getDetails(){

        return "Hello World";
    }
}
