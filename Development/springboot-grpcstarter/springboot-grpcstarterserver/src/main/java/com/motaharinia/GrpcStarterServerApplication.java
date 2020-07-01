package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://github.com/yidongnan/grpc-spring-boot-starter/blob/master/README.md
//https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples
//https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples/local-grpc-server/src/main/java/net/devh/boot/grpc/examples/local/server
//https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples/local-grpc-client/src/main/java/net/devh/boot/grpc/examples/local/client


@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class GrpcStarterServerApplication {

    public static void main(String[] args) throws Exception  {
        SpringApplication.run(GrpcStarterServerApplication.class, args);
    }

}
