package com.luis.curso.springboot.error.springbooterror.services;

import com.luis.curso.springboot.error.springbooterror.models.domains.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
}
