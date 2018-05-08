package com.it.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.it.api.service.UserService;
import com.it.service.pojos.User;


@RunWith(SpringRunner.class)
@SpringBootTest("dubbo.enabled=false")
public class TestUserDao {
	
	@Autowired
	private UserService userServiceImpl;

	@Test
	public void test() {
		User findById = userServiceImpl.findById(101);
		System.out.println(findById);
	}
}
