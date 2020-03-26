package com.motaharinia.presentation.async;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AsyncControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Test
    public void defaultExecutorTest() throws Exception {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        for (Integer i=0;i<3;i++){
           String result=  this.restTemplate.getForObject("http://localhost:" + port + "/defaultExecutor/" +i.toString() , String.class);
            System.out.println("defaultExecutorTest: loop result:" + result);
        }
        System.out.println("defaultExecutorTest: threadPoolTaskExecutor.getThreadPoolExecutor().getCorePoolSize():" + threadPoolTaskExecutor.getThreadPoolExecutor().getCorePoolSize()+ " " + sdf.format(new Date()));
        System.out.println("defaultExecutorTest: threadPoolTaskExecutor.getThreadPoolExecutor().getMaximumPoolSize():" + threadPoolTaskExecutor.getThreadPoolExecutor().getMaximumPoolSize()+ " " + sdf.format(new Date()));
        System.out.println("defaultExecutorTest: threadPoolTaskExecutor.getThreadNamePrefix():" + threadPoolTaskExecutor.getThreadNamePrefix()+ " " + sdf.format(new Date()));
        System.out.println("defaultExecutorTest: [before-shutdown] threadPoolTaskExecutor.getThreadPoolExecutor():" + threadPoolTaskExecutor.getThreadPoolExecutor()+ " " + sdf.format(new Date()));
        threadPoolTaskExecutor.shutdown();
        System.out.println("defaultExecutorTest: [after-shutdown] threadPoolTaskExecutor.getThreadPoolExecutor():" + threadPoolTaskExecutor.getThreadPoolExecutor()+ " " + sdf.format(new Date()));
        threadPoolTaskExecutor.getThreadPoolExecutor().awaitTermination(1000, TimeUnit.SECONDS);
        System.out.println("defaultExecutorTest: Test Finished " + sdf.format(new Date()));
        assertThat(true).isTrue();
    }
}
