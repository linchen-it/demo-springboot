package com.yun.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping
    public String login(){
        return "成功了";
    }
}
