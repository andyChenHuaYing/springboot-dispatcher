package com.ztesoft.dispatcher.springboot.config.mybatis;

import com.ztesoft.dispatcher.common.persistence.annotation.MyBatisDao;
import com.ztesoft.dispatcher.springboot.config.web.SpringConfiguration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Description:
 * Mybatis 基础配置
 *
 * @author huaying.chen
 * @version 1.0-SNAPSHOT
 * @since 2016/11/8
 */
@Configuration
@MapperScan(basePackages = {"com.ztesoft.dispatcher"},
        annotationClass = MyBatisDao.class
)
@AutoConfigureAfter(SpringConfiguration.class)
public class MyBatisConfig {

    private final DataSource dataSource;

    @Autowired
    public MyBatisConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mappings/**/*.xml"));
        return sessionFactory.getObject();
    }


}
