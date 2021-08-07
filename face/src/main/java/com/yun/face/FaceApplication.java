package com.yun.face;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.yun.face.*"})
public class FaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceApplication.class, args);
    }

}
