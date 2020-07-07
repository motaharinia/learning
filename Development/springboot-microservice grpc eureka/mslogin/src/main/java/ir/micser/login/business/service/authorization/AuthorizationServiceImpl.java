package ir.micser.login.business.service.authorization;


import io.grpc.stub.StreamObserver;
import ir.micser.login.business.service.authorization.stub.AuthorizationGrpc;
import ir.micser.login.business.service.authorization.stub.AuthorizationMicro.CheckAccessRequestModel;
import ir.micser.login.business.service.authorization.stub.AuthorizationMicro.CheckAccessResponseModel;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Date;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-07-01<br>
 * Time: 14:02:31<br>
 * Description:<br>
 */
@GrpcService
public class AuthorizationServiceImpl extends AuthorizationGrpc.AuthorizationImplBase implements AuthorizationService {
    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void checkAccess(CheckAccessRequestModel request, StreamObserver<CheckAccessResponseModel> responseObserver) {

        CheckAccessResponseModel.Builder response = CheckAccessResponseModel.newBuilder();
        response.setCheckDate(new Date().getTime());
        response.setResultCode(1000);
        response.setResult(true);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
