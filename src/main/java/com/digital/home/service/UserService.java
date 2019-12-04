package com.digital.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digital.home.model.User;
import com.digital.home.repository.UserRepository;

@Service
public class UserService {
	
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
		return null;
	}

	public User authenticateUser(User user, UserRepository authRepo) {
		return null;
	}

	public User confirmRegistration(String email, UserRepository authRepo) {
		return null;
	}

}
