package com.yun.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : LoginController
 * @Description : 描述
 * @Author : chenlin
 * @Date: 2021/7/16 16:50
 */
@RestController
@RequestMapping(value = {"/www/user"})
public class ApiController {

    @ResponseBody
    @GetMapping
    public String user(String name){
        return name+"成功了，8500微服务";
    }
}
