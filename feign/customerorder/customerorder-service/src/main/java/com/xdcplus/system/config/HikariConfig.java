package com.xdcplus.system.config;

import com.xdcplus.system.common.enums.DataSourceType;
import com.xdcplus.system.datasource.DynamicDataSource;
import com.xdcplus.system.datasource.HikariProperties;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: Hikari多数据源配置
 **/
@Configuration
public class HikariConfig {

    @Bean(name = "dataSourceDb1")
    @ConfigurationProperties("spring.datasource.db")
    public DataSource dataSourceDb1(HikariProperties properties)
    {
        HikariDataSource dataSource = DataSourceBuilder.create().type(HikariDataSource.class).build();
        return properties.dataSource(dataSource);
    }

    @Bean(name = "dataSourceDb2")
    @ConfigurationProperties("spring.datasource.db2")
    @ConditionalOnProperty(prefix = "spring.datasource.db2", name = "enabled", havingValue = "true")
    public DataSource dataSourceDb2(HikariProperties properties)
    {
        HikariDataSource dataSource = DataSourceBuilder.create().type(HikariDataSource.class).build();
        return properties.dataSource(dataSource);
    }

    @Primary
    @Bean(name = "dynamicDataSource")
    public DynamicDataSource dataSource(DataSource dataSourceDb1,
                                        DataSource dataSourceDb2)
    {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceType.DB1.name(), dataSourceDb1);
        targetDataSources.put(DataSourceType.DB2.name(), dataSourceDb2);
        return new DynamicDataSource(dataSourceDb1, targetDataSources);
    }

}
