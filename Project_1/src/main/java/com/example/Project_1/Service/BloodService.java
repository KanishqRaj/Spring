package com.example.Project_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	
	public List<Donorinfo> sortDesc(String donorname)
	{
		return brepo.findAll(Sort.by(donorname).descending());
	}
	
	public List<Donorinfo> paginationData(int pageNu, int pageSize)
	{
		Page<Donorinfo> p = brepo.findAll(PageRequest.of(pageNu, pageSize));
		return p.getContent();
	}
	
	public List<Donorinfo> paginationAndSorting(int pnu, int psize, String donorname)
	{
		Page<Donorinfo> p = brepo.findAll(PageRequest.of(pnu, psize,Sort.by(donorname).descending()));
		return p.getContent();
	}
	
	
}
