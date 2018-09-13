package com.it.advice;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {
	
	
	public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode", "9999");
        result.put("respMsg", e.getMessage());
        mav.addObject("exception", e);
        mav.addObject("result", result);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
	
	/**
     *  拦截Exception类的异常
     * @param e
     * @return
     */
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public Map<String,Object> exceptionHandler(Exception e){
//        //正常开发中，可创建一个统一响应实体，如CommonResp
//        return result; 
//    }
//    
    /**
     * 拦截 CommonException 的异常
     * @param ex
     * @return
     */
    @ExceptionHandler(CommonException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(CommonException ex){
        log.info("CommonException：{}({})",ex.getMessage(), ex.getCode());
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode", ex.getCode());
        result.put("respMsg", ex.getMessage());
        return result; 
    }

}
