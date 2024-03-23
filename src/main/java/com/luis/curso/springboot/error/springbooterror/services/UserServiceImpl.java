package com.luis.curso.springboot.error.springbooterror.services;

import com.luis.curso.springboot.error.springbooterror.models.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        Optional<User> user = users.stream().filter(usr -> usr.getId().equals(id)).findFirst();

        /*
        for (User u : users) {
            if (u.getId().equals(id)) {//posible error de logica al comparar
                user = u;
                break;
            }
        }
        */
        return user;
    }
}
