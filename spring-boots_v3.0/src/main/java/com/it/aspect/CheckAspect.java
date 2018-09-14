package com.it.aspect;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


//在切入点前的操作，按order的值由小到大执行
//在切入点后的操作，按order的值由大到小执行
//@Aspect
//@Order(5)
//@Component
public class CheckAspect {

    private static final Logger logger = LoggerFactory.getLogger(CheckAspect.class);

    @Pointcut("execution(public * com.it.controllers.*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.debug("URL : " + request.getRequestURL().toString());
        logger.debug("HTTP_METHOD : " + request.getMethod());
        logger.debug("IP : " + request.getRemoteAddr());
        logger.debug("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.debug("ARGS : " + Arrays.toString(joinPoint.getArgs()));

        logger.debug("doBefore : 5==========================================");

    }
    
//    @Around("webLog()")
//    public void doAround(JoinPoint joinPoint) throws Throwable {
//    	
//    	logger.debug("doAround : 5==========================================");
//    	
//    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.debug("RESPONSE : " + ret);
        logger.debug("doAfterReturning : 5==========================================");
    }

}
