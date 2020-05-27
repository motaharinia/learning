package com.motaharinia.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Step 5
 * Creating a controller to handle user requests.
 * گام 5
 * ایجاد یک کنترلر برای رسیدگی به درخواست های کاربر.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index() {
        return "index";
    }
}
