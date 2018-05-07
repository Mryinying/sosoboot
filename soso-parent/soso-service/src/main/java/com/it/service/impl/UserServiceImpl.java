package com.it.service.impl;


import org.springframework.stereotype.Service;

import com.it.api.service.UserService;
import com.it.service.pojos.User;

@Service
public class UserServiceImpl implements UserService{

          
	@Override
	public User findById(Integer id) {
		User user = new User();
		user.setName("zhangsan");
		user.setUid(id);
		return user;
	}
	
}
