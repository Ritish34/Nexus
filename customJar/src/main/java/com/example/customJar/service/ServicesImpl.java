package com.example.customJar.service;

import org.springframework.stereotype.Service;

@Service
public class ServicesImpl implements HelloService{

    @Override
    public String getGreetings() {
        return "Hello From customJar Project";
    }
}
