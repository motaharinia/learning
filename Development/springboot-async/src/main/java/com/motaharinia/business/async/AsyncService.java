package com.motaharinia.business.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AsyncService {

//    @Async("workExecutor")
    @Async
    public CompletableFuture<String> defaultExecutor(Integer poolMaxSize, String inputName) {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String threadCaption = "defaultExecutor: threadName:" + Thread.currentThread().getName() + " poolMaxSize:" + poolMaxSize + " inputName:" + inputName ;
        System.out.println(threadCaption + " Started at " + sdf.format(new Date()));
        randomDelay();
        System.out.println(threadCaption + " Finished at " + sdf.format(new Date()));
        return CompletableFuture.completedFuture(inputName);
    }



    private void randomDelay() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(5000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
