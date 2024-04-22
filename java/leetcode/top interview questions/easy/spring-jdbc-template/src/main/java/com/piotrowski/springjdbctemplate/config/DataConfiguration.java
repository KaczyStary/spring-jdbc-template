package com.piotrowski.springjdbctemplate.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class DataConfiguration {

    @Bean
    public EmbeddedDatabase dataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .setName("Books")
                .addScript("/sql/schema.sql")
                .addScript("/sql/data.sql")
                .build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(EmbeddedDatabase dataSource){
        return new JdbcTemplate(dataSource);
    }

}
