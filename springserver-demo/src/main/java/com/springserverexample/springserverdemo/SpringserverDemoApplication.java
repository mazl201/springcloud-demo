package com.springserverexample.springserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SpringserverDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringserverDemoApplication.class, args);
	}


	/**
	 * emergency! eureka may be incorrectly claiming instances are up when they're not. renewals are lesser than threshold and hence the instances are not being expired just to be safe.
	 */

}

