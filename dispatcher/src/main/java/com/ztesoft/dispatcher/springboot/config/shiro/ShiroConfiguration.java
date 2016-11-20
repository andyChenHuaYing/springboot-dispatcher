package com.ztesoft.dispatcher.springboot.config.shiro;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.DispatcherType;

/**
 * Description:
 * Spring boot 集成Apache shiro的配置项类
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/10
 */
@Configuration
@ImportResource("classpath:spring-context-shiro.xml")
public class ShiroConfiguration {
    /**
     * FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        filterRegistration.setFilter(new DelegatingFilterProxy("shiroFilter"));
        filterRegistration.setEnabled(true);
        filterRegistration.addUrlPatterns("/*");
        filterRegistration.setDispatcherTypes(DispatcherType.REQUEST);
        return filterRegistration;
    }
}