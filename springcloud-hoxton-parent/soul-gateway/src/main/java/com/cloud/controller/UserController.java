package com.cloud.controller;


import com.cloud.dto.UserCreateDTO;
import org.dromara.soul.client.springcloud.annotation.SoulSpringCloudClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /*path映射的 HTTP 接口的请求路径*/
    /*desc 接口的描述，便于知道其用途*/
    /*enable 是否开启，默认为 true 开启*/
    @GetMapping("/get")
    @SoulSpringCloudClient(path = "/user/get", desc = "获得用户详细")
    public String getUser(@RequestParam("id") Integer id) {
        return "DEMO:" + id;
    }

    @PostMapping("/create")
    @SoulSpringCloudClient(path = "/user/create", desc = "创建用户")
    public Integer createUser(@RequestBody UserCreateDTO createDTO) {
        logger.info("[createUser][username({}) password({})]", createDTO.getNickname(), createDTO.getGender());
        return 1;
    }

}
