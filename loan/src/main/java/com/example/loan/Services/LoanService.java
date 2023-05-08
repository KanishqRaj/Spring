package com.example.loan.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.Models.AdminModel;
import com.example.loan.Models.LoanApplicationModel;
import com.example.loan.Models.LoginModel;
import com.example.loan.Models.UserModel;
import com.example.loan.Repositories.AdminRepo;
import com.example.loan.Repositories.LoanApplicationRepo;
import com.example.loan.Repositories.LoginRepo;
import com.example.loan.Repositories.UserRepo;

@Service
public class LoanService {
	//User Model
		@Autowired
		public UserRepo urepo;
		
		public List<UserModel> getInfo()
		{
			return urepo.findAll();
		}
		
		public UserModel saveUser(UserModel um)
		{
			return urepo.save(um);
		}
		
		public UserModel updateUser(UserModel um)
		{
			return urepo.saveAndFlush(um);
		}
		
		public String deleteUser(int id)
		{
			urepo.deleteById(id);
			return "Deleted";
		}
		
		//AdminModel
		@Autowired
		public AdminRepo arepo;
		
		public List<AdminModel> getAdminInfo()
		{
			return arepo.findAll();
		}
		
		public AdminModel saveAdmin(AdminModel am)
		{
			return arepo.save(am);
		}
		
		public AdminModel updateAdmin(AdminModel am)
		{
			return arepo.saveAndFlush(am);
		}
		
		public String deleteAdmin(int userRole)
		{
			arepo.deleteById(userRole);
			return "Deleted";
		}
		
		public LoginRepo lrepo;
		//LoginModel
	     public LoginModel post3(LoginModel amodel4)
	     {
	    	 return lrepo.save(amodel4);
	     }
	     
	     public List<LoginModel> get3()
	     {
	    	 return lrepo.findAll();
	     }
	     
	     public LoginModel put3(LoginModel amodel5)
	     {
	    	 return lrepo.saveAndFlush(amodel5);
	     }
	     

	     public void delete3(int password)
	     {
	    	 lrepo.deleteById(password);
	     }

	     public LoanApplicationRepo loanrepo;
	 //LoanApplicationModel
	     public LoanApplicationModel post2(LoanApplicationModel amodel2)
	     {
	    	 return loanrepo.save(amodel2);
	     }
	     
	     public List<LoanApplicationModel> get2()
	     {
	    	 return loanrepo.findAll();
	     }
	     
	     public LoanApplicationModel put2(LoanApplicationModel amodel3)
	     {
	    	 return loanrepo.saveAndFlush(amodel3);
	     }
	     
	     public void delete2(int loanid)
	     {
	    	 loanrepo.deleteById(loanid);
	     }

}
