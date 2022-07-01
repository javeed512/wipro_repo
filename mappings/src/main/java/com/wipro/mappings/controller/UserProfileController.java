package com.wipro.mappings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mappings.entities.UserProfile;
import com.wipro.mappings.service.UserProfileService;

@RestController
@RequestMapping("/api/v1/profiles")
public class UserProfileController {

	@Autowired
	private  UserProfileService service;
	
	@PostMapping("/add-profile")
	public UserProfile addProfile(@RequestBody UserProfile profile) {
		
		return service.addProfile(profile);
		
	}
	
	
}
