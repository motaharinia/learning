package com.motaharinia.presentation.controller;

import com.motaharinia.business.service.UserService;
import com.motaharinia.persistence.orm.user.User;
import com.motaharinia.presentation.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<UserModel> findAll() {
        return userService.findAll();
    }
    //retrieves a specific user detail
    @GetMapping("/user/{id}")
    public UserModel findOne(@PathVariable Long  id) {
        return userService.findOne(id);
    }
    //method that posts a new user detail
    @PostMapping("/user")
    public UserModel create(@RequestBody UserModel userModel) {
        return userService.create(userModel);
    }

    @DeleteMapping("/students/{id}")
    public UserModel deleteStudent(@PathVariable Long id) {
        return userService.delete(id);
    }
}
