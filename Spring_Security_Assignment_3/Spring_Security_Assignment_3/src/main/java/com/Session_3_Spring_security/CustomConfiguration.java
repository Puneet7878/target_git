package com.Session_3_Spring_security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class CustomConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		String passDecoded1 = passwordEncoder().encode("@123");
		String passDecoded2 = passwordEncoder().encode("@321");
		
		auth.inMemoryAuthentication().withUser("Harsh").password(passDecoded1).roles("ADMIN")
		.and()
		.withUser("Preet").password(passDecoded2).roles("USER");
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/access").hasAnyRole("ADMIN", "USER")
								.antMatchers("/edit").hasRole("ADMIN")
								.antMatchers("/delete").hasRole("ADMIN")
								.antMatchers("/add").hasAnyRole("ADMIN", "USER")
								.antMatchers("/view").hasAnyRole("ADMIN", "USER")
								.and().httpBasic();		
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
