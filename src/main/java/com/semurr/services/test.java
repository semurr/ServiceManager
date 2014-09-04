package com.semurr.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.semurr.dao.UserDAO;
import com.semurr.dao.impl.UserDAOImpl;
import com.semurr.model.User;

@Controller
public class test {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView temp(){
		
		User user = new User();
		
		user.setUseremail("one");
		user.setUsername("two");
		user.setUserpassword("three");
		user.setUserid(2);
		
		
		
		
		
		//userService.saveUser(user);
		//userService.deleteUser(user);
		//userService.update(user);
		
		return new ModelAndView("index");
	}
	
	

}
