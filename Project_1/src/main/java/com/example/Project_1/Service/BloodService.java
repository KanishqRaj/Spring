package com.example.Project_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project_1.Repositary.bloodrepo;
import com.example.Project_1.database.Donorinfo;

@Service
public class BloodService {

	@Autowired
	public bloodrepo brepo;
	
	public Donorinfo saveInfo(Donorinfo od)
	{
		return brepo.save(od);
	}
	
	public List<Donorinfo> getDet()
	{
		return brepo.findAll();
	}
	
	public Donorinfo updateInfo(Donorinfo odi)
	{
		return brepo.saveAndFlush(odi);
	}
	
	public void deleteInfo(int donorid)
	{
		brepo.deleteById(donorid);
	}
}
