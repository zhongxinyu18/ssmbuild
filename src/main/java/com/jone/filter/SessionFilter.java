package com.jone.filter;

import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response1 = (HttpServletResponse) response;
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpSession session = request1.getSession();
        System.out.println("1111111111111111111session过滤......userName="+session.getAttribute("userName"));
        if("".equals(session.getAttribute("userName")) || session.getAttribute("userName")==null){
            System.out.println("222222222222222222session过滤......");
            response1.sendRedirect("/logon.jsp");
        }else{
            chain.doFilter(request,response);
        }
    }

    public void destroy() {

    }
}
