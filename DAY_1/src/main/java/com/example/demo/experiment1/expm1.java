package com.example.demo.experiment1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class expm1 {
	 
	@Value("${carname}")
	public String car;
	
	@GetMapping("/hello")
	
	public String display()
	{
		return "My car is "+car;
	}
}
	

  