package com.example.simpleApp.controller;

import com.example.customJar.service.HelloService;
import com.github.riddhijani.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class SimpleController {

    @Autowired
    private HelloService service;

    @GetMapping("/abc")
    public String simpleGreeting(){
        return service.getGreetings() + "(call from simpleApp project)";
    }

    @GetMapping("/sum")
    public String sum(){
        return String.valueOf(Operation.add(new BigDecimal(1000000000),new BigDecimal(2000000000)));
    }

}
