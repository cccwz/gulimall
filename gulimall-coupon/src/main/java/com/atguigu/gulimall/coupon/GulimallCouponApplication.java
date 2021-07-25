package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 如何使用nacos配置中心统一管理依赖
 *
 * 1 引入依赖
 * 2 创建一个bootstrap.properties
 *       写上
 *      当前应用名字
 *      配置中心服务器地址
 * 3 给配置中心默认添加一个数据集gulimall-peoperties（默认规则：应用名.properties）
 * 4 给gulimall-peoperties添加配置
 * 5 动态获取配置@RefreshScope  优先使用配置中心的属性
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
