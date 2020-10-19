package ir.micser.geo.business.service.authorizationclient;


import com.google.protobuf.StringValue;
import com.motaharinia.msutility.customexception.CustomException;
import io.grpc.StatusRuntimeException;
import ir.micser.login.business.service.authorization.stub.AuthorizationGrpc.*;
import ir.micser.login.business.service.authorization.stub.AuthorizationMicro.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-07-01<br>
 * Time: 16:51:36<br>
 * Description:کلاس پیاده سازی اینترفیس کلاینت مجوز دسترسی
 */
@Service
public class AuthorizationClientServiceImpl {

    @GrpcClient("grpcClientAuthorization")
    private AuthorizationBlockingStub authorizationStub;

    public String checkAccess(final String url) {
        try {
            String token=null;
//            CheckAccessRequestModel loginRequest = CheckAccessRequestModel.newBuilder().setUrl(url).setAccessToken(token).build();
//            CheckAccessRequestModel loginRequest = CheckAccessRequestModel.newBuilder().setUrl(url).setAccessToken(StringValue.of(token)).build();

            CheckAccessRequestModel.Builder builder = CheckAccessRequestModel.newBuilder();
            Optional.ofNullable(url).ifPresent(builder::setUrl);
            Optional.ofNullable(token).ifPresent(builder::setAccessToken);

            final CheckAccessResponseModel apiResponse = this.authorizationStub.checkAccess(builder.build());
            return apiResponse.getResult() + "";
        } catch (final StatusRuntimeException ex) {
            CustomException customException = new CustomException(ex);
            System.out.println("customException.toString()" + customException.toString());

//            System.out.println("ex.getStatus().getCode(): " + ex.getStatus().getCode());
//            System.out.println("ex.getStatus().getDescription(): " + ex.getStatus().getDescription());
//            System.out.println("ex.getStatus().getCause(): " + ex.getStatus().getCause());
//            System.out.println("ex.getMessage(): " + ex.getMessage());
//            System.out.println("ex.getStackTrace().toString(): ");
//            ex.printStackTrace();

            return "FAILED with " +  customException.toString();
        }
    }

}