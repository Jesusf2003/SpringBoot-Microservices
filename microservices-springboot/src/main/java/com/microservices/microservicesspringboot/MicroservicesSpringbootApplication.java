package com.microservices.microservicesspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class MicroservicesSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesSpringbootApplication.class, args);
        System.out.println("El proyecto está corriendo correctamente");
    }

}