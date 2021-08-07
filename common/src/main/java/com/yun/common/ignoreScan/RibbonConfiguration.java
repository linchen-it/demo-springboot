package com.yun.common.ignoreScan;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient，为特定的目标服务 user 自定义配置。
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类。
 */
@Configuration
@IgnoreScan //作为自定义注解
public class RibbonConfiguration {

    //配置负载均衡规则
    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();
    }
}