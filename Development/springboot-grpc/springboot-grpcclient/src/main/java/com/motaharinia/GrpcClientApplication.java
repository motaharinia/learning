package com.motaharinia;


import com.motaharinia.client.user.stub.User.*;
import com.motaharinia.client.user.stub.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class GrpcClientApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(GrpcClientApplication.class, args);
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(managedChannel);

        LoginRequest loginRequest = LoginRequest.newBuilder().setUsername("user1").setPassword("pass1").build();
       APIResponse apiResponse=  userStub.login(loginRequest);
        System.out.println("apiResponse"+  apiResponse.toString());
    }

}
