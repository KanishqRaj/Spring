package com.example.Project_1.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project_1.Service.uservice;
import com.example.Project_1.database.umodel;

@RestController
@RequestMapping("/games")
public class ucontroller {
	@Autowired
	private uservice service;             
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> loginData)
	{
		String uname = loginData.get("uname");
		String pwd = loginData.get("pwd");
		String result = service.checkLogin(uname, pwd);
		return result;
	}
	@PostMapping("/adduser")
	public umodel AddUser(@RequestBody umodel game )
	{
		return service.addUser(game);
	}
	@GetMapping
	public List<umodel> listAll()
	{
		return service.getUser();
	}
}
