package com.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.service.HelloService;

@RestController
public class ConsumerController {
	private final Logger logger = LoggerFactory.getLogger(ConsumerController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HelloService helloService;
	
	
	@RequestMapping(value="/ribbon-consumer/hystrix")
	public String indexHystrix(@RequestParam Long id){
		return helloService.helloService(id);
	}
}
