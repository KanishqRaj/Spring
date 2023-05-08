package com.example.Project_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project_1.Repositary.loginrepo;
import com.example.Project_1.database.umodel;

@Service
public class uservice {

	@Autowired
	private loginrepo repository;
	
	public String checkLogin(String uname, String pwd)
	{
		umodel user = repository.findByuname(uname);
		if(user == null)
		{
			return "User Not Found";
		}
		else
		{
			if(user.getPwd().equals(pwd))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public umodel addUser(umodel game)
	{
		return repository.save(game);
	}
	public List<umodel> getUser()
	{
		return repository.findAll();
	}
}
