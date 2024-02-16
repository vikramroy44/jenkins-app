package com.jwtExample.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwtExample.Entity.User;

@Service
public class UserService {
	
	public List<User> getAllUser(){
		
		List<User> list = new ArrayList<>();
		list.add(new User(111, "Vikram", "vikram@gmail.com"));
		list.add(new User(112, "ABCD", "abcd@gmail.com"));
		list.add(new User(113, "RAVI", "ravi@gmail.com"));
		
		return list;
		
	}

}
