package com.wipro.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mappings.entities.User;
import com.wipro.mappings.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	
	public  User  addUser(User user) {
		
		
		return  userRepo.save(user);
		
	}
	
	
	public User  getUserById(int uid) {
		
		
		return userRepo.findById(uid).orElse(null);
		
	}

}
