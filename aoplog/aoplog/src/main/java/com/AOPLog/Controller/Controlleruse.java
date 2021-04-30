package com.AOPLog.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AOPLog.Aspect.LogExecutionTime;
@RestController
public class Controlleruse {
	
	@GetMapping("/hello")
	 @LogExecutionTime
	 public ResponseEntity<String> getHello()
	{
	 return ResponseEntity.ok("Welcome");
	 }

}
