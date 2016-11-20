package com.ztesoft.dispatcher.springboot.config.servlet;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * 配置第三方jar包中的Servlet，SpringBoot启动时初始化到web容器中。
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/10
 */
@Configuration
public class ThirdPartServletConfig {

    /**
     * 用于监控阿里连接池状态的Servlet
     */
    @Bean
    public ServletRegistrationBean ServletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet());
        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
        servletRegistrationBean.addUrlMappings("/druid/*");
        return servletRegistrationBean;
    }


}
