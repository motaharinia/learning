package com.motaharinia.designpattern.j2ee.presentation.interceptingfilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Component
public class InterceptorConfiguration extends WebMvcConfigurationSupport {

    @Autowired
    InterceptorCustom interceptorCustom;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorCustom).addPathPatterns("/login");
    }
}
