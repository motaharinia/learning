package com.motaharinia.server;

import com.motaharinia.server.user.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GrpcServerApplication {

    public static void main(String[] args) throws Exception  {
        SpringApplication.run(GrpcServerApplication.class, args);
        Server server = ServerBuilder.forPort(9090).addService(new UserService()).build();
        server.start();
        System.out.println("Server Started at " + server.getPort());
        server.awaitTermination();
    }

}
