package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
@EnableTransactionManagement
public class DataJpaOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaOracleApplication.class, args);
    }

}
