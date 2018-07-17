package com.zsc.service.Impl;

import com.zsc.entity.User;
import com.zsc.service.UserDaoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class UserDaoImplTest {

	@Autowired
	private UserDaoService userDaoService;

	@Test
	public void addUser() {
		User user = new User("admin", "admin");
		boolean flag = userDaoService.addUser(user);
		if(flag) System.out.println("success");
		else System.out.println("fail");
	}
}