package com.it.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

//注册器名称为customFilter,拦截的url为所有
@WebFilter(filterName="customFilter",urlPatterns={"/stu/*"})
@Slf4j
public class CustomFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        log.info("doFilter 请求处理");
        HttpServletRequest request2 = (HttpServletRequest)request;
        System.out.println("getRequestURL: "+request2.getRequestURL());  
        System.out.println("getRequestURI: "+request2.getRequestURI());  
//        System.out.println("getQueryString: "+request2.getQueryString());  
//        System.out.println("getRemoteAddr: "+request.getRemoteAddr());  
//        System.out.println("getRemoteHost: "+request.getRemoteHost());  
//        System.out.println("getRemotePort: "+request.getRemotePort());  
//        System.out.println("getRemoteUser: "+request2.getRemoteUser());  
//        System.out.println("getLocalAddr: "+request.getLocalAddr());  
//        System.out.println("getLocalName: "+request.getLocalName());  
//        System.out.println("getLocalPort: "+request.getLocalPort());  
//        System.out.println("getMethod: "+request2.getMethod()); 
        //对request、response进行一些预处理
        // 比如设置请求编码
        // request.setCharacterEncoding("UTF-8");
        // response.setCharacterEncoding("UTF-8");
        //TODO 进行业务逻辑
        
        //链路 直接传给下一个过滤器
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("filter 销毁");
    }
}
