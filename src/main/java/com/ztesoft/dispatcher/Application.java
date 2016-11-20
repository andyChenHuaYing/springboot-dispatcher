package com.ztesoft.dispatcher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Description:
 * Spring Boot 启动入口类
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/9
 */
@Controller
@EnableWebMvc
@ServletComponentScan
@SpringBootApplication
public class Application {

    @Value("${web.view.index}")
    private String webViewIndex;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String webViewIndex() {
        return "redirect:" + webViewIndex;
    }
}
