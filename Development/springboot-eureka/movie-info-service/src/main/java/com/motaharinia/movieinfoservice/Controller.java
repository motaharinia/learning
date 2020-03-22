package com.motaharinia.movieinfoservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String home(){
        return "MovieInfoServiceApplication";
    }


    @RequestMapping("/movies")
    public Movie getMovie(){
        return new Movie(12,"titanic","romantic");
    }


}
