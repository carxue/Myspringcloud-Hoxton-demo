package com.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@EnableHystrix
@EnableCircuitBreaker
/*Dashboard监控*/
@EnableHystrixDashboard
@EnableTurbineStream
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = { "com.cloud.*" })
public class SpringCloudTurbineAmqpApplication {
	
	@Bean
	@LoadBalanced
	RestTemplate template(){
		return new RestTemplate();
	}
	
	@Bean
	public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet() {
	        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
	        ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean = new ServletRegistrationBean<>(streamServlet);
	        registrationBean.setLoadOnStartup(1);
	        registrationBean.addUrlMappings("/hystrix.stream");
	        registrationBean.setName("HystrixMetricsStreamServlet");
	        return registrationBean;
	}   

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTurbineAmqpApplication.class, args);
	}
}
