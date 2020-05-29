package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class DataJpaH2Application {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaH2Application.class, args);
    }

}
