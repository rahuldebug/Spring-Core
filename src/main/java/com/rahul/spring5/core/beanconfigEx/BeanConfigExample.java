package com.rahul.spring5.core.beanconfigEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigExample {
    @Bean
    public ConfigExample getBeanConfig(){
        return new ConfigExample("config-bean", 12);
    }

}
