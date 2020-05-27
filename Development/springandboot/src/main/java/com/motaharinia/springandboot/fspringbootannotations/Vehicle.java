package com.motaharinia.springandboot.fspringbootannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.motaharinia")
public class Vehicle
{
    @Bean
    Vehicle engine() {
        return new Vehicle();
    }
}