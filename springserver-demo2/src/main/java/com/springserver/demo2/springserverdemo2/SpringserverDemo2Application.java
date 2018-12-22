package com.springserver.demo2.springserverdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
@ComponentScan("com.springserver.demo2.controller")
public class SpringserverDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringserverDemo2Application.class, args);
    }

}

