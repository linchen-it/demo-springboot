package com.yun.user.controller;

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
@RequestMapping(value = {"/www/login"})
public class LoginController {

    @ResponseBody
    @RequestMapping
    public String login(){
        return "成功了，第一个微服务";
    }
}
