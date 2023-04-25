package com.example.Project_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project_1.Service.BloodService;
import com.example.Project_1.database.Donorinfo;

@RestController
public class BloodController {
	@Autowired
	public BloodService bs;
	
	@PostMapping("/savebloodinfo")
	public Donorinfo addDetails(@RequestBody Donorinfo d)
	{
		return bs.saveInfo(d);
	}
	@GetMapping("/getblood")
	public List<Donorinfo> getDetails()
	{
		return bs.getDet();
	}
	
	@PutMapping("/updateblood")
	public Donorinfo updatedetails(@RequestBody Donorinfo donorid)
	{
	   	return bs.updateInfo(donorid);
	}
	
	@DeleteMapping("deleteblood/{donorid}")
	public String deleteDetails(@PathVariable("donorid") int did)
	{
		bs.deleteInfo(did);
		return "DonorId" + did + "Deleted";
	}
}

