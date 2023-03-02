package com.sankuai.inf.leaf.server.config.mybatis;

import com.google.gson.Gson;
import com.sankuai.inf.leaf.server.config.mybatis.properties.DataSourceProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

    @Value("${15151515}")
    public String MysqlJsonStr;

    @Bean
    public DataSourceProperties dataSourceProperties() {
        DataSourceProperties json = new Gson().fromJson(MysqlJsonStr, DataSourceProperties.class);
        DataSourceProperties properties = new DataSourceProperties();
        properties.setUrl(json.getUrl());
        properties.setUsername(json.getUsername());
        properties.setPassword(json.getPassword());
        return properties;
    }

}
