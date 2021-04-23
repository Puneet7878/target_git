package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list = List.of(
			new Contact(1L, "puneet.mbt@gmail.com","Puneet"   , 1311L),
			new Contact(2L,  "Aftab12@gmail.com","Aftab"   , 1312L),
			new Contact(3L, "Ramlal89@gmail.com","Ramlal"   , 1314L)
			
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId)
	{
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
		
	}

}