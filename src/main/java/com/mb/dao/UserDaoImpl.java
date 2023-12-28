package com.mb.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")
@Primary
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		System.out.println("userdaoimpl constructoe");
	}
	@Override
	public String findNameById(Integer id) {
		if(id == 100) {
			return "Rashmi";
		}else if(id == 200) {
			return "Pranita";
		}
		return null;
	}

}
