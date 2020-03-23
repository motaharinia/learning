package com.motaharinia.profileproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Value("${spring.datasource.url}")
    private String springDatasourceUrl;

    @Value("${app.randomInt}")
    private Integer appRandomInt;

    @RequestMapping("/")
    public String getUrl() {
        return springDatasourceUrl;
    }

    @RequestMapping("/randomInt")
    public Integer getRandomInt() {
        return appRandomInt;
    }


}
