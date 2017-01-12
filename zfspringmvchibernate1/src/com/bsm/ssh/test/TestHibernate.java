package com.bsm.ssh.test;

import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bsm.ssh.modle.TUser;
import com.bsm.ssh.service.IUserService;

public class TestHibernate {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "classpath:spring.xml", "classpath:spring-hibernate.xml" });
		IUserService userService = (IUserService) ac.getBean("userService");
		TUser t = new TUser();
		t.setNamename(UUID.randomUUID().toString());
		userService.saveUser(t);
	}

}
