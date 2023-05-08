package com.example.loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Models.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
