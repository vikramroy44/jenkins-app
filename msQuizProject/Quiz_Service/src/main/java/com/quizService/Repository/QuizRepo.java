package com.quizService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizService.Entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
