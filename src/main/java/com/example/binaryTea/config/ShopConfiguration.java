package com.example.binaryTea.config;

import com.example.binaryTea.properties.BinaryTeaProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
* 当前自定义的配置类用来加载配置文件中的配置项BinaryTeaProperties
* 并且只有当配置文件中配置了binarytea.ready=true时才会加载该配置类
* */
@Configuration
@EnableConfigurationProperties(BinaryTeaProperties.class)
@ConditionalOnProperty(name = "binarytea.ready", havingValue = "true")
public class ShopConfiguration {

}
