package com.motaharinia.presentation.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String home() {
        return "Hello Homepage!, Spring boot 2 (The default database pooling technology in Spring Boot 2.0 has been switched from Tomcat Pool to HikariCP) data jpa with oracle";
    }


}
