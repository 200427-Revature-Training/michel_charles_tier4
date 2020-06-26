package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.User;
import com.revature.services.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user) {
		return userService.update(user);
	}
	
	@PutMapping
	public User deleteUser(@RequestBody User user) {
		return userService.delete(user);
	}
	
	@GetMapping("/{username}")
	public User getUserByUsername(@PathVariable String username) {
		return userService.findUserByUsername(username);
	}
	
	@GetMapping("/{credentials}")
	public User getUserByCredentials(@PathVariable String credentials) {
		return userService.findUserByCredentials(credentials);
	}
	
	

}