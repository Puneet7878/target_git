package com.Session_3_Spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Assignment3Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment3Application.class, args);
	}

}
