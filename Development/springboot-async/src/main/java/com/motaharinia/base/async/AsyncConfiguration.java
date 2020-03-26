package com.motaharinia.base.async;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
public class AsyncConfiguration implements AsyncConfigurer {

//    @Value("${spring.task.execution.pool.core-size}")
//    private Integer poolCoreSize;
//
//    @Value("${spring.task.execution.pool.max-size}")
//    private Integer poolMaxSize;
//
//    @Value("${spring.task.execution.pool.queue-capacity}")
//    private Integer poolQueueCapacity;
//
//    @Value("${spring.task.execution.thread-name-prefix}")
//    private String threadNamePrefix;


//    @Bean(name = "workExecutor")
//    @Override
//    public Executor getAsyncExecutor() {
//        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
//        taskExecutor.setCorePoolSize(poolCoreSize);
//        taskExecutor.setMaxPoolSize(poolMaxSize);
//        taskExecutor.setQueueCapacity(poolQueueCapacity);
//        taskExecutor.setThreadNamePrefix(threadNamePrefix);
//        taskExecutor.afterPropertiesSet();
//        taskExecutor.initialize();
//        return taskExecutor;
//    }


    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncCustomUncaughtExceptionHandler();
    }
}
