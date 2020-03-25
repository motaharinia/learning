package com.motaharinia.presentation.async;

import com.motaharinia.business.async.AsyncService;
import com.motaharinia.business.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class AsyncController {

    @Value("${spring.task.execution.pool.max-size}")
    private Integer poolMaxSize;

    AsyncService asyncService;

    @Autowired
    public AsyncController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @RequestMapping(value = "/defaultExecutor/{inputName}", method = GET)
    public String defaultExecutor(@PathVariable("inputName") String inputName) throws Exception {
        CompletableFuture<String> result=asyncService.defaultExecutor(poolMaxSize, inputName);
        return result.get();
    }

}
