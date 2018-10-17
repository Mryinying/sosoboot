package com.it.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${foo}")
    String foo;
	@Value("${success}")
	String success;
	@Value("${democonfigclient.message}")
	String message ;
	
	
    @RequestMapping("/hi")
    public String home() {
        return "hi,i am from foo:" + foo +"<br/>message: "+message;
    }
    
    @RequestMapping("/hello")
    public String home(String name) {
        return "<span style='color:#555;'>To name:"+name+"</span> <br/>message: <div style='width:500px;height:300px;margin:0 auto;'>"
        		+ "<h1>"+success +"</h1></div>";
    }

}
