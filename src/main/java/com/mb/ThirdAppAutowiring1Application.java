package com.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mb.service.UserService;

@SpringBootApplication
public class ThirdAppAutowiring1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	= SpringApplication.run(ThirdAppAutowiring1Application.class, args);
	UserService service = context.getBean(UserService.class);
	service.getUserName(100);
	}

}
