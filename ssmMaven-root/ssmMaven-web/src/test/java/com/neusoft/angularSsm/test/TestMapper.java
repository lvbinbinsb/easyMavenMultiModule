package com.neusoft.angularSsm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neusoft.angularSsm.mapper.UserMapper;
import com.neusoft.angularSsm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath*:spring.xml","classpath*.springmvc.xml"})
public class TestMapper {
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testMapper() {
//		System.out.println(userMapper);
		//System.out.println(userService);
		userService.getUserList().forEach((u)->{System.out.println(u);});
	}
	
}
