package com.ulises.cuso.webapp.springweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ulises.cuso.webapp.springweb.models.User;
import com.ulises.cuso.webapp.springweb.models.dto.ParamDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Autowired
    private Environment env;

    @GetMapping("/baz/{message}/{number}")
    public ParamDto baz(@PathVariable String message, @PathVariable Integer number) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        paramDto.setNumber(number);
        return paramDto;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        
        // Hacer un save en la DB
        user.setName(user.getName().toUpperCase());

        return user;
    }

    @GetMapping("/env")
    public String env() {
        return env.getProperty("spring.application.name");
    }
}
