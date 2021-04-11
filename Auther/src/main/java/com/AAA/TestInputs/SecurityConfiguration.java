package com.AAA.TestInputs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		String passwdAdmin = passwordEncoder().encode("admin345");
		String passwdUser = passwordEncoder().encode("user345");
		auth.inMemoryAuthentication().withUser("Admin").password(passwdAdmin).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("User").password(passwdUser).roles("User");

		
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

	@Override
	
	protected void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests().antMatchers("/access").hasAnyRole("ADMIN" , "USER").
		antMatchers("/edit").hasRole("ADMIN").
		antMatchers("/delete").hasRole("ADMIN").
		antMatchers("/add").hasAnyRole("ADMIN","USER").
		antMatchers("/view").hasAnyRole("ADMIN","USER").and().httpBasic();
	
	}
	
}
