package com.yun.face.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("api-provider")//服务提供者的应用名
public interface Userservice {

    @RequestMapping("/www/user")
    String getUser(@RequestParam("name")String name);
}
