package com.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = { "com.cloud.*" })
public class NacoProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(NacoProvider1Application.class, args);
	}
}
