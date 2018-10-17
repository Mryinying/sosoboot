package com.it.sericeFeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.it.sericeFeign.service.HiServiceImpl;

@Controller
public class HiController {
	
	@Autowired
	HiServiceImpl hiServiceImpl;
	
    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String sayHi(@PathVariable String name){
        return hiServiceImpl.sayHiFromClientOne(name);
    }

}
