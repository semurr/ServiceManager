package com.semurr.service.impl;

import java.security.NoSuchAlgorithmException;

import javax.annotation.PostConstruct;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.semurr.dao.HashException;
import com.semurr.dao.UserDAO;
import com.semurr.database.Encryption;
import com.semurr.model.User;
import com.semurr.service.UserService;


@Service
@WebService(endpointInterface = "com.semurr.service.UserService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO	userDao;

	public User findUserById(long accountId) {

		return userDao.find(accountId);

	}

	public String createUser(User user) throws HashException {			

		try {
			user.setUserpassword(Encryption.hashSha256(user.getSalt(),
					user.getUserpassword()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new HashException("unable to hash password for account: "
					+ user.getUsername());
		}	
		
		userDao.add(user);
		
		return user.getUsername();
	}	
}