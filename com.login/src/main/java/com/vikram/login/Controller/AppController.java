package com.vikram.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vikram.login.Entity.User;
import com.vikram.login.Repository.UserRepository;

@Controller
public class AppController {
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/index")
	public  String test() {
		
		return "home";
	}
	
	@GetMapping("/registration")
	public String registrationPage() {
		return "registrationPage";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "loginPage";
	}
   
	@PostMapping("/register")
	@ResponseBody
	public String registerUser(@ModelAttribute("user") User user) {
		userRepository.save(user);
		System.out.println(user);
		return "success";
		
	}
	
	@PostMapping("/login")
	@ResponseBody
	public String loginUser(@RequestParam("email") String email,
			@RequestParam("password") String password) {
		           User dbUser = userRepository.findByEmail(email);
		           if(dbUser.getPassword().equals(password)) {
				      return "Login Successull";
		           }
		           else {
		        	   return "User Name and Password not Matched";
		           }
		
	}
}
