package com.questionService.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questionService.Entity.Question;
import com.questionService.Repository.QuestionRepo;

@Service
public class QuestionServiceImp  implements QuestionService{
	

	private QuestionRepo questRepo;
	

	public QuestionServiceImp(QuestionRepo questRepo) {
		super();
		this.questRepo = questRepo;
	}

	@Override
	public Question addQuest(Question quest) {
		// TODO Auto-generated method stub
		return questRepo.save(quest);
	}

	@Override
	public List<Question> getQuest() {
		// TODO Auto-generated method stub
		return questRepo.findAll();
	}

	@Override
	public Question getOneQuest(int questionId) {
		// TODO Auto-generated method stub
		return questRepo.findById(questionId).orElseThrow(()-> new RuntimeException("Question not found in DB by ID :" + questionId ));
	}

	@Override
	public List<Question> getQuizQuest(int id) {
		// TODO Auto-generated method stub
		return questRepo.quizId(id);
	}

}
