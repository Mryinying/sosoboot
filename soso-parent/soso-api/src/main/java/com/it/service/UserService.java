package com.it.service;

import com.it.jooq.generated.tables.pojos.User;

public interface UserService {
	
	User findById(Integer id);

}
