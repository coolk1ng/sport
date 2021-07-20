package com.gong.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author CodeSniper
 * @since 2021-06-27
 *
 * 全局配置类--配置跨域请求
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
                //域访问路径
        registry.addMapping("/**")
                //请求来源
                .allowedOrigins("Http://localhost:8080","null")
                //方法
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                //是否允许携带信息
                .allowCredentials(true)
                //最大时间
                .maxAge(3600);

    }
}
