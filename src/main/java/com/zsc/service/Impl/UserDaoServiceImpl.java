package com.zsc.service.Impl;

import com.zsc.dao.UserDao;
import com.zsc.entity.User;
import com.zsc.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoServiceImpl implements UserDaoService {

	@Autowired
	UserDao userDao;

	@Override
	public boolean addUser(User user) {
		int num = userDao.addUser(user);
		if(num > 0)
		{
			return true;
		}
		return false;
	}
}
