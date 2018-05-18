package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@ComponentScan(basePackages ={ "com.controller.pojo.*"})
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories
public class WebApplication {
  



    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}

