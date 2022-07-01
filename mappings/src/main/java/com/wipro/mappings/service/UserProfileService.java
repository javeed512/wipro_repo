package com.wipro.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mappings.entities.UserProfile;
import com.wipro.mappings.repository.UserProfileRepository;

@Service
public class UserProfileService {

	@Autowired
	UserProfileRepository profileRepo;
	
	public UserProfile  addProfile(UserProfile profile) {
		
		
			return profileRepo.save(profile);
		
	}
	
	
	
	
}
