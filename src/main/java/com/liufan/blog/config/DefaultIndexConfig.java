package com.liufan.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * @Author: Fan
 * @Date: 2020/10/17 00:17
 */
@Configuration
public class DefaultIndexConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("blog/index");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                String[] excludes = new String[]{"/css/**", "/images/**/", "/js/**"};
                registry.addInterceptor(new LocaleChangeInterceptor())
                        // 拦截所有请求
                        .addPathPatterns("/**")
                        // 排除不需要拦截的请求
                        // SpringBoot2中要排除静态资源路径, 因访问时不会加/static，所以配置如下
                        .excludePathPatterns(excludes);
            }
        };
        return webMvcConfigurer;
    }
}
