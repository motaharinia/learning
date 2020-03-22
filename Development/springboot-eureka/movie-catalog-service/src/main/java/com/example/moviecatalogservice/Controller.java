package com.example.moviecatalogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @RequestMapping("/")
    public String home() {
        return "MovieCatalogServiceApplication";
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/catalog")
    public String getCatalog() {
        Movie movie = new Movie();
        try {
            movie = restTemplate.getForObject("http://MOVIE-INFO-SERVICE/movies", Movie.class);
        } catch (Exception e) {
            System.out.println(e);
        }
        return movie.getCatalog();
    }
}
