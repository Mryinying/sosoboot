package com.it.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomHandlerInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("preHandle:请求前调用");
		//返回 false 则请求中断
        System.out.println("getRequestURL: "+request.getRequestURL());  
        System.out.println("getRequestURI: "+request.getRequestURI());  
//        System.out.println("getQueryString: "+request.getQueryString());  
//        System.out.println("getRemoteAddr: "+request.getRemoteAddr());  
//        System.out.println("getRemoteHost: "+request.getRemoteHost());  
//        System.out.println("getRemotePort: "+request.getRemotePort());  
//        System.out.println("getRemoteUser: "+request.getRemoteUser());  
//        System.out.println("getLocalAddr: "+request.getLocalAddr());  
//        System.out.println("getLocalName: "+request.getLocalName());  
//        System.out.println("getLocalPort: "+request.getLocalPort());  
//        System.out.println("getMethod: "+request.getMethod()); 
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.info("postHandle:请求后调用");
        System.out.println("getRequestURL: "+request.getRequestURL());  
        System.out.println("getRequestURI: "+request.getRequestURI());  
//        System.out.println("getQueryString: "+request.getQueryString());  
//        System.out.println("getRemoteAddr: "+request.getRemoteAddr());  
//        System.out.println("getRemoteHost: "+request.getRemoteHost());  
//        System.out.println("getRemotePort: "+request.getRemotePort());  
//        System.out.println("getRemoteUser: "+request.getRemoteUser());  
//        System.out.println("getLocalAddr: "+request.getLocalAddr());  
//        System.out.println("getLocalName: "+request.getLocalName());  
//        System.out.println("getLocalPort: "+request.getLocalPort());  
//        System.out.println("getMethod: "+request.getMethod()); 

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.info("afterCompletion:请求调用完成后回调方法，即在视图渲染完成后回调");
        System.out.println("getRequestURL: "+request.getRequestURL());  
        System.out.println("getRequestURI: "+request.getRequestURI());  
//        System.out.println("getQueryString: "+request.getQueryString());  
//        System.out.println("getRemoteAddr: "+request.getRemoteAddr());  
//        System.out.println("getRemoteHost: "+request.getRemoteHost());  
//        System.out.println("getRemotePort: "+request.getRemotePort());  
//        System.out.println("getRemoteUser: "+request.getRemoteUser());  
//        System.out.println("getLocalAddr: "+request.getLocalAddr());  
//        System.out.println("getLocalName: "+request.getLocalName());  
//        System.out.println("getLocalPort: "+request.getLocalPort());  
//        System.out.println("getMethod: "+request.getMethod()); 

	}

}