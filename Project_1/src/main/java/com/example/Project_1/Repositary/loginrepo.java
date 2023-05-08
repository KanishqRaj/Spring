package com.example.Project_1.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project_1.database.umodel;

public interface loginrepo extends JpaRepository<umodel, Integer> {

	umodel findByuname(String uname);
}
