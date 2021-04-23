package com.Micro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Micro.entity.User;
import com.Micro.service.UserService;
import com.Micro.service.UserServiceImpl;

@RestController


@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("/{userId}")
	public @ResponseBody User getUser(@PathVariable("userId") Long userId)
	{
		
		User user = this.userservice.getUser(userId);
		List contacts  = this.resttemplate.getForObject("http://CONTACT-SERVICE/contact/user/" +userId,List.class);
		//http://localhost:9002/contact/user/1312
		//return this.userservice.getUser(userId);
		user.setContacts(contacts);
		
		return user;
	}
	
	
	

}
