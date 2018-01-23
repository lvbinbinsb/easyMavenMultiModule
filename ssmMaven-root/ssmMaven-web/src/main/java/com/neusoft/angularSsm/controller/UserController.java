package com.neusoft.angularSsm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.neusoft.angularSsm.entity.User;
import com.neusoft.angularSsm.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {

	@Resource
	private UserService userService;


	// ================================================================
	@RequestMapping("/userlist.json")
	@ResponseBody
	public List<User> getUserList(@RequestParam(value="pn",defaultValue="1")Integer pn) {
		PageHelper.startPage(pn, 10);
		return userService.getUserList();
	}

	@RequestMapping("/layout")
	
	public String getUserPartialPage() {
		return "users/layout";
	}
	
	@RequestMapping("/addNewUser/{newUser}")
	@ResponseBody
	public void addNewUser(@PathVariable("newUser")String name) {
		userService.addUser(name);
	}
	
	@RequestMapping("/removeUser/{newUser}")
	@ResponseBody
	public void removeUser(@PathVariable("newUser")String name) {
		userService.removeUser(name);
	}
}
