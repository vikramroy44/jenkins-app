package com.quizService.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quizService.Entity.Quiz;
import com.quizService.Service.QuizServiceImpl;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	private QuizServiceImpl quizServiceImpl;

	public QuizController(QuizServiceImpl quizServiceImpl) {
		super();
		this.quizServiceImpl = quizServiceImpl;
	}
	
	
	
	//create Quiz
	@PostMapping
	public Quiz addQuiz(@RequestBody Quiz quiz) {
		return quizServiceImpl.addQuiz(quiz);
	}
	
	
	//getAllQuiz
	@GetMapping
	public List<Quiz> getAllQuiz(){
		return quizServiceImpl.getAllQuiz();
	}
	
	
	//getOneQuiz
	@GetMapping("/{id}")
	public Quiz getOneQuiz(@PathVariable int id) {
		return quizServiceImpl.getOneQuiz(id);
	}
	

}
