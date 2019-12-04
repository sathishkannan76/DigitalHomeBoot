package com.digital.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digital.home.model.User;
import com.digital.home.repository.UserRepository;
import com.digital.home.service.UserService;

@CrossOrigin()
@RestController
public class UserController {

	@Autowired
	private UserRepository authRepo;
	
	private UserService authService = new UserService();
    
    @PostMapping("/")
	public User Home(@RequestBody User user) {
		return user;
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		System.out.println("Register user --> " + user);
		return authService.registerUser(user, authRepo);
	}
	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return authService.authenticateUser(user, authRepo);
	}
	
	@GetMapping("/confirmRegistration")
	public User confirmRegistration(@RequestParam(value="email") String email) {
		System.out.println(email);
		return authService.confirmRegistration(email, authRepo);
	}
}