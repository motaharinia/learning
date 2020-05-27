package com.motaharinia.springandboot.aspringsecurity.fspringsecurityjavaexample;

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
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin() {
        return "admin";
    }

    // Only, a person having ADMIN role can access this method.
    @RequestMapping(value="/update", method=RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String update() {
        return "record updated ";
    }
}
