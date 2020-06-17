package com.motaharinia.presentation.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.motaharinia.business.service.UserService;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.presentation.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/user")
    public SearchDataModel readGrid (@RequestParam(name = "searchFilterModel") Optional<String> searchFilterModelJson) throws JsonProcessingException {
        System.out.println("UserController.readGrid searchFilterModelJson.get():"+searchFilterModelJson.get());
        CustomObjectMapper customObjectMapper=new CustomObjectMapper();
        SearchFilterModel searchFilterModel = customObjectMapper.readValue(searchFilterModelJson.get(),SearchFilterModel.class);
        System.out.println("UserController.readGrid searchFilterModel:"+searchFilterModel.toString());
        SearchDataModel searchDataModel= userService.readGrid(searchFilterModel);
        System.out.println("UserController.readGrid searchDataModel:"+searchDataModel.toString());
        return searchDataModel;
    }

    @DeleteMapping("/user/{id}")
    public UserModel delete(@PathVariable Integer id) {
        return userService.delete(id);
    }


//    @GetMapping("/user/firstName/{firstName}")
//    public GridDataModel listGrid(@PathVariable String firstName) {
//        return userService.listGrid(firstName);
//    }
}
