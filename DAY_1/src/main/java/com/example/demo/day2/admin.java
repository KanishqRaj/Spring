package com.example.demo.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class admin {
	
	
	@RequestMapping("/hi")
	@ResponseBody
	public String welcome()
	{
		return "HI BRO";
	}

}
