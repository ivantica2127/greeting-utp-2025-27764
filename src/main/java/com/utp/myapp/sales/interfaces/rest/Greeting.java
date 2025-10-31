package com.utp.myapp.sales.interfaces.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class Greeting {

    @GetMapping
    public String greet(@RequestParam(defaultValue = "world") String name) {
        return "Hello " + name + "El mundo es tuyo ahora y para siempre!";
    }

}
