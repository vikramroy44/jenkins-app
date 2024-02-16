package com.quizService.Service;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quizService.Entity.Quiz;
import com.quizService.Repository.QuizRepo;

@Service
public class QuizServiceImpl implements QuizService {
	

  private QuestionClient questionClient;	
  private QuizRepo quizRepo;

	

	public QuizServiceImpl(QuestionClient questionClient, QuizRepo quizRepo) {
	super();
	this.questionClient = questionClient;
	this.quizRepo = quizRepo;
}

	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> getAllQuiz() {
		// TODO Auto-generated method stub
		 List<Quiz> quizs = quizRepo.findAll();
		List<Quiz> quizss= quizs.stream().map(qz -> {
			qz.setQuestion(questionClient.getQuestionByQuizId(qz.getId()));
		    return qz;
		}).collect(Collectors.toList());
		// qz.setQuestion(questionClient.getQuestionByQuizId(qz.getId()))).collect(Collectors.toList());
		return quizss;
	}

	@Override
	public Quiz getOneQuiz(int id) {
		// TODO Auto-generated method stub
		 Quiz quiz = quizRepo.findById(id).orElseThrow(()-> new RuntimeException("No Quiz Found for Id:" + id));
		 quiz.setQuestion(questionClient.getQuestionByQuizId(quiz.getId()));
		 
		 return quiz;
		 
	}

}
