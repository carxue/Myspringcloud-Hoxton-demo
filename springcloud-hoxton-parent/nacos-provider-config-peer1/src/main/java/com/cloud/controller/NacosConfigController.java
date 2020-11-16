package com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class NacosConfigController {
	
	@Value("${my.name}")
	private String name;

	@Value("${my.age}")
	private String age;
	
	@RequestMapping("/nacos/config/test")
	public String from(){
		return this.name+":"+this.age;
	}
	

}
