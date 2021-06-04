package com.lp;

/**
 * @author: lp
 * @create: 2021-06-04 18:50
 * @description: TODO
 */
public class UserServiceImpl implements  UserService{
	@Override
	public User queryById(Long id) {
		User user = new User();
		user.setName("liaopin");
		user.setAge(18);
		return user;
	}
}
