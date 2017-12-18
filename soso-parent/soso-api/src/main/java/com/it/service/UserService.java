package com.it.service;

import org.springframework.stereotype.Service;

import com.it.jooq.generated.tables.pojos.User;

@Service
public interface UserService {
	
	User findById(Integer id);

}
