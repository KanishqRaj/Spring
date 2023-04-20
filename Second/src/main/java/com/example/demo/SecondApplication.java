package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(SecondApplication.class, args);
		
		person p = new person(1,"Kanishq","20");
		ObjectMapper obj = new ObjectMapper();
		String json = obj.writeValueAsString(p);
		System.out.print(json);
	}

}
