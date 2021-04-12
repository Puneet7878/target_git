package com.Session_3_Spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/access")
	public String adminAccess() {
		
		return "Admin & User both can access this API";
	}
	
	@GetMapping("/edit")
	public String adminEdit() {
		
		return "Admin can Edit the data";
	}
	
	@GetMapping("/delete")
	public String adminDelete() {
		
		return "Admin can delete the data";
	}
	
	@GetMapping("/add")
	public String userAdd() {
		
		return "Admin & User both can add to the data";
	}
	
	@GetMapping("/view")
	public String userview() {
		
		return "Admin & User both can view the data";
	}
	
}
