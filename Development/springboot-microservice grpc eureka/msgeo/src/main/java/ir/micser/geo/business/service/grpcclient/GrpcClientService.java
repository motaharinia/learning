package ir.micser.geo.business.service.grpcclient;


import io.grpc.StatusRuntimeException;
import ir.micser.login.business.service.authorization.stub.AuthorizationGrpc;
import ir.micser.login.business.service.authorization.stub.AuthorizationMicro.CheckAccessRequestModel;
import ir.micser.login.business.service.authorization.stub.AuthorizationMicro.CheckAccessResponseModel;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-07-01<br>
 * Time: 16:51:36<br>
 * Description:<br>
 */
@Service
public class GrpcClientService {

    @GrpcClient("grpcClientAuthorization")
    private AuthorizationGrpc.AuthorizationBlockingStub authorizationStub;

    public String checkResult(final String url) {
        try {
            CheckAccessRequestModel loginRequest = CheckAccessRequestModel.newBuilder().setUrl(url).setAccessToken("token1").build();
            final CheckAccessResponseModel apiResponse= this.authorizationStub.checkAccess(loginRequest);
            return apiResponse.getResult() + "";
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

}