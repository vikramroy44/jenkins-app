package com.questionService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionService.Entity.Question;
import com.questionService.Services.QuestionServiceImp;

@RestController
@RequestMapping("/quest")
public class QuestionController {
	
	
	private QuestionServiceImp questionServiceImp;
	
	
	public QuestionController(QuestionServiceImp questionServiceImp) {
		super();
		this.questionServiceImp = questionServiceImp;
	}

	//create 
	@PostMapping
	public Question addQuestion(@RequestBody Question quest) {
		return questionServiceImp.addQuest(quest);
	}
	
	//getAll
	@GetMapping
	List<Question> getAll(){
		return questionServiceImp.getQuest();
	}
	
	//getOne
	@GetMapping("/{id}")
	Question getOne(@PathVariable int id) {
		return questionServiceImp.getOneQuest(id);
	}
	
	//getAllByQuizId
	@GetMapping("/quiz/{id}")
	List<Question> getQuestionByQuizId(@PathVariable int  id){
		return questionServiceImp.getQuizQuest(id);
	}

}
