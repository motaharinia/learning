package com.motaharinia.presentation.controller;

import com.motaharinia.base.presentation.model.GridFilterModel;
import com.motaharinia.business.service.UserGrid1View;
import com.motaharinia.business.service.UserService;
import com.motaharinia.presentation.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //method that posts a new user detail
    @PostMapping("/user")
    public UserModel create(@RequestBody @Validated UserModel userModel) {
        return userService.create(userModel);
    }

    //retrieves a specific user detail
    @GetMapping("/user/{id}")
    public UserModel findOne(@PathVariable Long id) {
        return userService.findOne(id);
    }

    @GetMapping("/user")
    public Page<UserModel> findAll(@RequestBody @Validated GridFilterModel gridFilterModel) {
        return userService.findAll(gridFilterModel);
    }


    @DeleteMapping("/students/{id}")
    public UserModel deleteStudent(@PathVariable Long id) {
        return userService.delete(id);
    }


    @GetMapping("/user/firstName/{firstName}")
    public List<Object[]> findUserByFirstName(@PathVariable String firstName) {
        return userService.findUserByFirstName(firstName);
    }
}
