package com.example.loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
