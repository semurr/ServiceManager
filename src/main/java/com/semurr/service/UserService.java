package com.semurr.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Service;

import com.semurr.dao.HashException;
import com.semurr.model.User;

@WebService
public interface UserService {
	
	@WebMethod
	public User findUserById(long accountId);
	
	@WebMethod
	public String createUser(User user) throws HashException;

}
