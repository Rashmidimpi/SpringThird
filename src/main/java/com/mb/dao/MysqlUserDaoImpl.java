package com.mb.dao;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MysqlUserDaoImpl implements UserDao {
	public MysqlUserDaoImpl() {
		System.out.println("mysql :: constructor");
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
