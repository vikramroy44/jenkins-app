package com.questionService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.questionService.Entity.Question;

@EnableJpaRepositories
public interface QuestionRepo extends JpaRepository<Question, Integer> {
	// For Custom method: here method name and prop name in Entity should be same
	List<Question> quizId(int quizId);

}
