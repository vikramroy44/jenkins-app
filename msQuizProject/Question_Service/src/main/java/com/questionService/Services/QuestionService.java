package com.questionService.Services;

import java.util.List;

import com.questionService.Entity.Question;

public interface QuestionService {
	
	Question addQuest(Question qus);
	
	List<Question> getQuest();
	
	Question getOneQuest(int questionId);
	
	List<Question> getQuizQuest(int quizId);
	

}
