package com.bsm.ssh.controller;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bsm.ssh.modle.TUser;
import com.bsm.ssh.service.IUserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	@Resource
	private IUserService userService;
	private HttpServletRequest request;

	public HttpServletRequest getRequest() {
		return request;
	}

	@Autowired
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	@RequestMapping("/showUser")
	public String showUser() {
		TUser t=new TUser();
		t.setNamename(UUID.randomUUID().toString());
		userService.saveUser(t);
		String msg="添加成功："+t.getNamename();
		request.setAttribute("msg", msg);
		return "index";
	}

}
