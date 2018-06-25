package com.thinkxfactor.zomatoplus.controller;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;




@RestController
@RequestMapping("/user")
public class UserController {
 
	

	@GetMapping("/login")
	public User userLogin(@RequestParam("username") String username ,
			@RequestParam("password") String password) {
		User usr= new User();
		usr.setUsername(username);
		usr.setPassword(password);
		return usr;
	}
	@GetMapping("/all")
	public List<User> userList() {
		List<User>  users =  new ArrayList();
		User usr1,usr2,usr3;
		usr1=new User("Arya","abcd");
		usr2=new User("Joey","abc");
		usr3=new User("Joey","abc");
		users.add(usr1);
		users.add(usr2);
		users.add(usr3);
		return users;
		
	}
	@PostMapping("/create")
	public User userCreate(@RequestBody  User user) {
		System.out.println(user.toString());
		return user;
	}

	

}
