package com.motaharinia.presentation.controller;


import com.motaharinia.business.service.UserService;
import com.motaharinia.presentation.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //method that posts a new user detail
    @PostMapping("/user")
    public UserModel create(@RequestBody @Validated UserModel userModel) {
        return userService.create(userModel);
    }

    //retrieves a specific user detail
    @GetMapping("/user/{id}")
    public UserModel readOne(@PathVariable Integer id) {
        return userService.readOne(id);
    }

//    @GetMapping("/user")
//    public Page<UserModel> readGrid(@RequestBody @Validated GridFilterModel gridFilterModel) {
//        return userService.readGrid(gridFilterModel);
//    }

    @DeleteMapping("/user/{id}")
    public UserModel delete(@PathVariable Integer id) {
        return userService.delete(id);
    }


//    @GetMapping("/user/firstName/{firstName}")
//    public GridDataModel listGrid(@PathVariable String firstName) {
//        return userService.listGrid(firstName);
//    }
}
