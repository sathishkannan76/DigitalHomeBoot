package com.digital.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digital.home.model.User;
import com.digital.home.repository.UserRepository;

@Service
public class UserService {
	
	EmailService emailService = new EmailService();
	
	public List<User> getUsers(UserRepository userRepo){
		return userRepo.findAll();
	}
	
	public User toggleUserStatus(UserRepository userRepo, User user) {
		user.setUserStatus(!user.getUserStatus());
		return userRepo.save(user);
	}
	
	public User getUser(UserRepository userRepo, User user) {
		return null;
	}

	public User registerUser(User user, UserRepository authRepo) {
		User registeredUser = null;
		if(authRepo.findByEmail(user.getEmail()) == null) {
			registeredUser = authRepo.save(user);
			emailService.sendEmail(registeredUser);
		}
		System.out.println("registeredUser -> " + registeredUser);
		return registeredUser;
	}

	public User authenticateUser(User user, UserRepository authRepo) {
		//return authRepo.findOne(user.getUserId());
				return authRepo.findByEmail(user.getEmail());	}

	public User confirmRegistration(String email, UserRepository authRepo) {
		return authRepo.findByEmail(email);
	}

}
