package com.it.filter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

@WebListener
@Slf4j
public class Customlister implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("监听器：销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
    	
        log.info("监听器：初始化");
        HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
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
