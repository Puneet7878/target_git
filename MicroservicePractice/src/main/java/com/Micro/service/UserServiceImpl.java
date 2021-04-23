package com.Micro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Micro.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	//fake user list
	
	List<User> list = List.of(
			
			new User(1311L ,"Puneet" , "879992"),
			new User(1312L , "Abhinav" , "979002"),
			new User(1314L  ,"Manujendra" ,  "189002")
			
			
			);
			
		

	@Override
	public User getUser(Long Id) {
		// TODO Auto-generated method stub
		
		return this.list.stream().filter(user->user.getUserId().equals(Id)).findAny().orElse(null);
		
	}
	
	

}
