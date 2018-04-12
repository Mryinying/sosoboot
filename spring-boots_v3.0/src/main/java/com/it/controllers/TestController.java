package com.it.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@RequestMapping("/web")  
public class TestController {
	
	@RequestMapping("/hi")  
    public String hi(Model model) {  
        return "layout/content"; //自动寻找resources/templates中名字为welcome.vm的文件作为模板，拼装后返回  
    }  

}
