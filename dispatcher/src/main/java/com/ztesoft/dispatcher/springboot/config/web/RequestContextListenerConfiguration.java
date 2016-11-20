package com.ztesoft.dispatcher.springboot.config.web;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 18/11/16
 * Version: 1.0-SNAPSHOT
 */
@Configuration
public class RequestContextListenerConfiguration {

    @Bean
    public ServletListenerRegistrationBean<RequestContextListener> requestContextListener() {
        return new ServletListenerRegistrationBean<>(new RequestContextListener());
    }
}
