package com.motaharinia.server.user;

import com.motaharinia.server.user.stub.User;
import com.motaharinia.server.user.stub.userGrpc;
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {
    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {
        System.out.println("login username:" + request.getUsername() + " password:" + request.getPassword());
        User.APIResponse.Builder response = User.APIResponse.newBuilder();
        if(request.getUsername().isEmpty() || request.getPassword().isEmpty()){
            response.setResponseCode(400);
            response.setResponsemessage("Username or password is blank");
        }else{
            response.setResponseCode(200);
            response.setResponsemessage("Success");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {
        super.logout(request, responseObserver);
    }
}
