package com.motaharinia.presentation.adminuser;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.motaharinia.business.service.adminuser.AdminUserService;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AdminUserController {

    private final AdminUserService adminUserService;

    @Autowired
    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    //method that posts a new adminuser detail
    @PostMapping("/adminUser")
    public AdminUserModel create(@RequestBody @Validated AdminUserModel adminUserModel) {
        return adminUserService.create(adminUserModel);
    }

    //retrieves a specific adminuser detail
    @GetMapping("/adminUser/{id}")
    public AdminUserModel readOne(@PathVariable Integer id) {
        return adminUserService.readOne(id);
    }

    @GetMapping("/adminUser")
    public SearchDataModel readGrid (@RequestParam(name = "searchFilterModel") Optional<String> searchFilterModelJson) throws JsonProcessingException {
        System.out.println("UserController.readGrid searchFilterModelJson.get():"+searchFilterModelJson.get());
        CustomObjectMapper customObjectMapper=new CustomObjectMapper();
        SearchFilterModel searchFilterModel = customObjectMapper.readValue(searchFilterModelJson.get(),SearchFilterModel.class);
        System.out.println("UserController.readGrid searchFilterModel:"+searchFilterModel.toString());
        SearchDataModel searchDataModel= adminUserService.readGrid(searchFilterModel);
        System.out.println("UserController.readGrid searchDataModel:"+searchDataModel.toString());
        return searchDataModel;
    }

    @DeleteMapping("/adminUser/{id}")
    public AdminUserModel delete(@PathVariable Integer id) {
        return adminUserService.delete(id);
    }


//    @GetMapping("/adminUser/firstName/{firstName}")
//    public GridDataModel listGrid(@PathVariable String firstName) {
//        return userService.listGrid(firstName);
//    }
}
