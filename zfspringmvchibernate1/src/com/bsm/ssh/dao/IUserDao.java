package com.bsm.ssh.dao;

import java.io.Serializable;

import com.bsm.ssh.modle.TUser;

public interface IUserDao {
	Serializable save(TUser user);
}
