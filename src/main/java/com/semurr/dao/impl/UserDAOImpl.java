package com.semurr.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.semurr.dao.UserDAO;
import com.semurr.model.User;

@Repository
public class UserDAOImpl extends GenericDAOImpl<User> implements UserDAO{

	UserDAOImpl(){
		this.setClass(User.class);		
	}

}
