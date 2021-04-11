package com.example.AppController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	
	@RequestMapping(value="/hello")
	public String Hello() {
		return "Good Life $$$!!";
		
	}
}


