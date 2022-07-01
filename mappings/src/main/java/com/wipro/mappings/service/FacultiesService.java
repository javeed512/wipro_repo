package com.wipro.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mappings.entities.Faculties;
import com.wipro.mappings.repository.FacultiesRepository;

@Service
public class FacultiesService {

	@Autowired
	private  FacultiesRepository repo;
	
	
	public   Faculties addFaculties(Faculties faculty) {
		
		
		return  repo.save(faculty);
		
		
	}
	
	
	
	
}
