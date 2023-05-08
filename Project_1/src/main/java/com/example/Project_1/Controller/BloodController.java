package com.example.Project_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project_1.Repositary.bloodrepo;
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
	
	@DeleteMapping("/deleteByReq")
	public String deleteByRequestPara(@RequestParam("donorid") int did)
	{
		bs.deleteInfo(did);
		return "DonorId" + did + "Deleted";
	}
	
	@GetMapping("/sortDes/{donorname}")
	public List<Donorinfo> sortName (@PathVariable("donorname") String donorname)
	{
		return bs.sortDesc(donorname);
	}
	
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<Donorinfo> paginationData(@PathVariable("pnu") int pnu, @PathVariable("psize") int psize)
	{
		return bs.paginationData(pnu, psize);
	}
	
	@GetMapping("/paginationSorting/{pnu}/{psize}/{donorname}")
	public List<Donorinfo> paginationAndSorting(@PathVariable("pnu") int pnu, @PathVariable("psize")int psize,@PathVariable("donorname") String donorname)
	{
		return bs.paginationAndSorting(pnu, psize, donorname);
	}
	
	@Autowired
	public bloodrepo brp;
	
	@GetMapping("save")
	public List<Donorinfo> getD()
	{
		return brp.getAllData();
	}
	
	@GetMapping("byDonorName/{id}")
	public List<Donorinfo> getName(@PathVariable("id") int did)
	{
		return brp.byDonorName(did);
	}
	
}



