package com.example.binaryTea.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfiguration {
    @Bean
    public static SpeakerBeanFactoryPostProcessor speakerBeanFactoryPostProcessor() {
        return new SpeakerBeanFactoryPostProcessor();
    }
}
