package com.dm.shopb2b2c.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Classname: InterceptorConfig
 * @Description： TODO
 * @Date: 2019/8/16 14:06
 * @Author: cyh
 */
public class InterceptorConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ShopOrderInterceptor()).addPathPatterns("");
        super.addInterceptors(registry);
    }
}
