package com.dependent.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigStudent {

	@Bean
	public String name()
	{
		
		return "Avengers";
	}
	
	/*
	 * @Bean public int age() {
	 * 
	 * return 800; }
	 */
	
	
}
