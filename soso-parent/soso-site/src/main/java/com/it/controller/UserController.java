package com.it.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.api.models.Result;
import com.it.api.service.UserService;
import com.it.service.pojos.User;

@RestController
public class UserController {

	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("/find/{id}")
	public Result findById(@PathVariable Integer id){
		try {
			User user = userServiceImpl.findById(id);
			return Result.ok(user);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error();
		}
	} 
	@RequestMapping("/test")
	public User  findByName(HttpServletResponse response){
		User user = new User();
		user.setName("zhangsan");
		user.setUid(1231);
		return user;
	} 
}
