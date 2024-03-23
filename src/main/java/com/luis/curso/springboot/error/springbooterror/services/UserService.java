package com.luis.curso.springboot.error.springbooterror.services;

import com.luis.curso.springboot.error.springbooterror.models.domains.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);
}
