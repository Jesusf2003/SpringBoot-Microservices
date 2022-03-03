package com.microservices.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationMicroservices {

    public static void main(String []args) throws Exception {
        SpringApplication.run(ApplicationMicroservices.class, args);
    }
}