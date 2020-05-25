package com.example.demo;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSources {
    @ConfigurationProperties(prefix = "spring.datasource.mydb")
    @Bean
    public DataSource mydb() {
        System.out.println("DB Connected");
        return DataSourceBuilder.create().build();
    }
}