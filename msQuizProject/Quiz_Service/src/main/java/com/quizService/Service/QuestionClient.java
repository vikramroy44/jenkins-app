package com.quizService.Service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quizService.Entity.Question;


@FeignClient(url = "http://localhost:8082/quest", value ="Question-Client")
public interface QuestionClient {
	
	@GetMapping("/quiz/{id}")
	List<Question> getQuestionByQuizId(@PathVariable int id);

}
