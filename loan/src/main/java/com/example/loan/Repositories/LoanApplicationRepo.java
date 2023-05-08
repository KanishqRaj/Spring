package com.example.loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Models.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
