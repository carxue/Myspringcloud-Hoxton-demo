package com.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.cloud.*"})
public class SoulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoulGatewayApplication.class, args);
    }
}
