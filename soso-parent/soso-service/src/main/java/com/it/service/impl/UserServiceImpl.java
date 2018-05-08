package com.it.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.api.service.UserService;
import com.it.service.impl.dao.UserDao;
import com.it.service.pojos.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User findById(Integer id) {
		User userVo = new User();
		userVo = userDao.findById(id);
		return userVo;
	}
	
}
