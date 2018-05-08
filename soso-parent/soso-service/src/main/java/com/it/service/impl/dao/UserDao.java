package com.it.service.impl.dao;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.it.jooq.generated.tables.records.UserRecord;
import com.it.service.pojos.User;

import static com.it.jooq.generated.tables.User.USER;

@Repository
public class UserDao extends DAOImpl<UserRecord,User,Integer>{

	@Autowired
    private DSLContext dslContext;
    
	protected UserDao(Configuration configuration) {
		super(USER, User.class, configuration);
	}
	
	@Override
	protected Integer getId(User object) {
		return object.getUid();
	}

}
