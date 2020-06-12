package com.motaharinia.profileproperties;

import com.motaharinia.ProfilePropertiesApplication;
import com.motaharinia.msutility.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Value("${spring.application.name}")
    private String springApplicationName;

    @Value("${app.randomInt}")
    private Integer appRandomInt;

    @RequestMapping("/")
    public String getUrl() {
        return springApplicationName;
    }

    @RequestMapping(value = "/randomInt",method = RequestMethod.POST)
    public Integer getRandomInt(@Validated ProfilePropertiesApplication profilePropertiesApplication) {
        return appRandomInt;
    }


}
