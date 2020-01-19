package xyz.fengqing11.datasourcesmybatis.config;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.ConstructorProperties;

@Configuration
public class DataSourcesConfig {
    @Bean
    @ConfigurationProperties("spring.datasource.one")
    DataSource dsOne(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.two")
    DataSource dsTwo(){
        return DataSourceBuilder.create().build();
    }
}
