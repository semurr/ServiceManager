package com.semurr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semurr.dao.UserDAO;
import com.semurr.model.User;

@Service
public class UserService {

	@Autowired
	UserDAO	userDao;

	public User findUserById(long accountId) {

		return userDao.find(accountId);

	}
	
	public void saveUser(User user){
		
		userDao.add(user);
		
	}
	
	public void update(User user){
		userDao.update(user);
	}
}