package com.ztesoft.dispatcher.springboot.config.datasource;

import org.springframework.beans.factory.annotation.Value;

/**
 * Description:
 * 根据配置文件中配置项初始化阿里数据库连接池，一定要注意当前配置项的优先级，必须在那些使用DataSource的配置项初始化
 * 之前初始化。
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/11
 */
/*@Configuration
@PropertySource("classpath:config/datasource.properties")*/
public class DataSourceConfiguration {

    @Value("${dispatcher.dev.datasource.url}")
    private String url;

    @Value("${dispatcher.dev.datasource.driverClassName}")
    private String driverClass;

    @Value("${dispatcher.dev.datasource.username}")
    private String username;

    @Value("${dispatcher.dev.datasource.password}")
    private String password;



/*    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClass);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        System.out.println(dataSource);
        return dataSource;
    }*/
}
