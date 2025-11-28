package com.practice.projectone.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public String hello(String name) {
        return "Hello " + name;
    }
}
