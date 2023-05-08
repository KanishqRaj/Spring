package com.example.loan.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.Models.UserModel;
import com.example.loan.Models.AdminModel;
import com.example.loan.Models.LoanApplicationModel;
import com.example.loan.Models.LoginModel;
import com.example.loan.Services.LoanService;

@RestController
public class LoanController {

	@Autowired
	public LoanService lservice;
	
	//User
	@GetMapping("user/getProfile")
	public List<UserModel> getAll()
	{
		return lservice.getInfo();
	}
	
	@PostMapping("user/saveUser")
	public UserModel signUp(@RequestBody UserModel um)
	{
		return lservice.saveUser(um);
	}
	
	@PutMapping("user/updateUser")
	public UserModel updateUser (@RequestBody UserModel um)
	{
		return lservice.updateUser(um);
	}
	
	@DeleteMapping("user/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		lservice.deleteUser(id);
		return "Deleted";
	}
	
	//Admin
	
	@GetMapping("admin/getAdmin")
	public List<AdminModel> getAdmin()
	{
		return lservice.getAdminInfo();
	}
	
	@PostMapping("admin/saveAdmin")
	public AdminModel signUp(@RequestBody AdminModel um)
	{
		return lservice.saveAdmin(um);
	}
	
	@PutMapping("admin/updateAdmin")
	public AdminModel updateAdmin (@RequestBody AdminModel um)
	{
		return lservice.updateAdmin(um);
	}
	
	@DeleteMapping("admin/deleteAdmin/{userRole}")
	public String deleteAdmin(@PathVariable("userRole") int userRole)
	{
		lservice.deleteAdmin(userRole);
		return "Deleted";
	}
	
	//LoanApplicationModel
	   
		@PostMapping("/post2")
		public LoanApplicationModel postD1(LoanApplicationModel amodel3)
		{
			return lservice.post2(amodel3);
		}
		@GetMapping("/get2")
		public List<LoanApplicationModel> getD1()
		{
			return lservice.get2();
		}
		@PutMapping("/put2")
		public LoanApplicationModel putD1(LoanApplicationModel amodel4)
		{
			return lservice.put2(amodel4);
		}
		@DeleteMapping("/del2/{cid}")
		public String deleteD1(@PathVariable("cid") int loanid)
		{
			lservice.delete2(loanid);
			return "Deleted";
		}
		
		//LoginModel
		@PostMapping("/post3")
		public LoginModel postD2(LoginModel amodel5)
		{
			return lservice.post3(amodel5);
		}
		@GetMapping("/get3")
		public List<LoginModel> getD2()
		{
			return lservice.get3();
		}
		@PutMapping("/put3")
		public LoginModel putD2(LoginModel amodel6)
		{
			return lservice.put3(amodel6);
		}
		@DeleteMapping("/del3/{apass}")
		public String deleteD2(@PathVariable ("apass")int password)
		{
			lservice.delete3(password);
			return "Deleted";
		}

	
	
}
