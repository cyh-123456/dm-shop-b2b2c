package com.dm.shopb2b2c.interceptor;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname: ShopOrderInterceptor
 * @Description： TODO
 * @Date: 2019/8/15 17:38
 * @Author: cyh
 */
public class ShopOrderInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
       String path=request.getContextPath();
    }
}
