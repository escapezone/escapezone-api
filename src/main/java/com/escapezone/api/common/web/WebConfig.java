package com.escapezone.api.common.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
//                .allowedOrigins("https://escapezone.com/", "http://local.escapezone.com:3000")
                .allowedMethods("POST", "PUT", "GET", "HEAD", "OPTION", "DELETE", "PATCH");
    }
}
