package com.ztesoft.dispatcher.springboot.config.redis;

import com.ztesoft.dispatcher.springboot.config.web.SpringConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Description:
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/10
 */
@Configuration
@ImportResource("classpath:spring-context-jedis.xml")
@AutoConfigureAfter(SpringConfiguration.class)
public class JedisConfiguration {
}
