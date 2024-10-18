package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfiguration {

    @Bean
    public String myService() {
        return "Hello from MyService!";
    }
}