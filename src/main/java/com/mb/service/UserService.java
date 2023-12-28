package com.mb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mb.dao.UserDao;

@Component
public class UserService {
//	using field injection (reflection) but its not recommended,because ioc container ll violate oops concept
	@Autowired
//	@Qualifier("oracle")
	private UserDao dao;
//	public UserService() {
//		System.out.println("user service default constructor");
//	}
	
//	constructor autowiring
//	@Autowired
//	public UserService(UserDao dao) {
//		System.out.println("user service parameterized constructor");
//		this.dao = dao;
//	}
	
//	Autowiring setter method
//	@Autowired
//	public void setDao(UserDao dao) {
//		System.out.println("set Dao");
//		this.dao = dao;
//	}


	public void getUserName(Integer id) { 
		System.out.println("dependent :: "+ dao.getClass().getName());
		String name = dao.findNameById(id);
		System.out.println(name);
	}

}
