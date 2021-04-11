package com.dependent.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private int age;
	
	
	/*
	 * public Student(String name, int age) { super(); this.name = name; this.age =
	 * age; }
	 */

	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
