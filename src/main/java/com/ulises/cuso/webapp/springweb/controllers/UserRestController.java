package com.ulises.cuso.webapp.springweb.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ulises.cuso.webapp.springweb.models.User;
import com.ulises.cuso.webapp.springweb.models.dto.UserDTO;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/detailsRest")
    public UserDTO details(){

        UserDTO userDTO = new UserDTO();

        User user = new User("Ulises", "Ortega", "");

        userDTO.setUser(user);

        userDTO.setTitle("User Details");

        return userDTO;
    }

    @GetMapping("/listRest")
    public List<User> list(){
        
        User user1 = new User("Ulises", "Ortega", "");
        User user2 = new User("Doel", "Ortega", "");
        User user3 = new User("Luis", "Ortega", "");
        
        List<User> users = List.of(user1, user2, user3);

        return users;
    }

    // @GetMapping("/detailsRest")
    // public Map<String, Object> details(){

    //     User user = new User("Ulises", "Ortega");

    //     Map<String, Object> response = new HashMap<>();

    //     response.put("message", "Hello from the RestController");
    //     response.put("user", user);

    //     return response;
    // }
}
