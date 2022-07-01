package com.wipro.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mappings.entities.Courses;
import com.wipro.mappings.repository.CoursesRepository;

@Service
public class CoursesService {

	@Autowired
	CoursesRepository repo;
	
	
	
	public Courses    addCourses(Courses course) {
		
		return repo.save(course);
		
	}
	
}
