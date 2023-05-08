package com.example.Mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mapping.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
