package com.ztesoft.dispatcher.springboot.config.ckfinder;

import com.ckfinder.connector.FileUploadFilter;
import com.ztesoft.dispatcher.common.web.CKFinderConnectorServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/17
 */
@Configuration
public class CKFinderConfiguration {

    @Bean
    public FilterRegistrationBean fileUploadFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new FileUploadFilter());
        Map<String, String> params = new HashMap<>();
        params.put("sessionCookieName", "JSESSIONID");
        params.put("sessionParameterName", "jsessionid");
        filterRegistrationBean.setInitParameters(params);
        filterRegistrationBean.addUrlPatterns("/static/ckfinder/core/connector/java/connector.java");
        return filterRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean cKFinderConnectorServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new CKFinderConnectorServlet());
        Map<String, String> params = new HashMap<>();
        params.put("XMLConfig", "/WEB-INF/ckfinder.xml");
        params.put("debug", "false");
        params.put("configuration", "CKFinderConfig");
        servletRegistrationBean.setInitParameters(params);
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setUrlMappings(Collections.singletonList("/static/ckfinder/core/connector/java/connector.java"));
        return servletRegistrationBean;
    }
}
