package com.jwtExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtExample.Entity.User;
import com.jwtExample.Service.UserService;

@RestController
@RequestMapping("/home")
public class JWTController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUser(){
		System.out.println("Controller Invoked");
	return	userService.getAllUser();
	}

}
