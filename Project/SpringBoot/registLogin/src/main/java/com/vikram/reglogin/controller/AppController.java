package com.vikram.reglogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	
	@GetMapping("/index")
	public  String test() {
		
		return "home";
	}
	
	@GetMapping("/registration")
	public String registration() {
		return "registrationPage";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "loginPage";
	}

}
