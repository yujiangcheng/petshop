package com.zsc.dao;

import com.zsc.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void addUser() {
		User user = new User("admin", "admin");
		int num;
		num = userDao.addUser(user);
		if(num > 0) System.out.println("success");
		else System.out.println("fail");
	}
}