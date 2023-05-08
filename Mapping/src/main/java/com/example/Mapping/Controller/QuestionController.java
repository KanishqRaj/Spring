package com.example.Mapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mapping.Model.Question;
import com.example.Mapping.Repository.QuestionRepo;

@RestController
@RequestMapping("otm")
public class QuestionController {
	
	@Autowired
	public QuestionRepo qrep;
	
	@PostMapping
	public String saveDetails(@RequestBody Question q)
	{
		qrep.save(q);
		return "Data is saved";
	}
	
	@GetMapping
	public List<Question> getDetails()
	{
		return qrep.findAll();
	}
}
