package com.bsm.ssh.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bsm.ssh.dao.IUserDao;
import com.bsm.ssh.modle.TUser;

/**
 * @author liyao
 * 
 * @date 2016-2-2下午9:01:10
 * 
 * @description
 *
 */
@Repository
public class UserDaoImpl implements IUserDao {
	@Resource
	private SessionFactory sessionFactory;
	@Override
	public Serializable save(TUser user) {
		return sessionFactory.getCurrentSession().save(user);
	}

}
