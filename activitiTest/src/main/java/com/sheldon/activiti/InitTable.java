package com.sheldon.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/25 20:00
 */
public class InitTable {
    public static void createTable(){
        //创建流程引擎
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration
                .createStandaloneProcessEngineConfiguration();
        //设置configuration
        configuration.setJdbcDriver("com.mysql.cj.jdbc.Driver");
        configuration.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/activiti?serverTimezone=GMT%2B8&useSSL=false&allowPublicKeyRetrieval=true");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("root");

        /**
         * DB_SCHEMA_UPDATE_FALSE = 如果数据库里面没有activiti的表 也不会创建
         * DB_SCHEMA_UPDATE_CREATE_DROP = 创建表，使用完后删除
         * DB_SCHEMA_UPDATE_TRUE = 如果数据库里没有表，就创建
         *
         * dorp-create 如果有表，先删除再创建
         */
        //配置表的初始化方式
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        //得到流程引擎
        ProcessEngine processEngine = configuration.buildProcessEngine();
        System.out.println(processEngine);
    }

    public static void main(String[] args) {
        createTable2();
    }
    public static void createTable2(){
        //创建数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/activiti?serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        //创建流程引擎
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration
                .createStandaloneProcessEngineConfiguration();
        //设置configuration
        configuration.setDataSource(dataSource);

        /**
         * DB_SCHEMA_UPDATE_FALSE = 如果数据库里面没有activiti的表 也不会创建
         * DB_SCHEMA_UPDATE_CREATE_DROP = 创建表，使用完后删除
         * DB_SCHEMA_UPDATE_TRUE = 如果数据库里没有表，就创建
         *
         * dorp-create 如果有表，先删除再创建
         */
        //配置表的初始化方式
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        //得到流程引擎
        ProcessEngine processEngine = configuration.buildProcessEngine();
        System.out.println(processEngine);
    }
}
