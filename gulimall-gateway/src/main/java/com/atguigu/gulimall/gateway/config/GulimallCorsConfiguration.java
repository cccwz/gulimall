package com.atguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class GulimallCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        //1,配置跨域
        corsConfiguration.addAllowedHeader("*");//允许哪些头进行跨域
        corsConfiguration.addAllowedMethod("*");//允许哪些方法进行跨域
        corsConfiguration.addAllowedOrigin("*");//允许哪些请求来源跨域
        corsConfiguration.setAllowCredentials(true);//是否允许携带cookie进行跨域

        //  /** ---任意路径都要进行跨域配置
        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }
}
