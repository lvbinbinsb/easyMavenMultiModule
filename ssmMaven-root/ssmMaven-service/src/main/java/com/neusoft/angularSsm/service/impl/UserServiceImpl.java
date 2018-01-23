package com.neusoft.angularSsm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.neusoft.angularSsm.entity.User;
import com.neusoft.angularSsm.mapper.UserMapper;
import com.neusoft.angularSsm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUserList() {
		PageHelper.startPage(1,10);
		List<User> list = userMapper.selectAll();
		return list;
	}

	@Override
	public void addUser(String name) {
		userMapper.addUser(name);
	}
	
	public void removeUser(String name) {
		userMapper.deleteUser(name);
	}
	
}
