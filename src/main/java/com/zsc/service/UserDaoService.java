package com.zsc.service;

import com.zsc.entity.User;

public interface UserDaoService {


	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	boolean addUser(User user);
}
