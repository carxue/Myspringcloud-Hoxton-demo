package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.cloud.config.FeignConfiguration;

@FeignClient(name = "nacos-hello-service",configuration = FeignConfiguration.class)
public interface FeignCommonService extends CommonService {
	//FeignConfiguration中定义了不启用hystrix容错机制
}
