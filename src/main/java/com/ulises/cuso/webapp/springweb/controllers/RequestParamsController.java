package com.ulises.cuso.webapp.springweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ulises.cuso.webapp.springweb.models.dto.ParamDto;


@RestController
@RequestMapping("/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "No hay mensaje") String message) {

        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);

        return paramDto;
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String text, @RequestParam Integer number) {

        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(text);
        paramDto.setNumber(number);

        return paramDto;
    }
}
