package com.example.test.config;

import com.example.test.rest.AService;
import com.example.test.rest.BService;
import com.example.test.rest.RestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class TestConfig {

    @Bean
    public RestService restService(){
        return new BService();
    }

}
