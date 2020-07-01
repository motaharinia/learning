package com.motaharinia;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

//https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples
//https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples/local-grpc-server/src/main/java/net/devh/boot/grpc/examples/local/server
//https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples/local-grpc-client/src/main/java/net/devh/boot/grpc/examples/local/client

@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class GrpcStarterClientApplication {




    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(GrpcStarterClientApplication.class, args);
    }

}
