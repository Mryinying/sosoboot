package com.it.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.jooq.model.Result;

import io.swagger.annotations.Api;

@Controller
@Api(tags="系统登录api")
public class LoginController {
	
	@RequestMapping("/login")
	public String login() {
		return "/login";
	}
	
	@RequestMapping("/doLogin")
	public String doLogin() {
		return "redirect:/stu/add";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
