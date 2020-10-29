package com.lxspringbooteureka.lxlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LxlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxlearnApplication.class, args);
    }

}
