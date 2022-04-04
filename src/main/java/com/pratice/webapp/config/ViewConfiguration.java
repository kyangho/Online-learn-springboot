package com.pratice.webapp.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
@EnableWebMvc
public class ViewConfiguration implements WebMvcConfigurer {
    @Resource
    protected ApplicationContext applicationContext;

}
