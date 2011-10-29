package com.swyma.extssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.swyma.extssh.dao.UserDao;
import com.swyma.extssh.model.User;

/**
 * 
 * @author swyma
 *
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void delUser(User user) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().delete(user);
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		List users=super.getHibernateTemplate().find("from User user where user.id='"+id+"'");
		if(users.size()>0){
			return (User)users.get(0);
		}
		return null;
	}

	public List getUser(String username, String password) {
		// TODO Auto-generated method stub
		return super.getHibernateTemplate().find("from User user where user.username='"+username+"' and user.password='"+password+"'");
		
	}

	public List getUsers() {
		// TODO Auto-generated method stub
		List users=super.getHibernateTemplate().find("from User user");
		return users;
	}

	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return (Integer)super.getHibernateTemplate().save(user);
	}

	public List getUser(String hql,int start,int limit){
		return super.getHibernateTemplate().getSessionFactory().openSession().createQuery(hql).setFirstResult(start).setMaxResults(limit).list();
	}
	
	public Long getCount(String hql){
		return (Long)super.getHibernateTemplate().getSessionFactory().openSession().createQuery(hql).uniqueResult();
	}
}
