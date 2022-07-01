package com.wipro.mappings;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.wipro.mappings.entities.User;
import com.wipro.mappings.entities.UserProfile;
import com.wipro.mappings.service.UserProfileService;

@SpringBootTest
class MappingsApplicationTests {

	@Autowired
	private UserProfileService service;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Test
	public void  testProfile() {
		
		
		
ResponseEntity<User> response = restTemplate.getForEntity("http://localhost:8080/api/v1/users/getuser/7", User.class);
			
			User user =	response.getBody();
		
			System.out.println(user);
			
		UserProfile profile = new UserProfile();
		
			profile.setCity("Hyderabad");
			profile.setAge(30);
			profile.setState("TS");
			
			profile.setUser(user);
	
			
		
	UserProfile profile1 =	service.addProfile(profile);
		
	System.out.println(profile1);
	}
	
	
}
