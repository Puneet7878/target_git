package com.dependent.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Autowired
	
	private Student s1;
	
	@Bean
	public void test() {
		s1.setAge(950);
	System.out.println("Student Name is:" +s1.getName());	
	System.out.println("Student Age is:" +s1.getAge());	
	}
}
