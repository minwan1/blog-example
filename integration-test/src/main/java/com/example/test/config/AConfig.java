package com.example.test.config;

import com.example.test.rest.AService;
import com.example.test.rest.RestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.test.member")
public class AConfig {

    @Bean
    public RestService restService(){
        return new AService();
    }
}
