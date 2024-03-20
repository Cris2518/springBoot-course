package com.ulises.cuso.webapp.springweb.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ulises.cuso.webapp.springweb.models.User;

@Controller
@RequestMapping("/app")
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Ulises", "Ortega", "");

        user.setEmail("cristian@gmail.com");

        model.addAttribute("title", "Hola Mundo desde el controlador");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        
        // List<User> users = List.of(
        //     new User("Ulises", "Ortega", "ortega@gmail.com"),
        //     new User("Doel", "Ortega", "ortega@gmail.com"),
        //     new User("Luis", "Ortega", "ortega@gmail.com")
        // );

        model.addAttribute("title", "Listado de usuarios");
        // model.addAttribute("users", users);

        return "list";
    }

    @ModelAttribute("users")
    public List<User> getUsers(){
    
        List<User> users = List.of(
            new User("Ulises", "Ortega", "ortega@gmail.com"),
            new User("Doel", "Ortega", "ortega@gmail.com"),
            new User("Luis", "Ortega", "ortega@gmail.com")
        );

        return users;
    }
}
