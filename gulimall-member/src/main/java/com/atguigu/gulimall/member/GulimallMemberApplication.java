package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要远程调用别的服务
 * 1  引入openfeign
 * 2  编写接口告诉springcloud去调用远程服务  放在feign包下
 *      2.1 声明接口的每个方法都调用哪个远程服务的哪个请求
 * 3 开启远程调用功能
 */

@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
