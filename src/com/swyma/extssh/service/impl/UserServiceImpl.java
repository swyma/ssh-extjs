package com.swyma.extssh.service.impl;

import java.util.List;

import com.swyma.extssh.dao.UserDao;
import com.swyma.extssh.model.User;
import com.swyma.extssh.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void delUser(User user) {
		// TODO Auto-generated method stub
		userDao.delUser(user);
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	public List getUser(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.getUser(username, password);
	}

	public List getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.saveUser(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List getUser(String hql,int start,int limit){
		return userDao.getUser(hql, start, limit);
	}
	
	public Long getCount(String hql){
		return userDao.getCount(hql);
	}
}
