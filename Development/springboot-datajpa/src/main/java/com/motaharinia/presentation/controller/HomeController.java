package com.motaharinia.presentation.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String home() {
        return "Hello Homepage!, to manage embedded h2 database open <a href='http://localhost:8080/h2-console/' target='_blank'>http://localhost:8080/h2-console/</a> with username:sa and blank password and datasourceUrl:jdbc:h2:mem:motahariniadb";
    }


}
