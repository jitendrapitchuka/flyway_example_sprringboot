package com.flyway.example.flyway.controller;

import com.flyway.example.flyway.Repo.UserRepo;
import com.flyway.example.flyway.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public String save(@RequestBody  User user){
        String s=userRepo.save(user);

        return s;
    }
}
