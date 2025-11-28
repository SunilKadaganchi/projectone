package com.practice.projectone.controller;

import com.practice.projectone.service.GreetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    private final GreetService greetService;

    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return greetService.hello("User");
    }
}
