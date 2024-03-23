package com.luis.curso.springboot.error.springbooterror.controllers;

import com.luis.curso.springboot.error.springbooterror.exceptions.UserNotFoundException;
import com.luis.curso.springboot.error.springbooterror.models.domains.User;
import com.luis.curso.springboot.error.springbooterror.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping//lo ejecuta por defecto
    public String index() {
        //  int value = 100/0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user  = service.findById(id).orElseThrow(()->new UserNotFoundException("Error el usuairo no existe"));

        return user;
    }

}
