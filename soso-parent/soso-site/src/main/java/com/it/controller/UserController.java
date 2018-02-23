package com.it.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.jooq.generated.tables.pojos.User;
import com.it.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("find/{id}")
	public @ResponseBody User findById(@PathVariable Integer id,HttpServletResponse response){
		User user = userService.findById(id);
		response.setCharacterEncoding("utf-8");
		return user;
	} 
}
