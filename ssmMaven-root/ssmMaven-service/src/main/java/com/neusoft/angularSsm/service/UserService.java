package com.neusoft.angularSsm.service;

import java.util.List;

import com.neusoft.angularSsm.entity.User;

public interface UserService {

	List<User> getUserList();

	void addUser(String name);
	
	void removeUser(String name);
}
