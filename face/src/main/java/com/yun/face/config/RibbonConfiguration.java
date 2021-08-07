package com.yun.face.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import com.sun.org.apache.bcel.internal.generic.IUSHR;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient，为特定的目标服务 user 自定义配置。
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类。
 */
@Configuration
@RibbonClient(name = "api-provider", configuration = RibbonConfiguration.class)
public class RibbonConfiguration {

    //配置负载均衡规则
    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();
    }
}