package com.swyma.extssh.service;

import java.util.List;

import com.swyma.extssh.model.User;

/**
 * 
 * @author swyma
 *
 */
public interface UserService {
	//取出所有用户信息
	public List getUsers();	
	//取到相应用户信息，供删除用
	public User getUser(int id);
	//保存用户信息（设计为integer,为了调试，如果不需要的话，可以设置为void）
	public Integer saveUser(User user);
	//删除用户信息（物理删除）,个人推荐逻辑删除
	public void delUser(User user);
	//查询用户信息，供登录时用
	public List getUser(String username,String password);
	//查询用户信息，用于分页
	public List getUser(String hql,int start,int limit);
	//获取总数
	public Long getCount(String hql);
}
