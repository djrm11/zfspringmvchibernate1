package com.bsm.ssh.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.bsm.ssh.dao.IUserDao;
import com.bsm.ssh.modle.TUser;
import com.bsm.ssh.service.IUserService;
/**
 * 
 * @author liyao
 * 
 * @date 2016-1-30下午10:46:14
 * 
 * @description
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	private static final Logger logger=Logger.getLogger(UserServiceImpl.class);
	@Override
	public void test() {
		logger.info("UserServiceImpl.test()");
	}
	@Override
	public Serializable saveUser(TUser user) {
		
		return userDao.save(user);
	}

}
