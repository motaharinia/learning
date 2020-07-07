package ir.micser.geo.presentation.grpcclient;


import ir.micser.geo.business.service.grpcclient.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *  کلاس کنترلر خانه
 */
@RestController
public class GrpcClientController {

    @Autowired
    GrpcClientService grpcClientService;

    @GetMapping("/grpcClient")
    public String home() {
        return "grpcClientService.checkResult():" + grpcClientService.checkResult("/city/create");
    }


}
