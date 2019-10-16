package com.debts.debtsapi.controllers;


import com.debts.debtsapi.models.UserModel;
import com.debts.debtsapi.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getAllUsers")
    public List<UserModel> getAllTickets(){

        List<UserModel> userModelList = userRepository.findAll();
        System.out.println(userModelList);
        return userModelList;

    }
}
