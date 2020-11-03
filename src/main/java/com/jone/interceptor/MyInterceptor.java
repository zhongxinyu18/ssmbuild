package com.jone.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 应用springMVC拦截器实现用户验证
 */
public class MyInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();

        /**
         * 放行：登录跳转页面
         */
        if (request.getRequestURI().contains("toLogin")){
            return true;
        }

        /**
         * 放行：跳转注册页面
         */
        if (request.getRequestURI().contains("toCreat")){
            return true;
        }
        /**
         * 放行：注册请求
         */
        if (request.getRequestURI().contains("creat")){
            return true;
        }

        /**
         * 放行：用户session有数据，代表已登录，直接放行
         */
        if(session.getAttribute("userName") != null){
            return true;
        }

        //拦截：不满足放行条件的请求，全部跳转登录页面
        request.getRequestDispatcher("/WEB-INF/jsp/logon.jsp").forward(request,response);
        return false;
    }
}
