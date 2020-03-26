package com.motaharinia.designpattern.j2ee.presentation.interceptingfilter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/interceptingFilter/login")
    public String login() {
        return "Login. check 'response' header.";
    }
}
