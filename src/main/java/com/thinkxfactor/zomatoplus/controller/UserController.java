package com.thinkxfactor.zomatoplus.controller;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomato.repository.UserRepository;
import com.thinkxfactor.zomatoplus.models.User;




@RestController
@RequestMapping("/user")
public class UserController {
 @Autowired
	private UserRepository userRepository;
	

	
	@PostMapping("/add")
	public User addUser(@RequestBody User usr) {
	User persistedUser=userRepository.save(usr);
	return persistedUser;}
@GetMapping("/getAll")
public List<User> getAll()

{
	List<User> listofusers=userRepository.findAll();
	return listofusers;
}
@PostMapping("/login")
public User getlogin(@RequestBody User usr)

{ String name=usr.getName();
String password=usr.getPassword();
	User us=userRepository.findByNameAndPassword(name, password);
	return us;
}
}
