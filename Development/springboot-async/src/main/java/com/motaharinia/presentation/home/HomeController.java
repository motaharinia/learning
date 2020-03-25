package com.motaharinia.presentation.home;

import com.motaharinia.business.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HomeController {

//    HomeService homeService;
//
//    @Autowired
//    public HomeController(HomeService homeService) {
//        this.homeService = homeService;
//    }

    @RequestMapping(value = "/", method = GET)
    public String home() {
//        return this.homeService.home();
        return "Home";
    }
}
