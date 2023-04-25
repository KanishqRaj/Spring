package com.example.Project_1.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Project_1.database.Donorinfo;

@Repository
public interface bloodrepo extends JpaRepository< Donorinfo , Integer> {

}
