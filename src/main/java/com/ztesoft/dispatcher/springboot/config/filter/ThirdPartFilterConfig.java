package com.ztesoft.dispatcher.springboot.config.filter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * 初始化第三方Listener， SpringBoot启动时，将其添加到ApplicationContext中。
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/10
 */
@Configuration
public class ThirdPartFilterConfig {
    @Bean("com.opensymphony.sitemesh.webapp.SiteMeshFilter")
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SiteMeshFilter());
        filterRegistrationBean.addUrlPatterns("/a/*");
        filterRegistrationBean.addUrlPatterns("/f/*");
        return filterRegistrationBean;
    }
}
