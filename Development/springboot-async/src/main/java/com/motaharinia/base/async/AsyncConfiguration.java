package com.motaharinia.base.async;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@EnableAsync
@Configuration
public class AsyncConfiguration implements AsyncConfigurer {

    @Value("${spring.task.execution.pool.core-size}")
    private Integer poolCoreSize;

    @Value("${spring.task.execution.pool.max-size}")
    private Integer poolMaxSize;

    @Value("${spring.task.execution.pool.queue-capacity}")
    private Integer poolQueueCapacity;

    @Value("${spring.task.scheduling.thread-name-prefix}")
    private String threadNamePrefix;


    @Bean(name = "workExecutor")
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(poolCoreSize);
        taskExecutor.setMaxPoolSize(poolMaxSize);
        taskExecutor.setQueueCapacity(poolQueueCapacity);
        taskExecutor.setThreadNamePrefix(threadNamePrefix);
        taskExecutor.afterPropertiesSet();
        taskExecutor.initialize();
        return taskExecutor;
    }


    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new MyAsyncUncaughtExceptionHandler();
    }
}
