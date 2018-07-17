package com.zsc.dao;

import com.zsc.entity.User;

public interface UserDao {

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	int addUser(User user);
}
