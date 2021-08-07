package com.yun.face.controller;

import com.yun.face.remote.Userservice;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.HashMap;

@RestController
@RequestMapping({"/www/face"})
public class LoginController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancerClient loadBalancerClient;


    @Resource
    private Userservice uservice;

    @GetMapping("/login")
    public Object login(){
        String body = restTemplate.getForEntity("http://api-provider/www/user", String.class,new HashMap<String,String>(){{put("name","face");}}).getBody();
//        ServiceInstance serviceInstance = loadBalancerClient.choose("api-provider");
//        URI url = URI.create(String.format("http://%s:%s/www/user", serviceInstance.getHost(), serviceInstance.getPort()));
//        String body = loRestTemplate.getForEntity(url.toString(), String.class, "face").getBody();
//        String body = uservice.getUser("face");
        return "微服务调用成功:"+body;
    }
}
