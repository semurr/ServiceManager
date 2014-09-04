package com.semurr.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.semurr.dao.BaseDAO;

@Repository
public class BaseDAOImpl<T> implements BaseDAO<T> {

	@Autowired
	SessionFactory		sessionFactory;

	private Class<T>	clazz;

	public void setClass(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Transactional
	public void add(T t) {

		sessionFactory.getCurrentSession().save(t);
	}

	@Transactional
	public void delete(T obj) {
		
		sessionFactory.getCurrentSession().delete(obj);
	}

	@Transactional
	public T find(long id) {

		return (T) sessionFactory.getCurrentSession().get(clazz, id);
	}

	@Transactional
	public void update(T t) {
		
		sessionFactory.getCurrentSession().update(t);	
	}

}
