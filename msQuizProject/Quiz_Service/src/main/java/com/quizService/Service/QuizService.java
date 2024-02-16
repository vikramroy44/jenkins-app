package com.quizService.Service;

import java.util.List;

import com.quizService.Entity.Quiz;

public interface QuizService {
	
     Quiz addQuiz(Quiz quiz);
     
     List<Quiz> getAllQuiz();
    
     Quiz  getOneQuiz(int id);

}
